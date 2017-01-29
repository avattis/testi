package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {
    int xkord;
    int ykord;
    int korg;
    int lai;
    String a;
    String b;
    String c;
    String d;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Scene scene = new Scene(pane, 500,500);

        TextField x = new TextField();
        x.setPromptText("x kordinaat");
        x.setTranslateX(0);
        TextField y = new TextField();
        y.setPromptText("y kordinaat");
        y.setTranslateX(100);
        TextField korgus = new TextField();
        korgus.setPromptText("kõrgus");
        korgus.setTranslateX(200);
        TextField laius = new TextField();
        laius.setPromptText("laius");
        laius.setTranslateX(300);

        Button button = new Button("Start");
        button.setTranslateX(400);

        button.setOnAction(event ->{
            a = x.getText();
            xkord = Integer.parseInt(a);
            System.out.println(xkord);
            b = y.getText();
            ykord = Integer.parseInt(b);
            c = korgus.getText();
            korg = Integer.parseInt(c);
            d = laius.getText();
            lai = Integer.parseInt(d);
            Rectangle ruut = new Rectangle(xkord,ykord,korg,lai);

            pane.getChildren().add(ruut);

        });



        pane.setPadding(new Insets(10, 50, 50, 50));

        pane.getChildren().addAll(x,y,korgus,laius,button);



        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
