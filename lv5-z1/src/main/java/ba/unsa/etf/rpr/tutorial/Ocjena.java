package ba.unsa.etf.rpr.tutorial;

public class Ocjena {

    private Osoba osoba;
    private int ocjena;

    public Ocjena(Osoba osoba, int ocjena) {

        this.osoba = osoba; 
        setOcjena(ocjena); // sta ako proslijedjena ocjena ne valja?
    }

    public void setOcjena(int ocjena) {
        if (ocjena > 0 && ocjena <= 10)
            this.ocjena = ocjena;
    }
}
