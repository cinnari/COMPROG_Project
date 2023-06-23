package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {

    @FXML
    int item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, pset1, pset2, pset3, pset4, 
            pset5, pset6, product1, product2, product3, product4, product5, product6,
                price1, price2, price3, price4, price5, price6, amount1,amount2, amount3,
                    amount4, amount5, amount6, total, pesosign1, pesosign2, pesosign3, pesosign4, 
                        pesosign5, pesosign6, pesosign7, pesosign8,pesosign9 ,pesosign10 ,pesosign11, pesosign12, pesosign13, pesorec ;
;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.efull.getProductStatus()) {
            product1.setText(HomeController.efull.getProductName());
            pset1.setText(HomeController.efullset.getProductName());
            pesosign1.setText(HomeController.efullpeso.getProductName());
            pesosign7.setText(HomeController.efullpeso.getProductName());
            qty1.setText(Integer.toString(HomeController.efull.getProductQuantity()));
            price1.setText(Integer.toString(HomeController.efull.getProductPrice()));
            amount1.setText(Integer
                    .toString(HomeController.efull.getProductPrice() * HomeController.efull.getProductQuantity()));

            product1.setVisible(true);
            pset1.setVisible(true);
            pesosign1.setVisible(true);
            pesosign7.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = HomeController.efull.getProductPrice() * HomeController.efull.getProductQuantity();

        }

        if (HomeController.ehalf.getProductStatus()) {
            product2.setText(HomeController.ehalf.getProductName());
            pset2.setText(HomeController.ehalfset.getProductName());
            pesosign2.setText(HomeController.ehalfpeso.getProductName());
            pesosign8.setText(HomeController.ehalfpeso.getProductName());
            qty2.setText(Integer.toString(HomeController.ehalf.getProductQuantity()));
            price2.setText(Integer.toString(HomeController.ehalf.getProductPrice()));
            amount2.setText(Integer
                    .toString(HomeController.ehalf.getProductPrice() * HomeController.ehalf.getProductQuantity()));

            product2.setVisible(true);
            pset2.setVisible(true);
            pesosign2.setVisible(true);
            pesosign8.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = HomeController.ehalf.getProductPrice() * HomeController.ehalf.getProductQuantity();
        }

        if (HomeController.enew.getProductStatus()) {
            product3.setText(HomeController.enew.getProductName());
            pset3.setText(HomeController.enewset.getProductName());
            pesosign3.setText(HomeController.enewpeso.getProductName());
            pesosign9.setText(HomeController.enewpeso.getProductName());
            qty3.setText(Integer.toString(HomeController.enew.getProductQuantity()));
            price3.setText(Integer.toString(HomeController.enew.getProductPrice()));
            amount3.setText(Integer
                    .toString(HomeController.enew.getProductPrice() * HomeController.enew.getProductQuantity()));

            product3.setVisible(true);
            pset3.setVisible(true);
            pesosign3.setVisible(true);
            pesosign9.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = HomeController.enew.getProductPrice() * HomeController.enew.getProductQuantity();

        }

        if (HomeController.dewy.getProductStatus()) {
            product4.setText(HomeController.dewy.getProductName());
            pset4.setText(HomeController.dewyset.getProductName());
            pesosign4.setText(HomeController.dewypeso.getProductName());
            pesosign10.setText(HomeController.dewypeso.getProductName());
            qty4.setText(Integer.toString(HomeController.dewy.getProductQuantity()));
            price4.setText(Integer.toString(HomeController.dewy.getProductPrice()));
            amount4.setText(Integer
                    .toString(HomeController.dewy.getProductPrice() * HomeController.dewy.getProductQuantity()));

            product4.setVisible(true);
            pset4.setVisible(true);
            pesosign4.setVisible(true);
            pesosign10.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = HomeController.dewy.getProductPrice() * HomeController.dewy.getProductQuantity();

        }

        if (HomeController.dusty.getProductStatus()) {
            product5.setText(HomeController.dusty.getProductName());
            pset5.setText(HomeController.dustyset.getProductName());
            pesosign5.setText(HomeController.dustypeso.getProductName());
            pesosign11.setText(HomeController.dustypeso.getProductName());
            qty5.setText(Integer.toString(HomeController.dusty.getProductQuantity()));
            price5.setText(Integer.toString(HomeController.dusty.getProductPrice()));
            amount5.setText(Integer
                    .toString(HomeController.dusty.getProductPrice() * HomeController.dusty.getProductQuantity()));

            product5.setVisible(true);
            pset5.setVisible(true);
            pesosign5.setVisible(true);
            pesosign11.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = HomeController.dusty.getProductPrice() * HomeController.dusty.getProductQuantity();

        }

        if (HomeController.bloody.getProductStatus()) {
            product6.setText(HomeController.bloody.getProductName());
            pset6.setText(HomeController.bloodyset.getProductName());
            pesosign6.setText(HomeController.bloodypeso.getProductName());
            pesosign12.setText(HomeController.bloodypeso.getProductName());
            qty6.setText(Integer.toString(HomeController.bloody.getProductQuantity()));
            price6.setText(Integer.toString(HomeController.bloody.getProductPrice()));
            amount6.setText(Integer
                    .toString(HomeController.bloody.getProductPrice() * HomeController.bloody.getProductQuantity()));

            product6.setVisible(true);
            pset6.setVisible(true);
            pesosign6.setVisible(true);
            pesosign12.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = HomeController.bloody.getProductPrice() * HomeController.bloody.getProductQuantity();

        }

        int final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount;
        total.setText(Integer.toString(final_amount));

    }
}