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
import alert.AlertMaker;

public class EnhaPageController {

    @FXML
    private Button fvButton;
    @FXML
    private Button hvButton;
    @FXML
    private Button nvButton;
    @FXML
    private Button enhaCartButton;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private double totalAmount;

    public void itemAdded(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Item Added.",
                "Item added! Please visit checkout to add more of this item, if you so desire.");
    }

    public void fvAddToCart(ActionEvent event) throws Exception {
        totalAmount = totalAmount + 3000.00;
        itemAdded(event);
    }

    public void hvAddToCart(ActionEvent event) throws Exception {
        totalAmount = totalAmount + 3000.00;
        itemAdded(event);
    }

    public void nvAddToCart(ActionEvent event) throws Exception {
        totalAmount = totalAmount + 3000.00;
        itemAdded(event);
    }

    public void enhaCheckCart(ActionEvent event) throws Exception {
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
        //root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(HomeController.homeRoot, 1200, 800);
        stage.setScene(scene);
        stage.show();
    }

}