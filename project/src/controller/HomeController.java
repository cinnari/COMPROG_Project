package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HomeController {

    @FXML
    private Button sseraHome;
    @FXML
    private Button enhaHome;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void enhaPageSwitch(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/EnhaPage.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1200, 800);
        stage.setScene(scene);
        stage.show();

    }

    public void sseraPageSwitch(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/LesseraPage.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1200, 800);
        stage.setScene(scene);
        stage.show();

    }

}