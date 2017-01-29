package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


import java.util.Stack;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring extends Application{
    int xkord;
    int ykord;
    int raad;
    String a;
    String b;
    String c;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 500,500);

        TextField x = new TextField();
        x.setPromptText("x kordinaat");
        TextField y = new TextField();
        y.setPromptText("y kordinaat");
        TextField raadius = new TextField();
        raadius.setPromptText("raadius");

        Button button = new Button("Start");

        button.setOnAction(event ->{
                a = x.getText();
                xkord = Integer.parseInt(a);
            System.out.println(xkord);
            b = y.getText();
            ykord = Integer.parseInt(b);
            c = raadius.getText();
            raad = Integer.parseInt(c);
            Circle ring = new Circle();
            ring.setRadius(raad);
            ring.setCenterX(xkord);
            ring.setCenterY(ykord);
            vbox.getChildren().add(ring);
        });

        

        vbox.setPadding(new Insets(10, 50, 50, 50));
        vbox.setSpacing(2);
        vbox.getChildren().addAll(x,y,raadius,button);



        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
