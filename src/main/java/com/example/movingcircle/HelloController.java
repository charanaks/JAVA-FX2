package com.example.movingcircle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;


public class HelloController {
    @FXML
    private Circle myCircle;
    private Stage stage;
    private Scene scene;
    private double x;
    private double y;


    public void up(ActionEvent e){
        myCircle.setCenterY(y=y-10);
    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y=y+10);
    }
    @FXML
    public void left(ActionEvent e){
        myCircle.setCenterX(x=x-10);
    }
    @FXML
    public void right(ActionEvent e){
        myCircle.setCenterX(x=x+10);
    }
    @FXML
    public void switchToMain (ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void switchToScene1 (ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene1.fxml"));
        //root = loader().load -> then we can assume this as root node

        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }
}