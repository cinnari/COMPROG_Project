package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class EnhaPageController implements Initializable {

    @FXML
    Button fvButton, hvButton, nvButton, enhacartbtn, gotoLesseraPage;

    @FXML
    Label enhaname1, enhaname2, enhaname3, enhaset1, enhaset2, enhaset3, enhapeso1, enhapeso2, enhapeso3, enhaprice1, enhaprice2, enhaprice3;

    @FXML
    ImageView enhaimg1, enhaimg2, enhaimg3;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;

   

    @Override
    public void initialize(URL location, ResourceBundle resources) {

       // ============== FULL VERSION ==================//
        enhaname1.setText(HomeController.efull.getProductName());
        enhaset1.setText(HomeController.efullset.getProductName());
        enhapeso1.setText(HomeController.efullpeso.getProductName());
        enhaprice1.setText(Integer.toString(HomeController.efull.getProductPrice()));
        Image enhaFull = new Image(HomeController.efull.getProductImage());
        enhaimg1.setImage(enhaFull);

        // ============== HALF VERSION ==================//
        enhaname2.setText(HomeController.ehalf.getProductName());
        enhaset2.setText(HomeController.ehalfset.getProductName());
        enhapeso2.setText(HomeController.efullpeso.getProductName());
        enhaprice2.setText(Integer.toString(HomeController.ehalf.getProductPrice()));
        Image enhaHalf = new Image(HomeController.ehalf.getProductImage());
        enhaimg2.setImage(enhaHalf);

        // ============== NEW VERSION ==================//
        enhaname3.setText(HomeController.enew.getProductName());
        enhaset3.setText(HomeController.enewset.getProductName());
        enhapeso3.setText(HomeController.efullpeso.getProductName());
        enhaprice3.setText(Integer.toString(HomeController.enew.getProductPrice()));
        Image enhaNew = new Image(HomeController.enew.getProductImage());
        enhaimg3.setImage(enhaNew);
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Item Added.",
                "Item added! Please visit checkout to add more of this item, if you so desire.");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(fvButton)) {
            HomeController.efull.setProductStatus(true);
            HomeController.cart.addItem(HomeController.checkoutController.pane1);
        }

        else if (sourceButton == hvButton) {
            HomeController.ehalf.setProductStatus(true);
            HomeController.cart.addItem(HomeController.checkoutController.pane2);
        }

        else if (sourceButton == nvButton) {
            HomeController.enew.setProductStatus(true);
            HomeController.cart.addItem(HomeController.checkoutController.pane3);
        }

        HomeController.cart.showItems();
    }


    public void eCartButton(ActionEvent event) throws IOException {

        HomeController.checkoutController.showItems(HomeController.cart.getItemList());

        Scene scene = new Scene(HomeController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        
    }

    public void gotosseraPage(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/LesseraPage.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

}
