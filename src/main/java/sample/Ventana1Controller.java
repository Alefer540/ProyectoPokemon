package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Ventana1Controller {
	int cont = 0;
	Pokemon pokemon_amigo;
	public static int danorecibido=0;
	public static int danodado=0;
	public static int cont_p1=0;
	public static int cont_p2=0;
	public static int cont_p3=0;
	public static int cont_p4=0;
	public static int cont_p5=0;
	public static int cont_p6=0;







	ArrayList<Pokemon> ArraylistPokemon = new ArrayList();
	Pokemon p1 = new Pokemon(1, "Jolteon", 204f, 204f, "LV.65", new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Jolteon.gif"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\femenino.jpg"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Jolteon_espalda.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\evee.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Vaporeon.gif"),"Jolteon, Pokemon relampago.Cuando un Jolteon esta furioso, o asustado, los pelos del cuerpo se convierten en agujas que dispara contra sus adversarios. Absorbe atomos cargados, y es capaz de producir 10.000 voltios de electricidad.",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\estrella.jpg"));
	Pokemon p2 = new Pokemon(2, "Charizard", 148f, 148f, "LV.45", new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\charizard.gif"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\masculino.jpg"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Charizard_espalda.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\charmeleon2.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\charmander.jpg"),"Charizard, el Pokemon llama. Charizard es de tipo volador y fuego. Cuando libra combates intensos, su llama se vuelve mucho mas potente.",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\estrella.jpg"));
	Pokemon p3 = new Pokemon(3, "Vapereon", 234f, 234f, "LV.54",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Vaporeon.gif"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\femenino.jpg"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Vaporeon_espalda.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\evee.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Jolteon.gif"),"Vaporeon, el Pokemon burbuja y forma evolucionada de Eevee. La composicion de sus celulas es similar a las de las moleculas de agua y por ello puede fundirse en el agua.",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\estrella.jpg"));
	Pokemon p5 = new Pokemon(4, "Pikachu", 222f, 222f, "LV.65",  new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Pikachu.gif"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\masculino.jpg"),  new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Pikachu_espalda.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Pichu_E.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\raichu2.gif"),"Pikachu, el Pokemon raton. Puede generar ataques electricos desde los coloretes electricos localizados en sus mejillas.",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\estrella.jpg"));
	Pokemon p4 = new Pokemon(5, "Mewtwo", 298f, 298f, "LV.75", new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Mewtwo.gif"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\masculino.jpg"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Mewtwo_espalda.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Mewtwo.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\mewtwo_s.gif"),"Mewtwo es sumamente habil con sus poderes psiquicos: puede volar mediante la levitacion, comunicarse telepaticamente, reflejar ataques como hiperrayo, bloquear las habilidades especiales de los demas Pokemon y tomar el mando de la mente de otra criatura viva mediante hipnosis.",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\estrella.jpg"));
	Pokemon p6 = new Pokemon(6, "Butterfree", 160f, 160f, "LV.54", new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Butterfree.gif"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\femenino.jpg"), new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\Butterfree_espalda.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\caterpie.gif"),new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\metapod.gif")," Butterfree, el Pokemon mariposa. Butterfree es la forma evolucionada de Metapod. Las escamas que cubren sus alas le ayudan a deshacerse del agua.",new File(".\\src\\main\\java\\sample\\ImagenesPokemon\\estrella.jpg"));

	//POKEMON 1
	@FXML
	AnchorPane Anchor1;
	@FXML
	ImageView Sexo1;
	@FXML
	Label l1Nombre1;
	@FXML
	Label l2Nivel1;
	@FXML
	Label l3Vida1;
	@FXML
	ImageView img1;
	@FXML
	ProgressBar progress1;
	@FXML
	ImageView estrellita1;

	//POKEMON 2
	@FXML
	AnchorPane Anchor2;
	@FXML
	ImageView Sexo2;
	@FXML
	Label l4Nombre2;
	@FXML
	Label l5Nivel2;
	@FXML
	Label l6Vida2;
	@FXML
	ImageView img2;
	@FXML
	ImageView estrellita2;
	@FXML
	ProgressBar progress2;
	//POKEMON 3
	@FXML
	AnchorPane Anchor3;
	@FXML
	ImageView Sexo3;
	@FXML
	ImageView img3;
	@FXML
	Label l7Nombre3;
	@FXML
	Label l8Nivel3;
	@FXML
	Label l9Vida3;
	@FXML
	ImageView estrellita3;
	@FXML
	ProgressBar progress3;
	//POKEMON4
	@FXML
	AnchorPane Anchor4;
	@FXML
	ImageView img4;
	@FXML
	ImageView Sexo4;
	@FXML
	Label l10Nombre4;
	@FXML
	Label l11Nivel4;
	@FXML
	ProgressBar progress4;
	@FXML
	Label l12Vida4;
	@FXML
	ImageView estrellita4;
	//POKEMON 5
	@FXML
	AnchorPane Anchor5;
	@FXML
	ImageView img5;
	@FXML
	Label l13Nombre5;
	@FXML
	Label l14Nivel5;
	@FXML
	Label l15Vida5;
	@FXML
	ProgressBar progress5;
	@FXML
	ImageView Sexo5;
	@FXML
	ImageView estrellita5;
	//POKEMON 6
	@FXML
	AnchorPane Anchor6;
	@FXML
	ImageView img6;
	@FXML
	ImageView Sexo6;
	@FXML
	Label l16Nombre6;
	@FXML
	Label l17Nivel6;
	@FXML
	Label l18Vida6;
	@FXML
	ProgressBar progress6;
	@FXML
	ImageView estrellita6;

	//boton siguiente pagina
	@FXML
	Button boton_combate1;
	@FXML
	Button boton_estadisticas;
	@FXML
	Button boton_pokedex;


	private Ventana2controller v;

	@FXML
	public void initialize() {
		ArraylistPokemon.add(p1);
		ArraylistPokemon.add(p2);
		ArraylistPokemon.add(p3);
		ArraylistPokemon.add(p4);
		ArraylistPokemon.add(p5);
		ArraylistPokemon.add(p6);
		l1Nombre1.setText(p1.nombre);
		l2Nivel1.setText("" + p1.nivel);
		l3Vida1.setText("" + p1.vida_actual);
		l4Nombre2.setText(p2.nombre);
		l5Nivel2.setText("" + p2.nivel);
		l6Vida2.setText("" + p2.vida_actual);
		l7Nombre3.setText(p3.nombre);
		l8Nivel3.setText("" + p3.nivel);
		l9Vida3.setText("" + p3.vida_actual);
		l10Nombre4.setText(p4.nombre);
		l11Nivel4.setText("" + p4.nivel);
		l12Vida4.setText("" + p4.vida_actual);
		l13Nombre5.setText(p5.nombre);
		l14Nivel5.setText("" + p5.nivel);
		l15Vida5.setText("" + p5.vida_actual);
		l16Nombre6.setText(p6.nombre);
		l17Nivel6.setText("" + p6.nivel);
		l18Vida6.setText("" + p6.vida_actual);
		Image imagensexo1= new Image((p1.sexo.toURI().toString()));
		Sexo1.setImage(imagensexo1);
		Image imagensexo2= new Image((p2.sexo.toURI().toString()));
		Sexo2.setImage(imagensexo2);
		Image imagensexo3= new Image((p3.sexo.toURI().toString()));
		Sexo3.setImage(imagensexo3);
		Image imagensexo4= new Image((p4.sexo.toURI().toString()));
		Sexo4.setImage(imagensexo4);
		Image imagensexo5= new Image((p5.sexo.toURI().toString()));
		Sexo5.setImage(imagensexo5);
		Image imagensexo6= new Image((p6.sexo.toURI().toString()));
		Sexo6.setImage(imagensexo6);
		Image imagen1=new Image(p1.foto.toURI().toString());
		img1.setImage(imagen1);
		Image imagen2=new Image(p2.foto.toURI().toString());
		img2.setImage(imagen2);
		Image imagen3=new Image(p3.foto.toURI().toString());
		img3.setImage(imagen3);
		Image imagen4=new Image(p4.foto.toURI().toString());
		img4.setImage(imagen4);
		Image imagen5=new Image(p5.foto.toURI().toString());
		img5.setImage(imagen5);
		Image imagen6=new Image(p6.foto.toURI().toString());
		img6.setImage(imagen6);
		Image imagenestrellita1=new Image(p1.estrella.toURI().toString());
		estrellita1.setImage(imagenestrellita1);
		Image imagenestrellita2=new Image(p2.estrella.toURI().toString());
		estrellita2.setImage(imagenestrellita2);
		Image imagenestrellita3=new Image(p3.estrella.toURI().toString());
		estrellita3.setImage(imagenestrellita3);
		Image imagenestrellita4=new Image(p5.estrella.toURI().toString());
		estrellita4.setImage(imagenestrellita4);
		Image imagenestrellita5=new Image(p4.estrella.toURI().toString());
		estrellita5.setImage(imagenestrellita5);
		Image imagenestrellita6=new Image(p6.estrella.toURI().toString());
		estrellita6.setImage(imagenestrellita6);
		progress1.setProgress(p1.vida_actual / p1.vida);
		progress2.setProgress(p2.vida_actual / p2.vida);
		progress3.setProgress(p3.vida_actual / p3.vida);
		progress4.setProgress(p4.vida_actual / p4.vida);
		progress5.setProgress(p5.vida_actual / p5.vida);
		progress6.setProgress(p6.vida_actual / p6.vida);
		boton_combate1.setDisable(true);
		boton_pokedex.setDisable(true);





	}

	@FXML
	private void clickear1() {
		System.out.println("anchor pulsado");
		desclick();
		opacity();
		boton_pokedex();
		boton_combate();
		Anchor1.setStyle("-fx-background-color:#675073");
		img1.setStyle("-fx-opacity:1");
		cont = 1;
		pokemon_amigo = p1;

	}

	@FXML
	private void clickear2() {
		System.out.println("anchor pulsado");
		desclick();
		opacity();
		boton_pokedex();
		boton_combate();
		Anchor2.setStyle("-fx-background-color:#675073;");
		img2.setStyle("-fx-opacity:1");
		cont = 1;
		pokemon_amigo = p2;
	}

	@FXML
	private void clickear3() {
		System.out.println("anchor pulsado");
		desclick();
		opacity();
		boton_pokedex();
		boton_combate();
		Anchor3.setStyle("-fx-background-color:#675073;");
		img3.setStyle("-fx-opacity:1");
		pokemon_amigo = p3;
		cont = 1;
	}

	@FXML
	private void clickear4() {
		System.out.println("anchor pulsado");
		desclick();
		opacity();
		boton_pokedex();
		boton_combate();
		Anchor4.setStyle("-fx-background-color:#675073;");
		img4.setStyle("-fx-opacity:1");
		cont = 1;
		pokemon_amigo = p4;
	}

	@FXML
	private void clickear5() {
		System.out.println("anchor pulsado");
		desclick();
		opacity();
		boton_pokedex();
		boton_combate();
		Anchor5.setStyle("-fx-background-color:#675073;");
		img5.setStyle("-fx-opacity:1");
		cont = 1;
		pokemon_amigo = p5;
	}

	@FXML
	private void clickear6() {
		System.out.println("anchor pulsado");
		desclick();
		opacity();
		boton_pokedex();
		boton_combate();
		Anchor6.setStyle("-fx-background-color: #675073;");
		img6.setStyle("-fx-opacity:1");
		cont = 1;
		pokemon_amigo = p6;
	}

	Stage stage2;
	Stage stage3;
	Stage stage4;

	@FXML
	public void pelea() {
		System.out.println("Boton pulsado pasamos al siguiente escenario");
		try {

			stage2 = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/ventana2.fxml"));

			BorderPane root = loader.load();
			Scene scene = new Scene(root, 700, 450);

			stage2.setScene(scene);
			stage2.show();

			Ventana2controller v = loader.getController();
			v.funcioninicio(pokemon_amigo);
			v.enviarController1(this);


		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@FXML
	public void pokedex() {
		System.out.println("Boton pulsado pasamos al siguiente escenario");
		try {

			stage4 = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Ventana4.fxml"));

			BorderPane root = loader.load();
			Scene scene = new Scene(root, 400, 600);
			//stage4.setResizable(false);

			stage4.setScene(scene);
			stage4.show();

			Ventana4Controller v = loader.getController();
			v.datos(pokemon_amigo);
			v.enviarController1(this);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	@FXML
	public void estadisticas() {
		System.out.println("Boton pulsado pasamos al siguiente escenario");
		try {

			stage3 = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/ventana3.fxml"));

			BorderPane root = loader.load();
			Scene scene = new Scene(root, 700, 450);

			stage3.setScene(scene);
			stage3.show();

			Ventana3controller v = loader.getController();
			v.datosPiechart(danodado,danorecibido);
			v.datosGraficoBarras(cont_p1,cont_p2,cont_p3,cont_p4,cont_p5,cont_p6);




		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	@FXML
	private void desclick() {
		Anchor6.setStyle("-fx-background-color: #7D6A87;");
		Anchor1.setStyle("-fx-background-color: #7D6A87;");
		Anchor2.setStyle("-fx-background-color: #7D6A87;");
		Anchor3.setStyle("-fx-background-color: #7D6A87;");
		Anchor4.setStyle("-fx-background-color: #7D6A87;;");
		Anchor5.setStyle("-fx-background-color: #7D6A87;;");

	}

	private void opacity() {
		img1.setStyle("-fx-opacity:0.5");
		img2.setStyle("-fx-opacity:0.5");
		img3.setStyle("-fx-opacity:0.5");
		img4.setStyle("-fx-opacity:0.5");
		img5.setStyle("-fx-opacity:0.5");
		img6.setStyle("-fx-opacity:0.5");
	}

	private void boton_combate() {
		boton_combate1.setDisable(false);
		boton_combate1.setStyle("-fx-opacity:1;-fx-border-color: #bf67ac; -fx-background-color:  #7D6A87; -fx-border-width: 5; -fx-background-radius: 20; -fx-border-radius: 20;");
	}
	private void boton_pokedex(){
		boton_pokedex.setDisable(false);
		boton_pokedex.setStyle("-fx-opacity:1;-fx-border-color: #bf67ac; -fx-background-color:  #7D6A87; -fx-border-width: 5; -fx-background-radius: 20; -fx-border-radius: 20;");
	}


	public void actualizar_pokemon(Pokemon pokemon_amigo) {
		ArraylistPokemon.set(pokemon_amigo.getIndex(), pokemon_amigo);
		initialize();
	}


}