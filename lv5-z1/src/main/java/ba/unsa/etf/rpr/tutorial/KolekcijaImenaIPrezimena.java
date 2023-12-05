package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

public class KolekcijaImenaIPrezimena {

    private final ArrayList<String> imena;
    private final ArrayList<String> prezimena;

    KolekcijaImenaIPrezimena() {

        imena = new ArrayList<>();
        prezimena = new ArrayList<>();
    }

    public int getIndexNajduzegPara() {

        // provjera za prazan string

        int M = 0;

        for (int i = 1; i < imena.size(); ++i)
            if (imena.get(i).length() + prezimena.get(i).length() > imena.get(M).length() + prezimena.get(M).length())
                M = i;

        return M;
    }

    public String getImeIPrezime(int i) {

        return imena.get(i) + " " + prezimena.get(i);
    }

    public void dodajImeIPrezime(String ime, String prezime) {

        imena.add(ime);
        prezimena.add(prezime);
    }
}
