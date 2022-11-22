package com.example.arc;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class arc extends Application {
    final double SIZE = 400.0;
    final double RADIUS = SIZE / 2.0;
    final static int RED = 25;
    final static int GREEN = 35;
    final static int BLUE = 25;
    final static int BLACK = 15;

    @Override/*from   w w w .j a v  a2  s.com*/
    public void start(Stage primaryStage) {

        // Create the pie slices
        double startAngle = 0;
        Arc red = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (RED / 100.0));
        red.setFill(Color.RED);
        red.setType(ArcType.ROUND);
        startAngle += 360 * (RED / 100.0);

        Arc green = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (GREEN / 100.0));
        green.setFill(Color.GREEN);
        green.setType(ArcType.ROUND);
        startAngle += 360 * (GREEN / 100.0);

        Arc blue = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (BLUE / 100.0));
        blue.setFill(Color.BLUE);
        blue.setType(ArcType.ROUND);
        startAngle += 360 * (BLUE / 100.0);

        Arc black = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (BLACK / 100.0));
        black.setFill(Color.BLACK);
        black.setType(ArcType.ROUND);


        // Create the text labels
        Text tred = new Text("RED - " + RED + "%");
        tred.setX(RADIUS + RADIUS / 8);
        tred.setY(RADIUS - RADIUS / 4);

        Text tgreen = new Text("GREEN - " + GREEN + "%");
        tgreen.setY(RADIUS);

        Text tblue = new Text("BLUE - " + BLUE + "%");
        tblue.setX(RADIUS);
        tblue.setY(RADIUS + 350 / 2);

        Text tblack = new Text("BLACK - " + BLACK + "%");
        tblack.setX(380);
        tblack.setY(300);

        Pane pie = new Pane();
        pie.getChildren().addAll(red, green, blue, black, tred, tgreen, tblue, tblack);

        StackPane pane = new StackPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20));
        pane.getChildren().add(pie);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}