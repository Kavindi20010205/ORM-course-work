package org.example.course3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public AnchorPane load_panel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try{
            refreshPage();
        } catch(Exception e){
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Something went wrong!").show();
        }

    }

    private void refreshPage() {
        login_btn.setDisable(false);
        userName_txt.setText("");
        password_txt.setText("");
    }

    @FXML
    private Button help_btn;

    @FXML
    private Button login_btn;

    @FXML
    private Button passwordShow_btn;

    @FXML
    private PasswordField password_txt;

    @FXML
    private Button userNameShow_btn;

    @FXML
    private PasswordField userName_txt;

    @FXML
    void help_btn_OnAction(ActionEvent event) {

    }

    @FXML
    void login_btn_OnAction(ActionEvent event) throws IOException {
        loginTo();
    }

    private void loginTo() throws IOException {
        load_panel.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/DashBoardFx.fxml"));
        load.getChildren().add(load_panel);
    }

    @FXML
    void passwordShow_btn_OnAction(ActionEvent event) {

    }

    @FXML
    void userNameShow_btn_OnAction(ActionEvent event) {

    }

}
