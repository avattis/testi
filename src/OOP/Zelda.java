package OOP;

/**
 * Created by annelyvattis on 1/19/17.
 */
public class Zelda {
    int elud;
    int koll;

    public Zelda(int elusid){
        elud = elusid;
    }

    public void kaklusKolliga(int kollilElusid) {
        koll = kollilElusid;
        elud = elud - koll;
    }

    public void prindiMituEluAlles() {
        System.out.println("elusid " + elud);
    }

    public void prindiKasOnElus() {
        if (elud > 0){
            System.out.println("Elus");
        }else {
            System.out.println("Surnud");
        }
    }
}
