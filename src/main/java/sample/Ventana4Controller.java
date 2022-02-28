package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

import java.awt.*;


public class Ventana4Controller {

     @FXML
     ImageView img_p;
     @FXML
     Text texto;
     @FXML
     ImageView evo;
     @FXML
     ImageView evo1;
     @FXML
     Label nombre;
     @FXML
     ImageView estrella;


    Pokemon Pokemon_amigo;
    private Ventana1Controller ventana1Controller;

    public void datos(Pokemon pokemon_amigo) {
        this.Pokemon_amigo = pokemon_amigo;
        Image imagen1=new Image(pokemon_amigo.foto.toURI().toString());
        img_p.setImage(imagen1);
        Image imagen2=new Image(pokemon_amigo.evo.toURI().toString());
        evo.setImage(imagen2);
        Image imagen3=new Image(pokemon_amigo.evo1.toURI().toString());
        evo1.setImage(imagen3);
        texto.setText(pokemon_amigo.descrip);
        nombre.setText(pokemon_amigo.nombre);


    }
    @FXML
    private void cerrar(){
        ventana1Controller.stage4.close();

    }
    @FXML
    private void marcar_fav(){
        if (Pokemon_amigo.index == 1 ) {
            ventana1Controller.estrellita1.setStyle("-fx-opacity:1");
            estrella.setStyle("-fx-opacity:1");
        }
        if (Pokemon_amigo.index == 2 ) {
            ventana1Controller.estrellita2.setStyle("-fx-opacity:1");
            estrella.setStyle("-fx-opacity:1");
        }
        if (Pokemon_amigo.index == 3 ) {
            ventana1Controller.estrellita3.setStyle("-fx-opacity:1");
            estrella.setStyle("-fx-opacity:1");
        }
        if (Pokemon_amigo.index == 4 ) {
            ventana1Controller.estrellita5.setStyle("-fx-opacity:1");
            estrella.setStyle("-fx-opacity:1");
        }
        if (Pokemon_amigo.index == 5 )  {
            ventana1Controller.estrellita4.setStyle("-fx-opacity:1");
            estrella.setStyle("-fx-opacity:1");
        }
        if (Pokemon_amigo.index == 6 ) {
            ventana1Controller.estrellita6.setStyle("-fx-opacity:1");
            estrella.setStyle("-fx-opacity:1");
        }
       ventana1Controller.actualizar_pokemon(Pokemon_amigo);

    }



    void enviarController1(Ventana1Controller Ventana1Controller) {
        this.ventana1Controller = Ventana1Controller;
    }
}

    
    

