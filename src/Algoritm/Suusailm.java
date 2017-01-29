package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        int pos1 = 0;
        int neg1 = 0;
        for (int i = 0; i <kraadid1.length ; i++) {
            if (kraadid1[i] >=0){
                pos1 ++;

            }else
                neg1++;
        }
        System.out.println("pos " + pos1 +  " neg " + neg1);

        int pos2 = 0;
        int neg2 = 0;
        for (int i = 0; i <kraadid2.length ; i++) {
            if (kraadid2[i] >=0){
                pos2 ++;

            }else
                neg2++;
        }
        System.out.println("pos " + pos2 +  " neg " + neg2);
    }
}
