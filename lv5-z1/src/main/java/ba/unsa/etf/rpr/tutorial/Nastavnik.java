package ba.unsa.etf.rpr.tutorial;

public class Nastavnik extends LicneInformacije {

    private String titula;



    public Nastavnik(String ime, String prezime, String titula) {

        super(ime, prezime);
        this.titula = titula;
    }



    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }
}
