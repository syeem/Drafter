/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drafter;

import drafter.Hero.Trait;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

/**
 *
 * @author SyeemMorshed
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private MenuButton ally1;
    @FXML
    private MenuButton menuButtonTraits;
    @FXML
    private TextArea textArea;
    @FXML
    Button buttonClear;

    List<Hero> heroes;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        InitializeHeroes();

        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                textArea.clear();
            }
        });

    }

    private void InitializeHeroes() {
        this.heroes = Hero.CreateHeroes();
        PopulateList();
    }

    private Hero GetHero(String name) {
        for (Hero h : heroes) {
            if (h.name.equals(name)) {
                return h;
            }
        }
        return null;
    }

    private String GetHeroFromTrait(String trait) {
        String list = trait + ": ";

        for (Hero h : heroes) {
            if (h.GetString().contains(trait)) {
                list += h.name;
                list += " ";
            }
        }
        return list;
    }

    private void PopulateList() {
        for (Hero h : heroes) {
            MenuItem m = new MenuItem(h.name);
            m.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    MenuItem item = (MenuItem) event.getSource();
                    Hero hero = GetHero(item.getText());
                    textArea.appendText(hero.name + ": ");
                    textArea.appendText(hero.GetString() + "\n");
                }
            });

            ally1.getItems().add(m);
        }

        for (Trait t : Trait.values()) {
            MenuItem m = new MenuItem(t.name());
            m.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    MenuItem item = (MenuItem) event.getSource();
                    textArea.appendText(GetHeroFromTrait(item.getText()));
                    textArea.appendText(("\n"));
                }
            });

            menuButtonTraits.getItems().add(m);
        }
    }
}
