package ba.unsa.etf.rpr.tutorial;

public class Osoba implements Introducable { // osoba je zapravo klasa LicneInformacije

    private String ime;
    private String prezime;



    public Osoba(String ime, String prezime) {

        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String predstavi() {

        return "Osoba " + this.getIme() + " " + this.getPrezime();
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
