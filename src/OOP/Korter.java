//Pidu objekt

package OOP;

import java.util.ArrayList;

/**
 * Created by annelyvattis on 1/19/17.
 */
public class Korter {
    ArrayList<String> korter = new ArrayList<>();
    int mahutavus;
    int paljuMahubVeel;

    public Korter(int mahutab) {
        mahutavus = mahutab;
    }


    public void saabus(String kes) {
        if (korter.size() < mahutavus) {
            korter.add(kes);
        } else {
            System.out.println("Sa ei mahu kahjuks peole, meid on juba 10");
        }
    }

    public void prindiKylalisteArv() {
        System.out.println("korteri suurus " + korter.size());

    }

    public void prindiPaljuVeelMahub() {
        paljuMahubVeel = mahutavus - korter.size();
        System.out.println(paljuMahubVeel);
    }

    public void lahkus(String kes) {
        korter.remove(kes);

    }
}

