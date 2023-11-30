package ba.unsa.etf.rpr.tutorial;

public class Nastavnik extends Osoba implements Introducable {

    private String titula;



    public Nastavnik(String ime, String prezime, String titula) {

        super(ime, prezime);
        this.titula = titula;
    }

    @Override
    public String predstavi() {

        return this.getTitula() + super.predstavi() + " je nastavnik";
    }



    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }
}
