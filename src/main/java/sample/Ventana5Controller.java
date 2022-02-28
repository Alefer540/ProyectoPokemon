package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Ventana5Controller {
    @FXML
    Label nombre_p;
    @FXML
    ImageView img_p;
    @FXML
    ProgressBar vida_p;
    @FXML
    ImageView revivir;
    @FXML
    ImageView p_maxima;
    @FXML
    ImageView antidoto;



    Pokemon Pokemon_amigo;
    private Ventana1Controller ventana1Controller;

    public void datos(Pokemon pokemon_amigo) {
        this.Pokemon_amigo = pokemon_amigo;
        Image imagen1=new Image(pokemon_amigo.foto.toURI().toString());
        img_p.setImage(imagen1);
        nombre_p.setText(pokemon_amigo.nombre);
        vida_p.setProgress(Pokemon_amigo.vida_actual/Pokemon_amigo.vida);

    }
    @FXML
    private void cerrar(){
        ventana1Controller.stage5.close();

    }


    @FXML
    public void revivir_p() {
        if (Pokemon_amigo.vida_actual <= 0){
            Pokemon_amigo.vida_actual=Pokemon_amigo.vida;
            vida_p.setProgress(Pokemon_amigo.vida_actual);
            ventana1Controller.actualizar_pokemon(Pokemon_amigo);
        }
    }
    @FXML
    public void p_maxima(){
        if (Pokemon_amigo.vida_actual <= Pokemon_amigo.vida) {
            Pokemon_amigo.vida_actual = Pokemon_amigo.vida_actual + 40;
            vida_p.setProgress(Pokemon_amigo.vida_actual/Pokemon_amigo.vida);
            ventana1Controller.actualizar_pokemon(Pokemon_amigo);
        }

    }
    @FXML
    public void antidoto() {
        if (Pokemon_amigo.vida_actual <= Pokemon_amigo.vida) {
        Pokemon_amigo.vida_actual = Pokemon_amigo.vida_actual + 20;
        vida_p.setProgress(Pokemon_amigo.vida_actual/Pokemon_amigo.vida);
        ventana1Controller.actualizar_pokemon(Pokemon_amigo);
    }


    }


    void enviarController1(Ventana1Controller Ventana1Controller) {
        this.ventana1Controller = Ventana1Controller;
    }


}




