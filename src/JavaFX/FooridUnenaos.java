package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {
    Circle ring = new Circle(50);
    ArrayList<Circle> foor = new ArrayList<>();

    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        int width = 450;
        int height = 450;

        for (int i = 0; i < 3; i++) {
            ring = new Circle(50);
            ring.setFill(Color.RED);
            ring.setId("ring");
            Random random = new Random();
            int ranX = random.nextInt(width); // random value from 0 to width
            int ranY = random.nextInt(height);
            ring.relocate(ranX, ranY);
            System.out.println(ranX);
            System.out.println(ranY);

            foor.add(ring);
            System.out.println(ring);

            pane.getChildren().addAll(ring);
        }
        primaryStage.show();
        reageeriklikile();
    }

    private void reageeriklikile() {
        for (int i = 0; i <foor.size(); i++) {

        Circle tsekinRingi = foor.get(i);
        tsekinRingi.setOnMouseEntered(event -> {
            tsekinRingi.setFill(Color.GREEN);

        });
        }

    }
}
