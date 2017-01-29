

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        int sonepikkus = 0 / naide.length;
        int size = naide.length;

        for (int i = 0; i < size; i++) {
            sonepikkus += naide[i].length();
            System.out.println(sonepikkus);
        }
        int sonekeskminepikkus = sonepikkus / size;
        System.out.println(sonekeskminepikkus);

        int pikemadsoned = 0;
        for (int i = 0; i < size; i++) {
            if (naide[i].length() > sonekeskminepikkus)
                pikemadsoned ++;

        }
        System.out.println("pikemaid on " + pikemadsoned);

    }
}
