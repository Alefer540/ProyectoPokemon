package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;


public class Ventana2controller {

    ArrayList<Pokemon> listaPokemones =null;

    ArrayList<Pokemon_enemigo> Pokemon_enemigos = new ArrayList();
    Pokemon_enemigo p_e1 = new Pokemon_enemigo("Arbok",250f,250f,"NV.70",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Arbok.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\masculino.jpg"));
    Pokemon_enemigo p_e2 = new Pokemon_enemigo("Palkia",650f,650f,"NV.120",new File( ".\\src\\main\\java\\sample\\ImagenesPokemon\\Palkia.gif"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\masculino.jpg"));
    Pokemon_enemigo p_e3 = new Pokemon_enemigo("Onix",200f,200f,"NV.55",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Onix.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\femenino.jpg"));
    Pokemon_enemigo p_e4 = new Pokemon_enemigo("Gyarados",200f,200f,"NV.55",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Gyarados.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\femenino.jpg"));



    @FXML
    ImageView img_espaldas;
    @FXML
    Label name_pokemon;
    @FXML
    Label nivel_pokemon;
    @FXML
    ImageView img_sexo;
    @FXML
    ProgressBar pb_vida_actual;
    @FXML
    Label name_enemigo_pokemon;
    @FXML
    Label nivel_enemigo_pokemon;
    @FXML
    ProgressBar vida_actual_enemigo;
    @FXML
    ImageView img_enemigo;
    @FXML
    ImageView img_sexo_enemigo;
    @FXML
    Button ataque_seguro;
    @FXML
    Button ataque_arriesgado;
    @FXML
    Button ataque_muy_arriesgado;
    @FXML
    Button cancelar_ataque;
    @FXML
    Button luchar;
    @FXML
    Button curarse;
    @FXML
            Label ps;
    @FXML
    Label ps1;
    @FXML
    ImageView fondo_Batalla;


    Pokemon_enemigo oponente;
    Pokemon Pokemon_amigo;




    public void funcioninicio(Pokemon Pokemon_amigo) {
        this.Pokemon_amigo = Pokemon_amigo;
        contador();
        Pokemon_enemigos.add(p_e1);
        Pokemon_enemigos.add(p_e2);
        Pokemon_enemigos.add(p_e3);
        Pokemon_enemigos.add(p_e4);
        oponente = Pokemon_enemigos.get((int) (Math.random() * Pokemon_enemigos.size()));
        name_pokemon.setText(Pokemon_amigo.nombre);
        nivel_pokemon.setText(Pokemon_amigo.nivel);
        Image imagen3=new Image(Pokemon_amigo.sexo.toURI().toString());
        img_sexo.setImage(imagen3);
        pb_vida_actual.setProgress(Pokemon_amigo.vida_actual/Pokemon_amigo.vida);
        Image imagen1=new Image(Pokemon_amigo.foto_detras.toURI().toString());
        img_espaldas.setImage(imagen1);
        Image imagen2=new Image(oponente.foto.toURI().toString());
        img_enemigo.setImage(imagen2);
        name_enemigo_pokemon.setText(oponente.nombre);
        nivel_enemigo_pokemon.setText(oponente.nivel);
        vida_actual_enemigo.setProgress(oponente.vida_actual/oponente.vida);
        Image imagen4=new Image(oponente.sexo.toURI().toString());
        img_sexo_enemigo.setImage(imagen4);
        ataque_arriesgado.setDisable(true);
        ataque_muy_arriesgado.setDisable(true);
        cancelar_ataque.setDisable(true);
        ataque_seguro.setDisable(true);


    }
    private Ventana1Controller ventana1Controller;

    @FXML
    private void opcion_botones(){
        System.out.println("aparecen los tipos de ataques");
        aparecer_botones_ataques();
        luchar.setDisable(true);
        curarse.setDisable(true);
        luchar.setStyle("-fx-opacity:0");
        curarse.setStyle("-fx-opacity:0");

    }
    @FXML
    private void cambiovida(){
        ps.setText(""+oponente.vida_actual);

    }
    @FXML
    private void cambiovida2(){
        ps1.setText(""+Pokemon_amigo.vida_actual);

    }
    @FXML
    private void ps1(){
        ps1.setText("PS");

    }
    @FXML
    private void ps() {
        ps.setText("PS");
    }

    @FXML
    private  void ataque(){
        vida_actual_enemigo.setProgress((oponente.vida_actual-20)/oponente.vida);
        oponente.vida_actual -= 20;
        System.out.println("Daño pokemon amigo arriesgado -20");
        Ventana1Controller.danorecibido += 20;
        control_vida_enemigo();
        pb_vida_actual.setProgress((Pokemon_amigo.vida_actual-20)/Pokemon_amigo.vida);
        Pokemon_amigo.vida_actual -=20;
        System.out.println("Daño pokemon enemigo arriesgado -20");
        ventana1Controller.actualizar_pokemon(Pokemon_amigo);
        Ventana1Controller.danodado += 20;
        control_vida_amigo();


    }
    @FXML
    private  void ataque_arriesgado(){
        int i = (int) (Math.random()*(26-11));
        vida_actual_enemigo.setProgress((oponente.vida_actual-i)/oponente.vida);
        oponente.vida_actual -= i ;
        System.out.println("Daño pokemon amigo arriesgado "+i);
        Ventana1Controller.danorecibido += i;
        control_vida_enemigo();
         i = (int) (Math.random()*(26-11));
        pb_vida_actual.setProgress((Pokemon_amigo.vida_actual-i)/Pokemon_amigo.vida);
        Pokemon_amigo.vida_actual -= i;
        System.out.println("Daño pokemon enemigo arriesgado "+i);
        ventana1Controller.actualizar_pokemon(Pokemon_amigo);
        Ventana1Controller.danodado += i;
        control_vida_amigo();

    }
    @FXML
    private  void ataque_muy_arriesgado(){
        int i = (int) (Math.random()*(51-1));
        vida_actual_enemigo.setProgress((oponente.vida_actual-i)/oponente.vida);
        oponente.vida_actual -= i ;
        System.out.println("Daño pokemon amigo  ataque muy arriesgado "+i);
        Ventana1Controller.danorecibido += i;
        control_vida_enemigo();
        i  = (int) (Math.random()*(51-1));
        pb_vida_actual.setProgress((Pokemon_amigo.vida_actual-i)/Pokemon_amigo.vida);
        Pokemon_amigo.vida_actual -=i;
        System.out.println("Daño pokemon enemigo ataque muy arriesgado "+i);
        ventana1Controller.actualizar_pokemon(Pokemon_amigo);
        Ventana1Controller.danodado += i;
        control_vida_amigo();


    }
    @FXML
    private void curarse() {
        int i = (int) (Math.random() * (76 - 26));
        pb_vida_actual.setProgress((Pokemon_amigo.vida_actual + i) / Pokemon_amigo.vida);
        Pokemon_amigo.vida_actual += i;
        System.out.println("pokemon se cura " + i);
        if (Pokemon_amigo.vida_actual > Pokemon_amigo.vida) {
            Pokemon_amigo.vida_actual = Pokemon_amigo.vida;
        }
        int a = (int) (Math.random() * (76 - 26));
        vida_actual_enemigo.setProgress((oponente.vida_actual + i) / oponente.vida);
        oponente.vida_actual += a;
        System.out.println("pokemon se cura " + i);
        if (oponente.vida_actual > oponente.vida) {
            oponente.vida_actual = oponente.vida;
        }
        ventana1Controller.actualizar_pokemon(Pokemon_amigo);
    }


    @FXML
    private void cancelar(){
        System.out.println("aparecen los botones de luchar y curarse y desaparecen los de atacar");
        desaparacen_botones_atacar();
        luchar.setDisable(false);
        curarse.setDisable(false);
        luchar.setStyle("-fx-opacity:1;-fx-background-color: #F8A9B1; -fx-border-color: #D43E41; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
        curarse.setStyle("-fx-opacity:1;-fx-background-radius: 20; -fx-border-width: 5; -fx-border-radius: 20; -fx-background-color: #2891C9; -fx-border-color: #3A668A;");
    }
   


    private void aparecer_botones_ataques(){
        ataque_muy_arriesgado.setDisable(false);
        ataque_seguro.setDisable(false);
        ataque_arriesgado.setDisable(false);
        cancelar_ataque.setDisable(false);
        ataque_muy_arriesgado.setStyle("-fx-opacity:1;-fx-background-color: #DF982A; -fx-border-color:#896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
        ataque_seguro.setStyle("-fx-opacity:1;-fx-background-color: #DF982A; -fx-border-color:#896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
        ataque_arriesgado.setStyle("-fx-opacity:1;-fx-background-color: #DF982A; -fx-border-color:#896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
        cancelar_ataque.setStyle("-fx-opacity:1;-fx-background-color: #DF982A; -fx-border-color: #896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
    }
    private void desaparacen_botones_atacar(){
        ataque_muy_arriesgado.setDisable(true);
        ataque_seguro.setDisable(true);
        ataque_arriesgado.setDisable(true);
        cancelar_ataque.setDisable(true);
        ataque_muy_arriesgado.setStyle("-fx-opacity:0;-fx-background-color: #DF982A; -fx-border-color: #896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
        ataque_seguro.setStyle("-fx-opacity:0;-fx-background-color: #DF982A; -fx-border-color:#896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
        ataque_arriesgado.setStyle("-fx-opacity:0;-fx-background-color: #DF982A; -fx-border-color: #896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
        cancelar_ataque.setStyle("-fx-opacity:0;-fx-background-color: #DF982A; -fx-border-color: #896838; -fx-border-radius: 20; -fx-border-width: 5; -fx-background-radius: 20;");
    }
    private void control_vida_amigo(){
        if (Pokemon_amigo.vida_actual <= 0){
            Pokemon_amigo.vida_actual = Float.valueOf(0);
            showAlert(alert(Pokemon_amigo));

        }
    }
   private void control_vida_enemigo() {
        if (oponente.vida_actual <= 0) {
            oponente.vida_actual = Float.valueOf(0);
            showAlert2(alert_enemigo(oponente));
        }
    }
    private void showAlert(Alert alert) {
        Optional<ButtonType> decission = alert.showAndWait();
        if (decission.get() == ButtonType.NO) {
            System.exit(0);
        } else {
            ventana1Controller.stage2.close();
            ventana1Controller.actualizar_pokemon(Pokemon_amigo);
        }
    }
    private void showAlert2(Alert alert_enemigo){
        Optional<ButtonType> decission =alert_enemigo.showAndWait();
        if(decission.get() == ButtonType.NO){
            System.exit(0);
        }else{
            ventana1Controller.stage2.close();
            ventana1Controller.actualizar_pokemon(Pokemon_amigo);
        }
    }
    private void contador() {
        if (Pokemon_amigo.index == 1) {
            Ventana1Controller.cont_p1++;
        }
        if (Pokemon_amigo.index == 2) {
            Ventana1Controller.cont_p2++;
        }
        if (Pokemon_amigo.index == 3) {
            Ventana1Controller.cont_p3++;
        }
        if (Pokemon_amigo.index == 4) {
            Ventana1Controller.cont_p4++;
        }
        if (Pokemon_amigo.index == 5) {
            Ventana1Controller.cont_p5++;
        }
        if (Pokemon_amigo.index == 6) {
            Ventana1Controller.cont_p6++;
        }
    }

    public Alert alert(Pokemon pokemon_amigo){
        Alert alert=new Alert(Alert.AlertType.NONE);
        alert.setHeaderText(null);
        alert.setContentText(pokemon_amigo.nombre+"\n ha perdido \n Elegir otro pokemon pulse SI \n Salir del programa NO");
        alert.setTitle("Choose an option");
        alert.setGraphic(new ImageView(pokemon_amigo.foto.toURI().toString()));
        alert.getDialogPane().getButtonTypes().addAll(ButtonType.YES,ButtonType.NO);
        return alert;

    }
    public Alert alert_enemigo(Pokemon_enemigo oponentes){
        Alert alert=new Alert(Alert.AlertType.NONE);
        alert.setHeaderText(null);
        alert.setContentText("tu pokemon ha derrotado a: \n"+oponentes.nombre+" \n Elegir otro pokemon pulse SI \n Salir del programa NO");
        alert.setTitle("Choose an option");
        alert.setGraphic(new ImageView(oponentes.foto.toURI().toString()));
        alert.getDialogPane().getButtonTypes().addAll(ButtonType.YES,ButtonType.NO);
        return alert;

    }


    void enviarController1(Ventana1Controller Ventana1Controller) {
        this.ventana1Controller = Ventana1Controller;

    }


    public void mochila(MouseEvent mouseEvent) {
    }
}





