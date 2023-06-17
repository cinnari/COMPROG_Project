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
import model.LesseraBloodyVersion;
import model.LesseraDewyVersion;
import model.LesseraDustyVersion;
import javafx.scene.Node;
import javafx.scene.Parent;

public class LesseraPageController implements Initializable {

    @FXML
    private Button dewyButton;
    @FXML
    private Button dustyButton;
    @FXML
    private Button bloodyButton;
    @FXML
    private Button sseracartbutton;
    @FXML
    private Button gotoEnhypenPage;

    @FXML
    Label sseraname1, sseraname2, sseraname3, sseraset1, sseraset2, sseraset3, sserapeso1, sserapeso2, sserapeso3, sseraprice1, sseraprice2, sseraprice3;

    @FXML
    ImageView sseraimg1, sseraimg2, sseraimg3;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    static Parent root = null;
    
    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;


    static LesseraDewyVersion dewy = new LesseraDewyVersion();
    static LesseraDewyVersion dewyset = new LesseraDewyVersion();
    static LesseraDewyVersion dewypeso = new LesseraDewyVersion();
    static LesseraDustyVersion dusty = new LesseraDustyVersion();
    static LesseraDustyVersion dustyset = new LesseraDustyVersion();
    static LesseraDustyVersion dustypeso = new LesseraDustyVersion();
    static LesseraBloodyVersion bloody = new LesseraBloodyVersion();
    static LesseraBloodyVersion bloodyset = new LesseraBloodyVersion();
    static LesseraBloodyVersion bloodypeso = new LesseraBloodyVersion();

     @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== dewy VERSION ==================//
        dewy.setProductName("LE SERRAFIM UNFORGIVEN PHOTOCARD");
        dewyset.setProductName("(DEWY SET)");
        dewypeso.setProductName("₱");
        sseraname1.setText(dewy.getProductName());
        sseraset1.setText(dewyset.getProductName());
        sserapeso1.setText(dewypeso.getProductName());


        dewy.setProductPrice(1500);
        sseraprice1.setText(Integer.toString(dewy.getProductPrice()));

        dewy.setProductImage("images/lessera1.png");
        Image sseraDewy = new Image(dewy.getProductImage());
        sseraimg1.setImage(sseraDewy);

        // ============== dusty VERSION ==================//

        dusty.setProductName("LE SERRAFIM UNFORGIVEN PHOTOCARD");
        dustyset.setProductName("(DUSTY AMBER SET)");
        dustypeso.setProductName("₱");
        sseraname2.setText(dusty.getProductName());
        sseraset2.setText(dustyset.getProductName());
        sserapeso2.setText(dustypeso.getProductName());


        dusty.setProductPrice(1300);
        sseraprice2.setText(Integer.toString(dusty.getProductPrice()));

        dusty.setProductImage("images/lessera2.png");
        Image sseraDusty = new Image(dusty.getProductImage());
        sseraimg2.setImage(sseraDusty);

        // ============== bloody VERSION ==================//
        bloody.setProductName("LE SERRAFIM UNFORGIVEN PHOTOCARD");
        bloodyset.setProductName("(BLOODY SET)");
        bloodypeso.setProductName("₱");
        sseraname3.setText(bloody.getProductName());
        sseraset3.setText(bloodyset.getProductName());
        sserapeso3.setText(bloodypeso.getProductName());

        bloody.setProductPrice(1300);
        sseraprice3.setText(Integer.toString(bloody.getProductPrice()));

        bloody.setProductImage("images/lessera3.png");
        Image sseraBloody = new Image(bloody.getProductImage());
        sseraimg3.setImage(sseraBloody);

        // TODO Auto-generated method stub
        FXMLLoader loader = null;

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception

        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }


    public void itemAdded(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Item Added.",
                "Item added! Please visit checkout to add more of this item, if you so desire.");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
     if (sourceButton.equals(dewyButton)) {
            dewy.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }

        else if (sourceButton == dustyButton) {
            dusty.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane5);
        }

        else if (sourceButton == bloodyButton) {
            bloody.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane6);
        }
    }
        

    public void dewyButton(ActionEvent event) throws IOException {
        itemAdded(event);

    }

    public void dustyButton(ActionEvent event) throws IOException {
        itemAdded(event);
    }

    public void bloodyButton(ActionEvent event) throws IOException {
        itemAdded(event);
    }

    public void sseraCartBtn(ActionEvent event) throws IOException {

       Parent root = FXMLLoader.load(getClass().getResource("/view/Checkout.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(LesseraPageController.root, 1200, 800);
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

   



