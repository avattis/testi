package Algoritm;

import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        ArrayList<Integer> korrutatud = new ArrayList(); // uus arraylist kuhu panna massivist võetud arvud

        for (int i = 0; i <naide.length; i++) { // käin läbi massiivi
            if (naide[i] == 7){                 // 7-d korrutan 2-ga
                naide[i] = 7 * 2;
                korrutatud.add(naide[i]);       // lisan numbri arraylisti
            }else
                korrutatud.add(naide[i]);
        }
        System.out.println(korrutatud);     // prindin saadud arraylisti välja, hea võrdluseks algse massiiviga.

        int sum = 0;
        for (int i = 0; i <korrutatud.size() ; i++) { // arraylistis olevad numbrid liidan kokku
            sum += korrutatud.get(i);
        }
        System.out.println(sum);
        int lopptulemus = sum / korrutatud.size();  // liitmisel saadud tulemuse jagan arraylisti pikkusega.
        System.out.println(lopptulemus);
    }
}
