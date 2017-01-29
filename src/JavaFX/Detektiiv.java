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
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {
    Circle ring = new Circle(50);
    ArrayList<Circle> list = new ArrayList<>();

    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        int width = 450;
        int height = 450;


        for (int i = 0; i < 3; i++) {
            ring = new Circle(50);
            Random random = new Random();
            int ranX = random.nextInt(width); // random value from 0 to width
            int ranY = random.nextInt(height);
            ring.relocate(ranX, ranY);
            System.out.println(ranX);
            System.out.println(ranY);
            ring.setFill(Color.WHITE);

            list.add(ring);

            pane.getChildren().addAll(ring);
        }
        primaryStage.show();


        for (int i = 0; i < list.size(); i++) {
            Circle tsekinRingi = list.get(i);
            tsekinRingi.setOnMouseEntered(event -> {
                tsekinRingi.setFill(Color.BLACK);
            });


        }
    }
}

