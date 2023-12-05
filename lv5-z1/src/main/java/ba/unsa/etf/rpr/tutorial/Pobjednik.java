package ba.unsa.etf.rpr.tutorial;

public class Pobjednik {

    private final String ime;
    private final String prezime;
    private final int brojZnakova;

    // private KolekcijaImena imena; // zasto Pobjednik treba da zna kolekciju?

    Pobjednik(KolekcijaImena imena) throws Exception {

        String pobjednik = imena.getNajduzeIme();

        String[] dijelovi = pobjednik.split(" ", 2);

        ime = dijelovi[0];
        prezime = dijelovi[1];
        brojZnakova = ime.length();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojZnakova() {
        return brojZnakova;
    }
}
