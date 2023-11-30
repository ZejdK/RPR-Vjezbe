package ba.unsa.etf.rpr.tutorial;

public class Predmet implements Introducable {

    private String naziv;
    private String opis;



    Predmet(String naziv, String opis) {

        this.naziv = naziv;
        this.opis = opis;
    }

    @Override
    public String predstavi() {
        return "Predmet " + this.getNaziv() + ": " + this.getOpis();
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
}
