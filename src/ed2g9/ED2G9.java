/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2g9;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Ricardo
 */
public class ED2G9 extends Application {
    private String[] colores = {"#55efc4", "#81ecec", "#74b9ff", "#74b9ff", "#a29bfe", "#dfe6e9", "#00b894", "#00cec9", "#0984e3", "#6c5ce7", "#b2bec3", "#ffeaa7", "#fab1a0", "#ff7675", "#fd79a8",
         "#636e72", "#fdcb6e", "#e17055", "#d63031", "#e84393"};
    private int contador=1;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void PanelPrincipal(){
        Stage stage= new Stage();
        Label lb= new Label("Elija la carpeta a representar");
        lb.setTextFill(Color.web("#3498db"));
        lb.setFont(new Font("Arial Black",18));
        Button bt= new Button("Navegar");
        bt.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-padding: 20px 25px;-fx-background-color: #9b59b6;"/*+"-fx-border-color: #ED4C67"*/);
        bt.setTextFill(Color.web("#ffffff"));
        
        //aviso.setTextFill(Color.web("#e74c3c"));
        Label aviso= new Label();
        aviso.setTextFill(Color.web("#e74c3c"));
        aviso.setFont(new Font("Arial Black",18));
        aviso.setVisible(false);
        VBox vb= new VBox(lb,aviso,bt);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(40);
        vb.setStyle("-fx-background-color: #bdc3c7;");
        bt.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                 //falta la parde del handel de agregar
             }
         });
        Scene scene= new Scene(vb,600,300);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
