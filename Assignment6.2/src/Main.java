import javafx.application.Application;
import javafx.stage.Stage;

import model.CurrencyModel;
import view.CurrencyView;
import controller.CurrencyController;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        CurrencyModel model = new CurrencyModel();

        CurrencyView view = new CurrencyView(stage);

        new CurrencyController(model, view);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}