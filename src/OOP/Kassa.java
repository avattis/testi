package OOP;

import java.util.ArrayList;

/**
 * Created by annelyvattis on 1/19/17.
 */
public class Kassa {
    String kassatadi;
    ArrayList<String> tooted = new ArrayList<>();

    public Kassa (String kassapidaja){
        kassatadi = kassapidaja;
       // System.out.println(kassatadi);
    }

    public void lisaToode (String toode){
        tooted.add(toode);
        //System.out.println(tooted);
    }

    public void eemaldaToode (String toode){
        tooted.remove(toode);
        //System.out.println("eemaldatud " + tooted);
    }

    public void prindiOstutsekk(){
        System.out.println("Tooted: " + tooted);

    }
    public void prindiKassapidajaNimi(){
        System.out.println( "Kassapidaja: " + kassatadi);

    }



}
