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

public class LesseraPageController implements Initializable {

    @FXML
    Button dewyButton, dustyButton, bloodyButton, sseracartbutton, gotoEnhypenPage;

    @FXML
    Label sseraname1, sseraname2, sseraname3, sseraset1, sseraset2, sseraset3, sserapeso1, sserapeso2, sserapeso3, sseraprice1, sseraprice2, sseraprice3;

    @FXML
    ImageView sseraimg1, sseraimg2, sseraimg3;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root = null;
    
    FXMLLoader loader;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== dewy VERSION ==================//
        sseraname1.setText(HomeController.dewy.getProductName());
        sseraset1.setText(HomeController.dewyset.getProductName());
        sserapeso1.setText(HomeController.dewypeso.getProductName());
        sseraprice1.setText(Integer.toString(HomeController.dewy.getProductPrice()));
        Image sseraDewy = new Image(HomeController.dewy.getProductImage());
        sseraimg1.setImage(sseraDewy);

        // ============== dusty VERSION ==================//
        sseraname2.setText(HomeController.dusty.getProductName());
        sseraset2.setText(HomeController.dustyset.getProductName());
        sserapeso2.setText(HomeController.dustypeso.getProductName());
        sseraprice2.setText(Integer.toString(HomeController.dusty.getProductPrice()));
        Image sseraDusty = new Image(HomeController.dusty.getProductImage());
        sseraimg2.setImage(sseraDusty);

        // ============== bloody VERSION ==================//
        sseraname3.setText(HomeController.bloody.getProductName());
        sseraset3.setText(HomeController.bloodyset.getProductName());
        sserapeso3.setText(HomeController.bloodypeso.getProductName());
        sseraprice3.setText(Integer.toString(HomeController.bloody.getProductPrice()));
        Image sseraBloody = new Image(HomeController.bloody.getProductImage());
        sseraimg3.setImage(sseraBloody);

    }


    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Item Added.",
                "Item added! Please visit checkout to add more of this item, if you so desire.");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
     if (sourceButton.equals(dewyButton)) {
            HomeController.dewy.setProductStatus(true);
            HomeController.cart.addItem(HomeController.checkoutController.pane4);

        }

        else if (sourceButton == dustyButton) {
            HomeController.dusty.setProductStatus(true);
            HomeController.cart.addItem(HomeController.checkoutController.pane5);

        }

        else if (sourceButton == bloodyButton) {
            HomeController.bloody.setProductStatus(true);
            HomeController.cart.addItem(HomeController.checkoutController.pane6);
        }

        HomeController.cart.showItems();
    }

    public void sseraCartBtn(ActionEvent event) throws IOException {

        HomeController.checkoutController.showItems(HomeController.cart.getItemList());

        Scene scene = new Scene(HomeController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void gotoEnhaPage(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/EnhaPage.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}

   



