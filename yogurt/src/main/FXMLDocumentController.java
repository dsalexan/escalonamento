/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author rafae
 */
public class FXMLDocumentController implements Initializable {


    @FXML
    private AnchorPane cadastrarprocesso;
    @FXML
    private AnchorPane diagramagantt;
    @FXML
    private AnchorPane filaprocessos;

   /* private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("ola");
        Processo p1,p2,p3,p4,p5;
        p1 = new Processo(10, 6, 2,"1");
        p2 = new Processo(12, 2, 1,"2");
        p3 = new Processo(14, 2, 3,"3");
        p4 = new Processo(16, 10, 1,"4");
        p5 = new Processo(45,10,2,"5");
        ArrayList<Processo> lista = new ArrayList<>();
        lista.add(p1);lista.add(p2);lista.add(p3);lista.add(p4);lista.add(p5);
        Escalonadores escalonador=new Escalonadores(lista);
        escalonador.PRIO_PREEMPTIVO();
        System.out.print(escalonador.toString());
    }

}
