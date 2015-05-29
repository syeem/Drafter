/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drafter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

/**
 *
 * @author SyeemMorshed
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label labelAlly1;
    @FXML
    private MenuButton ally1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ally1.getItems().addAll(new MenuItem("Burger"), new MenuItem("Hot Dog"));

    }

}
