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
import model.EnhaFullVersion;
import model.EnhaHalfVersion;
import model.EnhaNewVersion;
import javafx.scene.Node;
import javafx.scene.Parent;

public class EnhaPageController implements Initializable {

    @FXML
    Button fvButton, hvButton, nvButton, enhacartbtn, gotoLesseraPage;

    @FXML
    Label enhaname1, enhaname2, enhaname3, enhaset1, enhaset2, enhaset3, enhapeso1, enhapeso2, enhapeso3, enhaprice1,
            enhaprice2, enhaprice3;

    @FXML
    ImageView enhaimg1, enhaimg2, enhaimg3;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    static Parent root = null;

    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;

    static EnhaFullVersion efull = new EnhaFullVersion();
    static EnhaFullVersion efullset = new EnhaFullVersion();
    static EnhaFullVersion efullpeso = new EnhaFullVersion();
    static EnhaHalfVersion ehalf = new EnhaHalfVersion();
    static EnhaHalfVersion ehalfset = new EnhaHalfVersion();
    static EnhaHalfVersion ehalfpeso = new EnhaHalfVersion();
    static EnhaNewVersion enew = new EnhaNewVersion();
    static EnhaNewVersion enewset = new EnhaNewVersion();
    static EnhaNewVersion enewpeso = new EnhaNewVersion();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== FULL VERSION ==================//
        efull.setProductName("ENHYPEN DARK BLOOD PHOTOCARD");
        efullset.setProductName("(FULL VERSION SET)");
        efullpeso.setProductName("₱");
        enhaname1.setText(efull.getProductName());
        enhaset1.setText(efullset.getProductName());
        enhapeso1.setText(efullpeso.getProductName());

        efull.setProductPrice(2100);
        enhaprice1.setText(Integer.toString(efull.getProductPrice()));

        efull.setProductImage("images/enha1.png");
        Image enhaFull = new Image(efull.getProductImage());
        enhaimg1.setImage(enhaFull);

        // ============== HALF VERSION ==================//

        ehalf.setProductName("ENHYPEN DARK BLOOD PHOTOCARD");
        ehalfset.setProductName("(HALF VERSION SET)");
        ehalfpeso.setProductName("₱");
        enhaname2.setText(ehalf.getProductName());
        enhaset2.setText(ehalfset.getProductName());
        enhapeso2.setText(efullpeso.getProductName());

        ehalf.setProductPrice(1750);
        enhaprice2.setText(Integer.toString(ehalf.getProductPrice()));

        ehalf.setProductImage("images/enha2.png");
        Image enhaHalf = new Image(ehalf.getProductImage());
        enhaimg2.setImage(enhaHalf);

        // ============== NEW VERSION ==================//
        enew.setProductName("ENHYPEN DARK BLOOD PHOTOCARD");
        enewset.setProductName("(NEW VERSION SET)");
        enewpeso.setProductName("₱");
        enhaname3.setText(enew.getProductName());
        enhaset3.setText(enewset.getProductName());
        enhapeso3.setText(efullpeso.getProductName());

        enew.setProductPrice(2100);
        enhaprice3.setText(Integer.toString(enew.getProductPrice()));

        enew.setProductImage("images/enha3.png");
        Image enhaNew = new Image(enew.getProductImage());
        enhaimg3.setImage(enhaNew);

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

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Item Added.",
                "Item added! Please visit checkout to add more of this item, if you so desire.");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(fvButton)) {
            efull.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == hvButton) {
            ehalf.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == nvButton) {
            enew.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }
    }

    public void fvButton(ActionEvent event) throws IOException {
        buy(event);
    }

    public void hvButton(ActionEvent event) throws IOException {
        buy(event);
    }

    public void nvButton(ActionEvent event) throws IOException {
        buy(event);
    }

    public void eCartButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Checkout.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(EnhaPageController.root, 1200, 800);
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
