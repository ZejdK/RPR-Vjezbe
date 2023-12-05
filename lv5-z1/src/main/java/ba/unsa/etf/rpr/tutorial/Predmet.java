package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

public class Predmet implements Introducable, MozeOcijeniti {

    private String naziv;
    private String opis;
    private final ArrayList<Ocjena> ocjene;

    Predmet(String naziv, String opis) {

        this.naziv = naziv;
        this.opis = opis;
        ocjene = new ArrayList<>();
    }

    @Override
    public String predstavi() {
        return "Predmet " + this.getNaziv() + ": " + this.getOpis();
    }

    @Override
    public Ocjena ocijeni(Osoba ko, int ocjena) {

        ocjene.add(new Ocjena(ko, ocjena));
        return ocjene.get(ocjene.size() - 1);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public ArrayList<Ocjena> getOcjene() {
        return ocjene;
    }
}
