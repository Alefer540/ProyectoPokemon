package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.util.ArrayList;




public class Ventana2controller {

    ArrayList<Pokemon_enemigo> Pokemon_enemigos = new ArrayList();
    Pokemon_enemigo p_e1 = new Pokemon_enemigo("Arbok",250f,250f,"NV.70",new Image("https://static.wikia.nocookie.net/espokemon/images/b/b8/Arbok_NB_variocolor.gif/revision/latest/scale-to-width-down/84?cb=20110426043824"),new Image("https://cdn-icons-png.flaticon.com/512/90/90704.png"));
    Pokemon_enemigo p_e2 = new Pokemon_enemigo("Palkia",650f,650f,"NV.120",new Image( "https://static.wikia.nocookie.net/espokemon/images/e/ef/Palkia_NB_variocolor.gif/revision/latest/scale-to-width-down/87?cb=20130427180202"), new Image("https://cdn-icons-png.flaticon.com/512/90/90704.png"));
    Pokemon_enemigo p_e3 = new Pokemon_enemigo("Onix",200f,200f,"NV.55",new Image("https://static.wikia.nocookie.net/espokemon/images/d/d3/Onix_NB.gif/revision/latest/scale-to-width-down/81?cb=20101031234953"),new Image("https://cdn-icons-png.flaticon.com/512/90/90704.png"));
    Pokemon_enemigo p_e4 = new Pokemon_enemigo("Gyarados",200f,200f,"NV.55",new Image("https://static.wikia.nocookie.net/espokemon/images/1/11/Gyarados_NB_variocolor.gif/revision/latest/scale-to-width-down/126?cb=20110327230349"),new Image("https://cdn-icons-png.flaticon.com/512/90/90704.png"));


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

    Pokemon_enemigo oponente;
    Pokemon x;

    public void funcioninicio(Pokemon x) {
        this.x = x;
        img_espaldas.setImage(x.foto_detras);
        name_pokemon.setText(x.nombre);
        nivel_pokemon.setText(x.nivel);
        img_sexo.setImage(x.sexo);
        pb_vida_actual.setProgress(x.vida_actual/x.vida);
        Pokemon_enemigos.add(p_e1);
        Pokemon_enemigos.add(p_e2);
        Pokemon_enemigos.add(p_e3);
        Pokemon_enemigos.add(p_e4);
        oponente = Pokemon_enemigos.get((int) (Math.random() * Pokemon_enemigos.size()));
        img_enemigo.setImage(oponente.foto);
        name_enemigo_pokemon.setText(oponente.nombre);
        nivel_enemigo_pokemon.setText(oponente.nivel);
        vida_actual_enemigo.setProgress(oponente.vida_actual/oponente.vida);
        img_sexo_enemigo.setImage(oponente.sexo);
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
    private  void ataque(){
        vida_actual_enemigo.setProgress((oponente.vida_actual-20)/oponente.vida);
        oponente.vida_actual -= 20;
        System.out.println("CONTROL");
        pb_vida_actual.setProgress((x.vida_actual-20)/x.vida);
        x.vida_actual -=20;
    }
    @FXML
    private  void ataque_arriesgado(){
        int i = (int) (Math.random()*(26-11));
        vida_actual_enemigo.setProgress((oponente.vida_actual-i)/oponente.vida);
        oponente.vida_actual -= i ;
        System.out.println("Daño pokemon amigo arriesgado "+i);
        int a = (int) (Math.random()*(26-11));
        pb_vida_actual.setProgress((x.vida_actual-i)/x.vida);
        x.vida_actual -=a;
        System.out.println("Daño pokemon enemigo arriesgado "+i);

    }
    @FXML
    private  void ataque_muy_arriesgado(){
        int i = (int) (Math.random()*(51-1));
        vida_actual_enemigo.setProgress((oponente.vida_actual-i)/oponente.vida);
        oponente.vida_actual -= i ;
        System.out.println("Daño pokemon amigo  ataque muy arriesgado "+i);
        int a = (int) (Math.random()*(51-1));
        pb_vida_actual.setProgress((x.vida_actual-i)/x.vida);
        x.vida_actual -=a;
        System.out.println("Daño pokemon enemigo ataque muy arriesgado "+i);
        if(oponente.vida_actual>x.vida) {
            x.vida_actual = x.vida;
        }


    }
    @FXML
    private void curarse() {
        int i = (int) (Math.random() * (76 - 26));
        pb_vida_actual.setProgress((x.vida_actual + i) / x.vida);
        x.vida_actual += i;
        System.out.println("pokemon se cura " + i);
        if (x.vida_actual > x.vida) {
            x.vida_actual = x.vida;
        }
        int a = (int) (Math.random() * (76 - 26));
        vida_actual_enemigo.setProgress((oponente.vida_actual + i) / oponente.vida);
        oponente.vida_actual += a;
        System.out.println("pokemon se cura " + i);
        if (oponente.vida_actual > oponente.vida) {
            oponente.vida_actual = oponente.vida;
        }
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

    void enviarController1(Ventana1Controller Ventana1Controller) {
        this.ventana1Controller = Ventana1Controller;
    }


}





class Pokemon_enemigo {
    final String nombre;
    final Float vida;
    Float vida_actual;
    final String nivel;
    final Image sexo;
    final Image foto;


    Pokemon_enemigo(String nombre, Float vida, Float vida_actual, String nivel, Image foto, Image sexo) {
        this.nombre = nombre;
        this.vida = vida;
        this.vida_actual = vida_actual;
        this.nivel = nivel;
        this.foto = foto;
        this.sexo = sexo;

    }
}





