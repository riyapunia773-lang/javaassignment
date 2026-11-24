package view;

import controller.DictionaryController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class DictionaryView {

    public DictionaryView(Stage stage, DictionaryController controller) {

        Label title = new Label("Virtual Dictionary");

        Label instructions = new Label(
                "Enter a word and click Search."
        );

        TextField wordField = new TextField();
        wordField.setPromptText("Enter a word");
        wordField.setPrefWidth(280);

        Button searchButton = new Button("Search");

        Label meaningLabel = new Label("Meaning:");

        TextArea meaningArea = new TextArea();
        meaningArea.setEditable(false);
        meaningArea.setWrapText(true);
        meaningArea.setPrefWidth(360);
        meaningArea.setPrefHeight(120);

        searchButton.setOnAction(e -> {

            String word = wordField.getText();

            String meaning = controller.searchWord(word);

            meaningArea.setText(meaning);
        });

        FlowPane layout = new FlowPane();

        layout.setPadding(new Insets(20));
        layout.setHgap(10);
        layout.setVgap(15);

        layout.getChildren().addAll(
                title,
                instructions,
                wordField,
                searchButton,
                meaningLabel,
                meaningArea
        );

        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");
        title.setPrefWidth(360);
        instructions.setPrefWidth(360);

        Scene scene = new Scene(layout, 420, 320);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
    }
}