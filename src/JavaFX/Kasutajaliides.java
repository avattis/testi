package JavaFX;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

/**
 * Created by annelyvattis on 1/27/17.
 */
public class Kasutajaliides {
    Pane pane;
    TextField textField;


    Button submit;

    public Kasutajaliides(Pane panesisse) {
        pane = panesisse;
        lookasutajaliides();
        joonistaJoon();

    }

    private void joonistaJoon() {
        submit.setTranslateX(200);
        submit.setOnAction(event ->{
            String input = textField.getText();

            String[] k = input.split("-");
            int[] intK = new int[k.length];
            for (int i = 0; i < k.length ; i++) {
                intK[i] = Integer.parseInt(k[i]);

            }

            Line line = new Line(intK[0], intK[1], intK[2], intK[3]);
            pane.getChildren().add(line);
        });
    }


    private void lookasutajaliides() {
        textField = new TextField();


        submit = new Button("Joonista!");
        submit.setTranslateX(200);
        pane.getChildren().addAll(textField, submit);
    }
}
