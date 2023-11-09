package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

public interface LaptopDao {

    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop);
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    Laptop vratiPodatkeIzDatoteke();
}
