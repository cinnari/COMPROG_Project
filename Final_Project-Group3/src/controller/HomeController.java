package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Cart;
import model.EnhaFullVersion;
import model.EnhaHalfVersion;
import model.EnhaNewVersion;
import model.LesseraBloodyVersion;
import model.LesseraDewyVersion;
import model.LesseraDustyVersion;
import javafx.scene.Node;

public class HomeController implements Initializable {

    @FXML
    Button sseraHome, enhaHome;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    static EnhaFullVersion efull = new EnhaFullVersion();
    static EnhaFullVersion efullset = new EnhaFullVersion();
    static EnhaFullVersion efullpeso = new EnhaFullVersion();
    static EnhaHalfVersion ehalf = new EnhaHalfVersion();
    static EnhaHalfVersion ehalfset = new EnhaHalfVersion();
    static EnhaHalfVersion ehalfpeso = new EnhaHalfVersion();
    static EnhaNewVersion enew = new EnhaNewVersion();
    static EnhaNewVersion enewset = new EnhaNewVersion();
    static EnhaNewVersion enewpeso = new EnhaNewVersion();

    static LesseraDewyVersion dewy = new LesseraDewyVersion();
    static LesseraDewyVersion dewyset = new LesseraDewyVersion();
    static LesseraDewyVersion dewypeso = new LesseraDewyVersion();
    static LesseraDustyVersion dusty = new LesseraDustyVersion();
    static LesseraDustyVersion dustyset = new LesseraDustyVersion();
    static LesseraDustyVersion dustypeso = new LesseraDustyVersion();
    static LesseraBloodyVersion bloody = new LesseraBloodyVersion();
    static LesseraBloodyVersion bloodyset = new LesseraBloodyVersion();
    static LesseraBloodyVersion bloodypeso = new LesseraBloodyVersion();

    static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== FULL VERSION ==================//
        efull.setProductName("ENHYPEN DARK BLOOD PHOTOCARD");
        efullset.setProductName("(FULL VERSION SET)");
        efullpeso.setProductName("₱");
        efull.setProductPrice(2100);
        efull.setProductImage("images/enha1.png");

        // ============== HALF VERSION ==================//

        ehalf.setProductName("ENHYPEN DARK BLOOD PHOTOCARD");
        ehalfset.setProductName("(HALF VERSION SET)");
        ehalfpeso.setProductName("₱");
        ehalf.setProductPrice(1750);
        ehalf.setProductImage("images/enha2.png");

        // ============== NEW VERSION ==================//
        enew.setProductName("ENHYPEN DARK BLOOD PHOTOCARD");
        enewset.setProductName("(NEW VERSION SET)");
        enewpeso.setProductName("₱");
        enew.setProductPrice(2100);
        enew.setProductImage("images/enha3.png");

        // ============== dewy VERSION ==================//
        dewy.setProductName("LE SERRAFIM UNFORGIVEN PHOTOCARD");
        dewyset.setProductName("(DEWY SET)");
        dewypeso.setProductName("₱");
        dewy.setProductPrice(1500);
        dewy.setProductImage("images/lessera1.png");

        // ============== dusty VERSION ==================//

        dusty.setProductName("LE SERRAFIM UNFORGIVEN PHOTOCARD");
        dustyset.setProductName("(DUSTY AMBER SET)");
        dustypeso.setProductName("₱");
        dusty.setProductPrice(1300);
        dusty.setProductImage("images/lessera2.png");

        // ============== bloody VERSION ==================//
        bloody.setProductName("LE SERRAFIM UNFORGIVEN PHOTOCARD");
        bloodyset.setProductName("(BLOODY SET)");
        bloodypeso.setProductName("₱");
        bloody.setProductPrice(1300);
        bloody.setProductImage("images/lessera3.png");

        FXMLLoader loader = null;

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    

    // GO TO ENHYPEN PAGE

    public void enhaPageSwitch(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/EnhaPage.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // GO TO LESSERA PAGE

    public void sseraPageSwitch(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/LesseraPage.fxml"));
        Scene scene = new Scene(root, 1200, 800);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

}