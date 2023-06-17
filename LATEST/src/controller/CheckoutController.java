package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class CheckoutController implements Initializable{

    @FXML
    VBox myvbox;

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6;

    @FXML
    Button enhapage, sserapage, checkout;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
   
    @FXML
    Label enhaname1, enhaname2, enhaname3, enhaset1, enhaset2, enhaset3, enhapeso1, enhapeso2, enhapeso3, enhaprice1, enhaprice2, enhaprice3, sserapeso1, sseraname1, sseraname2, sseraname3, sseraset1, sseraset2, sseraset3, sserapeso2, sserapeso3, sseraprice1, sseraprice2, sseraprice3;
    @FXML
    ImageView enhaimg1, enhaimg2, enhaimg3, sseraimg1, sseraimg2, sseraimg3;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        enhaname1.setText(EnhaPageController.efull.getProductName());
        enhaset1.setText(EnhaPageController.efullset.getProductName());
        enhapeso1.setText(EnhaPageController.efullpeso.getProductName());
        enhaprice1.setText(Integer.toString(EnhaPageController.efull.getProductPrice()));
        Image enhaFull = new Image(EnhaPageController.efull.getProductImage());
        enhaimg1.setImage(enhaFull);

        enhaname2.setText(EnhaPageController.ehalf.getProductName());
        enhaset2.setText(EnhaPageController.ehalfset.getProductName());
        enhapeso2.setText(EnhaPageController.ehalfpeso.getProductName());
        enhaprice2.setText(Integer.toString(EnhaPageController.ehalf.getProductPrice()));
        Image enhaHalf = new Image(EnhaPageController.ehalf.getProductImage());
        enhaimg2.setImage(enhaHalf);

        enhaname3.setText(EnhaPageController.enew.getProductName());
        enhaset3.setText(EnhaPageController.enewset.getProductName());
        enhapeso3.setText(EnhaPageController.enewpeso.getProductName());
        enhaprice3.setText(Integer.toString(EnhaPageController.enew.getProductPrice()));
        Image enhaNew = new Image(EnhaPageController.enew.getProductImage());
        enhaimg3.setImage(enhaNew);

        sseraname1.setText(LesseraPageController.dewy.getProductName());
        sseraset1.setText(LesseraPageController.dewyset.getProductName());
        sserapeso1.setText(LesseraPageController.dewypeso.getProductName());
        sseraprice1.setText(Integer.toString(LesseraPageController.dewy.getProductPrice()));
        Image sseraDewy = new Image(LesseraPageController.dewy.getProductImage());
        sseraimg1.setImage(sseraDewy);
        
        sseraname2.setText(LesseraPageController.dusty.getProductName());
        sseraset2.setText(LesseraPageController.dustyset.getProductName());
        sserapeso2.setText(LesseraPageController.dustypeso.getProductName());
        sseraprice2.setText(Integer.toString(LesseraPageController.dusty.getProductPrice()));
        Image sseraDusty = new Image(LesseraPageController.dusty.getProductImage());
        sseraimg2.setImage(sseraDusty);
        
        sseraname3.setText(LesseraPageController.bloody.getProductName());
        sseraset3.setText(LesseraPageController.bloodyset.getProductName());
        sserapeso3.setText(LesseraPageController.bloodypeso.getProductName());
        sseraprice3.setText(Integer.toString(LesseraPageController.bloody.getProductPrice()));
        Image sseraBloody = new Image(LesseraPageController.bloody.getProductImage());
        sseraimg3.setImage(sseraBloody);


}


    public void addItem(Pane pane) {
    myvbox.getChildren().add(pane);

}
    // GO TO LESSERA PAGE

   public void gotosserapage(ActionEvent event) throws IOException {

       
        Parent root = FXMLLoader.load(getClass().getResource("/view/LesseraPage.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // GO TO ENHYPEN PAGE
    public void gotoenhapage(ActionEvent event) throws IOException {

       
        Parent root = FXMLLoader.load(getClass().getResource("/view/EnhaPage.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // GO TO RECEIPT PAGE
    
    public void checkoutreceipt(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Receipt.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    

 

}
