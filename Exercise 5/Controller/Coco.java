package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class Coco {

    @FXML
    ImageView img1, img2, img3, img4, img5;;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Chocolate chocolate = new Chocolate();
    Matcha matcha = new Matcha();
    Panda panda = new Panda();
    Lemon lemon = new Lemon();
    Cantaloupe cantaloupe = new Cantaloupe();

    public void initialize() {

        chocolate.setColor("Brown");
        chocolate.setSugarLevel("75%");

        matcha.setColor("Green");
        matcha.setSugarLevel("100%");

        panda.setColor("Cream");
        panda.setSugarLevel("50%");

        lemon.setColor("Yellow");
        lemon.setSugarLevel("25%");

        cantaloupe.setColor("Orange");
        cantaloupe.setSugarLevel("125%");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Chocalate with pudding and pearl milktea's color is " + chocolate.getColor() + " and has a sugar level of " + chocolate.getSugarLevel());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Panda Matcha Tea Latte's color is " + matcha.getColor() + " and has a sugar level of" + matcha.getSugarLevel());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Panda Milktea's color is " + panda.getColor() + " and has a sugar level of" + panda.getSugarLevel());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Lemon Dunk's color is " + lemon.getColor() + " and has a sugar level of" + lemon.getSugarLevel());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Honey Jelly Cantaloupe's color is " + cantaloupe.getColor() + " and has a sugar level of" + cantaloupe.getSugarLevel());
        }
        
        alert.showAndWait();

    }
}