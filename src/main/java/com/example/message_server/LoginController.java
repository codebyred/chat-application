package com.example.message_server;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Button login_btn;
    @Override
    public void initialize(URL location, ResourceBundle resources){
        login_btn.setOnAction((event)->{
            try {
                FXMLLoader fxmlLoader2 = new FXMLLoader(App.class.getResource("hello-view.fxml"));
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                Scene scene = new Scene(fxmlLoader2.load(), 478, 400);
                stage.setScene(scene);

            }catch(IOException e){
                e.printStackTrace();
            }
        });
    }
}
