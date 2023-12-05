package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

public class KolekcijaImena {

    private final ArrayList<String> imena;

    KolekcijaImena() {

        imena = new ArrayList<>();
    }

    String getNajduzeIme() throws Exception {

        if (imena.size() == 0)
            throw new Exception("Lista imena je prazna");

        String najduzeIme = imena.get(0);

        for (String s : imena)
            if (s.length() > najduzeIme.length())
                najduzeIme = s;

        return najduzeIme;
    }

    void dodajIme(String ime) {

        imena.add(ime);
    }
}
