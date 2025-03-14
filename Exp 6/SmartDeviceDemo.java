import java.util.Scanner;

interface WiFiEnabled {
    void connectToWiFi(String network);
    void disconnectWiFi();
}

interface BluetoothEnabled {
    void pairDevice(String deviceName);
    void unpairDevice();
}

class SmartSpeaker implements WiFiEnabled, BluetoothEnabled 
{
    private String connectedWiFi = null;
    private String pairedDevice = null;

    public void connectToWiFi(String network) {
        connectedWiFi = network;
        System.out.println("Connected to WiFi: " + network);
    }

    public void disconnectWiFi() {
        if (connectedWiFi != null) {
            System.out.println("Disconnected from WiFi: " + connectedWiFi);
            connectedWiFi = null;
        } else {
            System.out.println("No WiFi connected.");
        }
    }

    public void pairDevice(String deviceName) {
        pairedDevice = deviceName;
        System.out.println("Paired with Bluetooth device: " + deviceName);
    }

    public void unpairDevice() {
        if (pairedDevice != null) {
            System.out.println("Unpaired from Bluetooth device: " + pairedDevice);
            pairedDevice = null;
        } else {
            System.out.println("No Bluetooth device paired.");
        }
    }
    public void playMusic(String songName) {
        System.out.println("Playing: " + songName);
    }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating SmartSpeaker Object
        SmartSpeaker speaker = new SmartSpeaker();

        // Connecting to WiFi
        System.out.print("Enter WiFi Network Name: ");
        String wifiName = sc.nextLine();
        speaker.connectToWiFi(wifiName);

        // Pairing Bluetooth Device
        System.out.print("Enter Bluetooth Device Name: ");
        String btDevice = sc.nextLine();
        speaker.pairDevice(btDevice);

        // Playing Music
        System.out.print("Enter Song Name to Play: ");
        String song = sc.nextLine();
        speaker.playMusic(song);

        // Disconnect WiFi and Unpair Bluetooth
        speaker.disconnectWiFi();
        speaker.unpairDevice();

        sc.close();
    }
}
