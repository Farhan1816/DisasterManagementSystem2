package com.example.disastermanagementsystem2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button logIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void HomeButtonClicked(ActionEvent event) throws Exception
    {
        root =  FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void LogInButtonClicked(ActionEvent event) throws Exception
    {
        root =  FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void enteredLogIn()
    {
        String takenUsername = username.getText().toString();
        String takenPassword = password.getText().toString();
        System.out.println("Username is: " + takenUsername);
        System.out.println("Password is: " + takenPassword);
    }
}