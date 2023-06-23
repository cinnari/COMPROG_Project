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
import javafx.scene.control.ChoiceBox;
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
    Button checkout;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6;

    private String[] quantity = { "1", "2", "3" };

    @FXML
    Label enhaname1, enhaname2, enhaname3, enhaset1, enhaset2, enhaset3, enhapeso1, enhapeso2, enhapeso3, enhaprice1, enhaprice2, enhaprice3, 
    sserapeso1, sseraname1, sseraname2, sseraname3, sseraset1, sseraset2, sseraset3, sserapeso2, sserapeso3, sseraprice1, sseraprice2, sseraprice3, 
    total, pesochk;
   
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

        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);

         // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);

    }

    /**
     * @param event
     */
    public void computeTotal(ActionEvent event) {

        int totalAmount = 0;
        int item1Amount = 0;
        int item2Amount = 0;
        int item3Amount = 0;
        int item4Amount = 0;
        int item5Amount = 0;
        int item6Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (HomeController.efull.getProductStatus()) {

            int qty = Integer.parseInt(choicebox1.getValue());
            HomeController.efull.setProductQuantity(qty);
            item1Amount = HomeController.efull.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = HomeController.efull.getProductPrice() * qty;
            }
        }

        if (HomeController.ehalf.getProductStatus()) {

            int qty = Integer.parseInt(choicebox2.getValue());
            HomeController.ehalf.setProductQuantity(qty);
            item2Amount = HomeController.ehalf.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = HomeController.ehalf.getProductPrice() * qty;
            }
        }

        if (HomeController.enew.getProductStatus()) {

            int qty = Integer.parseInt(choicebox3.getValue());
            HomeController.enew.setProductQuantity(qty);
            item3Amount = HomeController.enew.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = HomeController.enew.getProductPrice() * qty;
            }
        }

        if (HomeController.dewy.getProductStatus()) {

            int qty = Integer.parseInt(choicebox4.getValue());
            HomeController.dewy.setProductQuantity(qty);
            item4Amount = HomeController.dewy.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = HomeController.dewy.getProductPrice() * qty;
            }
        }

        if (HomeController.dusty.getProductStatus()) {

            int qty = Integer.parseInt(choicebox5.getValue());
            HomeController.dusty.setProductQuantity(qty);
            item5Amount = HomeController.dusty.getProductPrice() * qty;

            if (source == choicebox6) {
                item5Amount = HomeController.dusty.getProductPrice() * qty;
            }
        }

        if (HomeController.bloody.getProductStatus()) {

            int qty = Integer.parseInt(choicebox6.getValue());
            HomeController.bloody.setProductQuantity(qty);
            item6Amount = HomeController.bloody.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = HomeController.bloody.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount;

        // Display total amount in all total label
        total.setText(Integer.toString(totalAmount));

    }

    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        int totalAmount = 0;

        if (HomeController.efull.getProductStatus()) {
            totalAmount += HomeController.efull.getProductPrice();
        }

        if (HomeController.ehalf.getProductStatus()) {
            totalAmount += HomeController.ehalf.getProductPrice();
        }

        if (HomeController.enew.getProductStatus()) {
            totalAmount += HomeController.enew.getProductPrice();
        }

        if (HomeController.dewy.getProductStatus()) {
            totalAmount += HomeController.dewy.getProductPrice();
        }

        if (HomeController.dusty.getProductStatus()) {
            totalAmount += HomeController.dusty.getProductPrice();
        }

        if (HomeController.bloody.getProductStatus()) {
            totalAmount += HomeController.bloody.getProductPrice();
        }

        total.setText(Integer.toString(totalAmount));
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

