package sample;

import javafx.scene.image.Image;

import java.io.File;

public class Pokemon{
    int index;
    String nombre;
    Float vida;
    Float vida_actual;
    String nivel;
    File sexo;
    File foto;
    File foto_detras;
    File evo1;
    File evo;
    String descrip;
    File estrella;

    Pokemon(int index, String nombre, Float vida, Float vida_actual, String nivel, File foto, File sexo, File foto_detras,File evo,File evo1,String descrip,File estrella) {
        this.index = index;
        this.nombre=nombre;
        this.vida=vida;
        this.vida_actual=vida_actual;
        this.nivel=nivel;
        this.foto=foto;
        this.sexo=sexo;
        this.foto_detras=foto_detras;
        this.evo=evo;
        this.evo1=evo1;
        this.descrip=descrip;
       this.estrella=estrella;

    }

    public int getIndex(){
        return index;
    }


}
