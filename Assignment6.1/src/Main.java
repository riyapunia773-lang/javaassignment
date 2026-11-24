import javafx.application.Application;
import javafx.stage.Stage;

import model.Dictionary;
import controller.DictionaryController;
import view.DictionaryView;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Dictionary dictionary = new Dictionary();

        DictionaryController controller =
                new DictionaryController(dictionary);

        new DictionaryView(stage, controller);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}