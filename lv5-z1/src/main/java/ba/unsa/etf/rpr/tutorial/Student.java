package ba.unsa.etf.rpr.tutorial;

public class Student extends Osoba {

    private String godinaStudija;
    private String brojIndexa;



    public Student(String ime, String prezime, String godinaStudija, String brojIndexa) {

        super(ime, prezime);
        this.godinaStudija = godinaStudija;
        this.brojIndexa = brojIndexa;
    }



    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
}
