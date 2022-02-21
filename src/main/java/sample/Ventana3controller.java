package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

public class Ventana3controller {



    @FXML
    PieChart graficaQuesito;
    @FXML
    BarChart graficoBarras;

    public void datosPiechart(int danodado, int danorecibido) {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("DADO",danodado),
                        new PieChart.Data("RECIBIDO",danorecibido));
        graficaQuesito.setLabelLineLength(10);
        graficaQuesito.setData(pieChartData);
    }


    public void datosGraficoBarras(int cont_p1, int cont_p2, int cont_p3, int cont_p4, int cont_p5, int cont_p6) { String Jolteon = "Jolteon";


         CategoryAxis xAxis = new CategoryAxis();
         NumberAxis yAxis = new NumberAxis();
         xAxis.setLabel("Pokemon");
         yAxis.setLabel("Veces");

        graficoBarras.setTitle("Veces Seleccionado");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Jolteon");
        series1.getData().add(new XYChart.Data("Jolteon", cont_p1));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Charizard");
        series2.getData().add(new XYChart.Data("Charizard", cont_p2));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Vaporeon");
        series3.getData().add(new XYChart.Data("Vaporeon", cont_p3));

        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Pikachu");
        series4.getData().add(new XYChart.Data("Pikachu", cont_p4));

        XYChart.Series series5 = new XYChart.Series();
        series5.setName("Mewtwo");
        series5.getData().add(new XYChart.Data("Mewtwo", cont_p5));

        XYChart.Series series6 = new XYChart.Series();
        series6.setName("Butterfree");
        series6.getData().add(new XYChart.Data("Butterfree", cont_p6));

        graficoBarras.setAnimated(false);
        graficoBarras.setCategoryGap(50);
        graficoBarras.getData().addAll(series1,series2,series3,series4,series5,series6);




    }


}
