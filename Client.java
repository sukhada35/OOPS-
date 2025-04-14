import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Client {
    Socket socket; // This is the socket which will connect to the server

    BufferedReader in; // This is the input stream for the Server
    PrintWriter out; // This is the output stream for the Server

    public Client() {
        // This is the constructor of the class
        try {
            System.out.println("Sending request to server...");
            socket = new Socket("127.0.0.1", 7777); // This will connect to the server on port 7777
            System.out.println("Connection established...");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Taking the inputstream from the
                                                                                     // socket and giving it to the
                                                                                     // inputstreamreader
                                                                                     // (InputstreamReader will change
                                                                                     // the data in its corrector).Then
                                                                                     // the handling and buffer with be
                                                                                     // handled by BufferedReader.

            out = new PrintWriter(socket.getOutputStream());

            startReading();
            startWriting();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    // Multithreading is used here
    public void startReading() {
        // This is the thread which will read the data from the Server

        Runnable r1 = () -> {
            // This is a thread
            System.out.println("Reader started...");
            try {
                while (true) {

                    String msg = in.readLine(); // This will read the data from the Server

                    if (msg.equals("exit")) { // If the client sends exit then we will close the connection
                        System.out.println("Server terminated the connection...");
                        socket.close(); // This will close the socket
                        break;
                    }

                    System.out.println("Server: " + msg); // This will print the data from the server;

                }
            } catch (Exception e) {
                // TODO: handle exception
                // e.printStackTrace();
                System.out.println("Connection closed by Client..."); // This will print the data from the server;
            }
        };
        new Thread(r1).start(); // This will start the thread
    }

    public void startWriting() {
        // This is the thread which will write the data to the server
        Runnable r2 = () -> {
            // This is a thread
            System.out.println("Writer started...");
            try {
                while (!socket.isClosed()) { // This will check if the socket is closed or not

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // This will take the
                                                                                              // input from the user
                    String content = br.readLine(); // This will read the data from the user
                    out.println(content); // This will send the data to the server
                    out.flush(); // This will flush the data to the server
                    if (content.equals("exit")) { // If the client sends exit then we will close the connection
                        socket.close(); // This will close the socket
                        break;
                    }

                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        };
        new Thread(r2).start(); // This will start the thread
    }

    public static void main(String[] args) {
        System.out.println("Client is running...");
        createGUI(); // This creates the GUI window for client output
        new Client();
    }

    // GUI for displaying client-side logs and messages
    public static void createGUI() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Client Console"); // Creates a JFrame (main window) for the client console
            frame.setSize(500, 600); // Sets the frame size to 500x600 pixels
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures that the program exits when the window is closed
            frame.setLayout(new BorderLayout()); // Sets the layout of the frame to BorderLayout (NORTH, SOUTH, EAST, WEST, CENTER)

            JTextArea console = new JTextArea("Client console:\n"); // Creates a JTextArea to display the client's messages
            console.setFont(new Font("Consolas", Font.PLAIN, 14)); // Sets the font to "Consolas" (monospaced font) with a size of 14
            console.setBackground(new Color(20, 20, 20)); // Sets the background color to a dark shade (almost black)
            console.setForeground(Color.GREEN); // Sets the text color to green
            console.setEditable(false); // Makes the text area non-editable (users can't change the content)

            JScrollPane scroll = new JScrollPane(console); // Adds a JScrollPane to the JTextArea so that it's scrollable
            frame.add(scroll, BorderLayout.CENTER); // Adds the scrollable console area to the center of the window
            frame.setVisible(true); // Makes the frame visible to the user

            // Redirecting System.out and System.err to the JTextArea for displaying logs
            PrintStream guiStream = new PrintStream(new OutputStream() {
                public void write(int b) {
                    console.append(String.valueOf((char) b)); // Appends each character to the JTextArea
                    console.setCaretPosition(console.getDocument().getLength()); // Keeps the caret (cursor) at the bottom
                }
            });

            System.setOut(guiStream); // Redirects standard output to the JTextArea
            System.setErr(guiStream); // Redirects error output to the JTextArea
        });
    }
}
