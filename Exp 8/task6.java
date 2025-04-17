import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class task6 extends Application {
    private TextField display = new TextField();
    private double num1 = 0, num2 = 0;
    private String operator = "";

    @Override
    public void start(Stage primaryStage) {
        display.setEditable(false);
        display.setStyle("-fx-font-size: 18px");

        GridPane grid = new GridPane();
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int row = 0, col = 0;
        for (String bText : buttons) {
            Button btn = new Button(bText);
            btn.setPrefSize(60, 60);
            btn.setOnAction(e -> handleButtonClick(bText));
            grid.add(btn, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }

        VBox layout = new VBox(10, display, grid);
        layout.setStyle("-fx-padding: 20px");
        Scene scene = new Scene(layout, 280, 320);
        primaryStage.setTitle("JavaFX Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String value) {
        switch (value) {
            case "C":
                display.clear();
                operator = "";
                num1 = num2 = 0;
                break;
            case "=":
                num2 = Double.parseDouble(display.getText());
                double result = 0;
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num2 != 0 ? num1 / num2 : 0; break;
                }
                display.setText(String.valueOf(result));
                break;
            case "+": case "-": case "*": case "/":
                num1 = Double.parseDouble(display.getText());
                operator = value;
                display.clear();
                break;
            default:
                display.appendText(value);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
