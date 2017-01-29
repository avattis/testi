package OOP;

import java.util.ArrayList;

/**
 * Created by annelyvattis on 1/19/17.
 */
public class Chat {
    String tuba;
    ArrayList<String> chat = new ArrayList<>();
    
    public Chat(String toaNimi){
        tuba = toaNimi;
        System.out.println("toanimi" + toaNimi);
    }
    
    public void sisestaSonum(String kasutaja, String jutt){
        chat.add(kasutaja);
        chat.add(jutt+"\n");
        
    }
    
    public void prindiKoikSonumidKoosKasutajanimega(){
        System.out.print(chat);
        
    }
    
    public void adminKustutabSonumi(String delete){
        chat.remove(delete);
        chat.remove(delete+"\n");

        
    }

    public void prindiToaNimi() {
        System.out.println(tuba);
    }
}
