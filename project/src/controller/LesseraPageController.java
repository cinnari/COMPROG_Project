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

public class LesseraPageController {

    @FXML
    private Button dewyButton;
    @FXML
    private Button dustyButton;
    @FXML
    private Button bloodyButton;
    @FXML
    private Button sseraCartButton;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private double totalAmount;

    public void itemAdded(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Item Added.",
                "Item added! Please visit checkout to add more of this item, if you so desire.");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        // ginawa ko munang comment etong below since wala pa naman ginagawa for
        // checkout
        /*
         * if (sourceButton.equals(dewyButton)) {
         * blamp.setProductStatus(true);
         * CheckoutController.addItem(CheckoutController.pane1);
         * }
         * 
         * else if (sourceButton == dustyButton) {
         * clamp.setProductStatus(true);
         * CheckoutController.addItem(CheckoutController.pane2);
         * }
         * 
         * else if (sourceButton == bloodyButton) {
         * wlamp.setProductStatus(true);
         * CheckoutController.addItem(CheckoutController.pane3);
         * }
         */

    }

    public void dewyAddToCart(ActionEvent event) throws Exception {

        totalAmount = totalAmount + 3000.00;
        itemAdded(event);

    }

    public void dustyAddToCart(ActionEvent event) throws Exception {
        totalAmount = totalAmount + 3000.00;
        itemAdded(event);
    }

    public void bloodyAddToCart(ActionEvent event) throws Exception {
        totalAmount = totalAmount + 3000.00;
        itemAdded(event);
    }

    public void sseraCheckCart(ActionEvent event) throws Exception {

        // FXMLLoader loader = new
        // FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
        // root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(HomeController.homeRoot, 1200, 800);
        stage.setScene(scene);
        stage.show();
    }

}