package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

public class KolekcijaPoruka {

    private ArrayList<String> poruke;



    KolekcijaPoruka(ArrayList<Introducable> predstavljanti) {

        poruke = new ArrayList<String>();

        for (Introducable i : predstavljanti)
            poruke.add(i.predstavi());
    }



    public ArrayList<String> getPoruke() {
        return poruke;
    }
}
