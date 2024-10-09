package com.example.cst4_finalproject;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OptionsCont implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private JFXButton simulatecfg;
    private JFXButton simulatedfa;
    private JFXButton simulatendfa;
    private JFXButton simulatepda;
    private JFXButton simulatetm;
    private JFXButton simulateth;


    public void gotoCFG (ActionEvent event ) throws IOException {
        if (event.getSource() == simulatecfg) {
            Stage window = (Stage) simulatecfg.getScene().getWindow();
            window.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CFGSimulator.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
    }
    public void gotoDFA  (ActionEvent event ) throws IOException {
        if (event.getSource() == simulatedfa) {
            Stage window = (Stage) simulatedfa.getScene().getWindow();
            window.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DFASimulator.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
    }
    public void gotoNDFA  (ActionEvent event ) throws IOException {
        if (event.getSource() == simulatendfa) {
            Stage window = (Stage) simulatendfa.getScene().getWindow();
            window.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NDFASimulator.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
    }
    public void gotoPDA  (ActionEvent event ) throws IOException {
        if (event.getSource() == simulatepda) {
            Stage window = (Stage) simulatepda.getScene().getWindow();
            window.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PDA.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
    }
    public void gotoTM  (ActionEvent event ) throws IOException {
        if (event.getSource() == simulatetm) {
            Stage window = (Stage) simulatetm.getScene().getWindow();
            window.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TuringMachine.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
    }
    public void gotoTH (ActionEvent event ) throws IOException {
        if (event.getSource() == simulateth) {
            Stage window = (Stage) simulateth.getScene().getWindow();
            window.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TowerofHanoi.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }
    }
}
