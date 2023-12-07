package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class LaptopLista {

    private ArrayList<Laptop> laptopi;

    public LaptopLista() {

        laptopi = new ArrayList<>();
    }

    public ArrayList<Laptop> getLaptopi() {
        return laptopi;
    }

    public void setLaptopi(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    public void dodaj(Laptop l) {

        if (laptopi == null)
            laptopi = new ArrayList<>();

        laptopi.add(l);
    }

    public void ispisi() {

        for (Laptop l : laptopi)
            System.out.println(l);
    }

    public Laptop pretrazi(String procesor) {

        for (Laptop l : laptopi)
            if (procesor.equals(l.getProcesor()))
                return l;

        return null;
    }
}
