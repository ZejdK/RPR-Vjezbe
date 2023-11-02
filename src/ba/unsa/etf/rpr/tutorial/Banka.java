package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Banka {

    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    private Long brojRacuna;

    public Banka() {

        korisnici = new ArrayList<Korisnik>();
        uposlenici = new ArrayList<Uposlenik>();
        brojRacuna = (long)0;
    }

    public void kreirajNovogKorisnika(String ime, String prezime) {

        korisnici.add(new Korisnik(ime, prezime));
    }

    public void kreirajNovogUposlenika(String ime, String prezime) {

        uposlenici.add(new Uposlenik(ime, prezime));
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k) {

        Racun racun = new Racun(brojRacuna, k);
        k.dodajRacun(racun);
        // ima li ovo smisla uopste posto je cirkularno? nez

        brojRacuna++;
        return racun;
    }
}
