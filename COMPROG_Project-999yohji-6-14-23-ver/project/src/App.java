import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    // PLEASE NOTE THAT KULANG PA YUNG LOGIC SA CHECKOUT PAGES
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        primaryStage.setTitle("Seoul Station");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) throws Exception {

        launch(args);
    }

}
