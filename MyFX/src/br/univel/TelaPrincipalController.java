package br.univel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaPrincipalController {

    @FXML
    private Label Campo;

    @FXML
    private Button Botao;

    @FXML
    void salvar(ActionEvent event) {
    
    	System.out.print(Campo.getText());
    }
    
}
