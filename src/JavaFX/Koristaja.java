package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    Circle ring = new Circle(50);
    ArrayList<Circle> ringid = new ArrayList<>();

    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        Random rand=new Random();

        Label l = new Label("Üllatus");
        l.setTranslateX(rand.nextInt(400)+50);
        l.setTranslateY(rand.nextInt(400)+50);
        pane.getChildren().add(l);

        for (int i = 0; i < 200; i++) {
            ring = new Circle(50);
            ring.setFill(Color.BLACK);

            ring.setTranslateX(Math.random()*500);
            ring.setTranslateY(Math.random()*500);


            ringid.add(ring);


            pane.getChildren().addAll(ring);
        }
        primaryStage.show();
        reageeriklikile();
    }

    private void reageeriklikile() {
        for (int i = 0; i <ringid.size(); i++) {

            Circle tsekinRingi = ringid.get(i);
            tsekinRingi.setOnMouseEntered(event -> {
                tsekinRingi.setVisible(false);

            });
        }

    }
}
