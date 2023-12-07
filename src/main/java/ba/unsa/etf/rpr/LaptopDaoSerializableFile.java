package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LaptopDaoSerializableFile implements LaptopDao {

    private File file;
    private final LaptopLista laptopi;

    public LaptopDaoSerializableFile() {

        laptopi = new LaptopLista();

        try {

            file = new File("resursi/laptopi.dat");

            ObjectOutputStream izlaz = new ObjectOutputStream(new FileOutputStream(file));
            izlaz.writeObject(laptopi);

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.dat`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }



    public void dodajLaptopUListu(Laptop laptop) {

        laptopi.dodaj(laptop);
    }

    public void dodajLaptopUFile(Laptop laptop) {

        try {

            LaptopLista pohranjeniLaptopi = vratiPodatkeIzDatoteke();

            pohranjeniLaptopi.dodaj(laptop);

            ObjectOutputStream izlaz = new ObjectOutputStream(new FileOutputStream(file));
            izlaz.writeObject(pohranjeniLaptopi);

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.dat`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {

        Laptop l = laptopi.pretrazi(procesor);

        if (l != null)
            return l;

        throw new NeodgovarajuciProcesorException("");
    }

    public void napuniListu(ArrayList<Laptop> laptopi) {

        this.laptopi.setLaptopi(laptopi);
    }

    public LaptopLista vratiPodatkeIzDatoteke() {

        LaptopLista obj = null;

        try {

            ObjectInputStream ulaz = new ObjectInputStream(new FileInputStream(file));
            obj = (LaptopLista)ulaz.readObject();

            if (obj != null)
                return obj;

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.dat`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }

        return null;
    }
}
