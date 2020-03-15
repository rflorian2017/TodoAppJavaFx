package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class Controller {
    public Button btnLogin;
    public TextField txtFieldUsername;
    public TextField txtFieldPassword;
    public Button btnShow;
    public PasswordField pwdFieldPassword;
    public Label lblUsername;
    public Label lblInfo;
    public MenuItem mnutemLogin;
    public TabPane tabPane;
    public Tab tabLogin;
    public Tab tabMain;

    public void initialize() {
//        tabPane.getTabs().remove(tabLogin);
//        tabPane.getTabs().remove(tabMain);
        tabPane.getTabs().clear();
    }

    public void showMessageInConsole(ActionEvent actionEvent) {
        System.out.println("button clicked!");
    }

    public void closeAction(ActionEvent actionEvent) {
        System.out.println("close menu pressed");
    }

    public void login(ActionEvent actionEvent) {
        if (txtFieldUsername.getText().length() < 1) {
            lblUsername.setTextFill(Color.RED);
            lblInfo.setVisible(true);
            lblInfo.setText("Please fill usernae");
        } else {
            System.out.println(txtFieldUsername.getText());
            System.out.println(txtFieldPassword.getText());
            tabPane.getTabs().remove(tabLogin);
            tabPane.getTabs().add(tabMain);
        }
    }

    public void showPassword(ActionEvent actionEvent) {
        if (!txtFieldPassword.isVisible()) {
            btnShow.setText("Hide");
            txtFieldPassword.setText(pwdFieldPassword.getText());
            txtFieldPassword.setEditable(false);
            txtFieldPassword.setVisible(true);
            pwdFieldPassword.setVisible(false);
        } else {
            btnShow.setText("Show");
            txtFieldPassword.setVisible(false);
            pwdFieldPassword.setVisible(true);
        }
    }

    public void showLoginPane(ActionEvent actionEvent) {
        tabPane.getTabs().add(tabLogin);
    }
}
