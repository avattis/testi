package OOP;

import java.util.ArrayList;

/**
 * Created by annelyvattis on 1/19/17.
 */
public class Sonaraamat {
    String keel;
    ArrayList<String> raamatud = new ArrayList<>();

    public Sonaraamat (String raamatuKeel){
        keel = raamatuKeel;
    }
    public void sisestaSona(String Raamat){
        raamatud.add(Raamat);
        System.out.println(raamatud);
    }
    public String[] otsiEsimeseTaheJargi(String u){
        char esimeneTaht = u.charAt(0);
        ArrayList <String> sobivaAlgusega = new ArrayList <String>();//seda ei tohi üles panna, sest siis ta lisab vast2 eelmistele väärutustele juurde, mitte ei tee uut
        for (int i = 0; i < raamatud.size(); i++) {
            if (raamatud.get(i).charAt(0) == esimeneTaht) {
                String tahegaSone = raamatud.get(i);
                sobivaAlgusega.add(tahegaSone);
            }
        }
        String [] sobivaAlgusegaString = new String[sobivaAlgusega.size()];
        for (int i = 0; i < sobivaAlgusega.size(); i++) {
            sobivaAlgusegaString[i] = sobivaAlgusega.get(i);
        }
        return sobivaAlgusegaString;

    }

    public void eemaldaSona(String s){
        raamatud.remove(s);

    }

    public void misKeelesRaamatOn(){
        System.out.println(keel);
    }



}
