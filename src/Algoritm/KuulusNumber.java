



import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

        ArrayList<Integer> ilmakolmedeta = new ArrayList();

        for (int i = 0; i <naide.length ; i++) {
                if (naide[i] != 3) {
                    ilmakolmedeta.add(naide[i]);
                }

            System.out.println(ilmakolmedeta);


        }
    }

}
