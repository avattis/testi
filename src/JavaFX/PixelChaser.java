package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {
    Pane pane;
    Rectangle ruut;


    int ristkülikuPikkus = 60;
    int ristkülikuKorgus = 30;

    private Rectangle klikitud;

    ArrayList<Rectangle> list = new ArrayList<>();
    ArrayList<Rectangle> listv = new ArrayList<>();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage =new Stage();
        pane = new Pane();

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();

        genereeriRuudud();
        reageeriKlikile();
    }


    private void reageeriKlikile() {
        for (int i = 0; i < list.size(); i++) {

            Rectangle ruudud = list.get(i);
            ruudud.setOnMouseClicked(event -> {
                if (ruudud.getWidth() == ristkülikuKorgus && ruudud.getHeight() == ristkülikuPikkus) {
                    ruudud.setHeight(ristkülikuKorgus / 2);
                    ruudud.setWidth(ristkülikuPikkus / 2);
                } else {
                    ruudud.setVisible(false);
                }
            });

        }
    }

    public void genereeriRuudud() {
        for (int i = 0; i < 2; i++) {
            ruut = new Rectangle(ristkülikuKorgus, ristkülikuPikkus);

            Random random = new Random();
            int ranX = random.nextInt(400); // random value from 0 to width
            int ranY = random.nextInt(400);
            ruut.relocate(ranX, ranY);
            System.out.println(ranX);
            System.out.println(ranY);
            ruut.setFill(Color.RED);
            ruut.setStroke(Color.BLACK);
            list.add(ruut);

            pane.getChildren().addAll(ruut);
        }
    }
}
