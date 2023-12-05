package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

public class Nastavnik extends Osoba implements Introducable { // Nastavnik je klasa InformacijeONastavniku

    private String titula;
    private final ArrayList<Ocjena> ocjene;

    public Nastavnik(String ime, String prezime, String titula) {

        super(ime, prezime);
        this.titula = titula;
        ocjene = new ArrayList<>();
    }

    @Override
    public String predstavi() {

        return this.getTitula() + super.predstavi() + " je nastavnik";
    }

    public Ocjena ocijeni(Osoba ko, int ocjena) {

        ocjene.add(new Ocjena(ko, ocjena));
        return ocjene.get(ocjene.size() - 1);
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }
}
