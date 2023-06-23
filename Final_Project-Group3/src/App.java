import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Seoul Station"); 
            stage.setResizable(false);
            stage.setScene(scene);

            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}