package view;

import model.Currency;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class CurrencyView {

    private TextField amountField = new TextField();
    private TextField resultField = new TextField();

    private ComboBox<Currency> fromBox = new ComboBox<>();
    private ComboBox<Currency> toBox = new ComboBox<>();

    private Button convertButton = new Button("Convert");
    private Label messageLabel = new Label();

    public CurrencyView(Stage stage) {


        Label instructions = new Label(
                "Enter amount, select currencies and click Convert."
        );
        instructions.setWrapText(true);


        Label amountLabel = new Label("Enter amount:");
        Label fromLabel = new Label("From currency:");
        Label toLabel = new Label("To currency:");
        Label resultLabel = new Label("Converted amount:");


        amountField.setPromptText("Enter amount");
        resultField.setEditable(false);
        amountField.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().matches("\\d*(\\.\\d*)?")) {
                return change;
            }
            return null;
        }));


        fromBox.setPrefWidth(180);
        toBox.setPrefWidth(180);


        VBox fromLayout = new VBox(5, fromLabel, fromBox);
        VBox toLayout = new VBox(5, toLabel, toBox);


        HBox currencyLayout = new HBox(10, fromLayout, toLayout);


        VBox layout = new VBox(10);

        layout.setPadding(new Insets(20));

        layout.getChildren().addAll(
                instructions,
                amountLabel,
                amountField,
                currencyLayout,
                convertButton,
                resultLabel,
                resultField,
                messageLabel
        );


        Scene scene = new Scene(layout, 450, 350);
        scene.getStylesheets().add(
                getClass().getResource("/style.css").toExternalForm()
        );

        stage.setTitle("Currency Converter");
        stage.setScene(scene);
    }

    public TextField getAmountField() {
        return amountField;
    }

    public TextField getResultField() {
        return resultField;
    }

    public ComboBox<Currency> getFromBox() {
        return fromBox;
    }

    public ComboBox<Currency> getToBox() {
        return toBox;
    }

    public Button getConvertButton() {
        return convertButton;
    }

    public Label getMessageLabel() {
        return messageLabel;
    }
}