package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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

        enhaname1.setText(HomeController.efull.getProductName());
        enhaset1.setText(HomeController.efullset.getProductName());
        enhapeso1.setText(HomeController.efullpeso.getProductName());
        enhaprice1.setText(Integer.toString(HomeController.efull.getProductPrice()));
        Image enhaFull = new Image(HomeController.efull.getProductImage());
        enhaimg1.setImage(enhaFull);

        enhaname2.setText(HomeController.ehalf.getProductName());
        enhaset2.setText(HomeController.ehalfset.getProductName());
        enhapeso2.setText(HomeController.ehalfpeso.getProductName());
        enhaprice2.setText(Integer.toString(HomeController.ehalf.getProductPrice()));
        Image enhaHalf = new Image(HomeController.ehalf.getProductImage());
        enhaimg2.setImage(enhaHalf);

        enhaname3.setText(HomeController.enew.getProductName());
        enhaset3.setText(HomeController.enewset.getProductName());
        enhapeso3.setText(HomeController.enewpeso.getProductName());
        enhaprice3.setText(Integer.toString(HomeController.enew.getProductPrice()));
        Image enhaNew = new Image(HomeController.enew.getProductImage());
        enhaimg3.setImage(enhaNew);

        sseraname1.setText(HomeController.dewy.getProductName());
        sseraset1.setText(HomeController.dewyset.getProductName());
        sserapeso1.setText(HomeController.dewypeso.getProductName());
        sseraprice1.setText(Integer.toString(HomeController.dewy.getProductPrice()));
        Image sseraDewy = new Image(HomeController.dewy.getProductImage());
        sseraimg1.setImage(sseraDewy);
        
        sseraname2.setText(HomeController.dusty.getProductName());
        sseraset2.setText(HomeController.dustyset.getProductName());
        sserapeso2.setText(HomeController.dustypeso.getProductName());
        sseraprice2.setText(Integer.toString(HomeController.dusty.getProductPrice()));
        Image sseraDusty = new Image(HomeController.dusty.getProductImage());
        sseraimg2.setImage(sseraDusty);
        
        sseraname3.setText(HomeController.bloody.getProductName());
        sseraset3.setText(HomeController.bloodyset.getProductName());
        sserapeso3.setText(HomeController.bloodypeso.getProductName());
        sseraprice3.setText(Integer.toString(HomeController.bloody.getProductPrice()));
        Image sseraBloody = new Image(HomeController.bloody.getProductImage());
        sseraimg3.setImage(sseraBloody);


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

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

   
    }

        // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }

 
}

