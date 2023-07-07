/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.chorombo.asistenteincubacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Poul
 */
public class MenuController implements Initializable {

    @FXML
    private Button btnCargas;
    @FXML
    private Button btnNacimientos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * Este método redireccina según el botón que ha sido presionado
     * @param event Evento que captura datos del botón 
     * 
     */
    @FXML
    private void goTo(ActionEvent event) {
        String id = ((Button) event.getSource()).getId();
        
        
        switch (id) {
            case "btnCargas":
                try{
                    //Cargo la visa
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Cargas.fxml"));
                    
                    //Cargo el padre
                    Parent root = loader.load();
                    
                    //Obtengo el controlador
                    CargasController controlador = loader.getController();
                    
                    //Creo la escena y el escenario
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    
                    //Asocio el escenario con la escena
                    stage.getIcons().add(new Image("/assets/calculator.png"));
                    stage.setTitle("Asistente de cargas");                    
                    stage.setScene(scene);
                    stage.show();
                    
                    // Indico que debe hacer al cerrar
                    stage.setOnCloseRequest(e -> controlador.closeWindows());
                    
                    // Cierro la ventana donde estoy
                    Stage myStage = (Stage) this.btnCargas.getScene().getWindow();
                    myStage.close();
                           
                }catch(IOException ex){
                    ex.printStackTrace();
                }
                break;
            case "btnNacimientos":
                try{
                    //Cargo la visa
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Nacimientos.fxml"));
                    
                    //Cargo el padre
                    Parent root = loader.load();
                    
                    //Obtengo el controlador
                    NacimientosController controlador = loader.getController();
                    
                    //Creo la escena y el escenario
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    
                    //Asocio el escenario con la escena
                    stage.getIcons().add(new Image("/assets/calculator.png"));
                    stage.setTitle("Asistente de nacimientos");
                    stage.setScene(scene);
                    stage.show();
                    
                    // Indico que debe hacer al cerrar
                    stage.setOnCloseRequest(e -> controlador.closeWindows());
                    
                    // Cierro la ventana donde estoy
                    Stage myStage = (Stage) this.btnNacimientos.getScene().getWindow();
                    myStage.close();
                           
                }catch(IOException ex){
                    ex.printStackTrace();
                }
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
}
