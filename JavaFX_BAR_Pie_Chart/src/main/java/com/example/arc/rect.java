package com.example.arc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class rect extends Application {
    final static String red = "RED";
    final static String green = "GREEN";
    final static String blue = "BLUE";
    final static String black = "BLACK";

    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart");
        final CategoryAxis xAxis =         new CategoryAxis();
        final NumberAxis yAxis =           new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);

        bc.setTitle("Bar Chart");

        XYChart.Series color = new XYChart.Series();
        color.setName("Color");
        color.getData().add(new XYChart.Data(red, 25));
        color.getData().add(new XYChart.Data(green, 35));
        color.getData().add(new XYChart.Data(blue, 25));
        color.getData().add(new XYChart.Data(black, 15));

        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(color);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}