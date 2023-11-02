package ba.unsa.etf.rpr.tutorial;

public class Racun {

    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;

    public Racun(Long brojRacuna, Osoba osoba) {

        this.brojRacuna = brojRacuna;
        korisnikRacuna = osoba;
        this.odobrenjePrekoracenja = false;
        stanjeRacuna = 0.0;
    }

    public boolean provjeriOdobrenjePrekoracenja(Double prekoracenje) {

        return odobrenjePrekoracenja || stanjeRacuna < prekoracenje;
    }

    public boolean izvrsiUplatu(Double vrijednost) {

        stanjeRacuna += vrijednost;
        return true;
    }

    public boolean izvrsiIsplatu(Double vrijednost) {

        if (stanjeRacuna < vrijednost)
            return false;

        stanjeRacuna -= vrijednost;
        return true;
    }

    public void odobriPrekoracenje(Double vrijednost) {

        odobrenjePrekoracenja = true;
    }
}
