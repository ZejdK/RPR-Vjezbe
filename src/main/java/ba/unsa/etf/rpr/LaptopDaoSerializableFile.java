package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LaptopDaoSerializableFile implements LaptopDao {

    private File file;
    private ArrayList<Laptop> laptopi;



    public LaptopDaoSerializableFile() {

        laptopi = new ArrayList<>();

        try {

            file = new File("laptopi.dat");

            ObjectOutputStream izlaz = new ObjectOutputStream(new FileOutputStream(file));
            izlaz.writeObject(laptopi);

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.dat`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }



    public void dodajLaptopUListu(Laptop laptop) {

        laptopi.add(laptop);
    }

    public void dodajLaptopUFile(Laptop laptop) {

        // konfuzna postavka, pretpostavljam da treba biti da su svi do sada laptopi prisutni u fajlu, a ne da se dopisuju jedan po jedan

        try {

            ArrayList<Laptop> pohranjeniLaptopi = vratiPodatkeIzDatoteke();

            pohranjeniLaptopi.add(laptop);

            ObjectOutputStream izlaz = new ObjectOutputStream(new FileOutputStream(file));
            izlaz.writeObject(pohranjeniLaptopi);

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.dat`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {

        for (Laptop l : laptopi)
            if (procesor.equals(l.getProcesor()))
                return l;

        throw new NeodgovarajuciProcesorException("");
    }

    public void napuniListu(ArrayList<Laptop> laptopi) {

        this.laptopi = laptopi; // postavka kaze 'dodjeljuje'
    }

    public ArrayList<Laptop> vratiPodatkeIzDatoteke() {

        Object obj = null;

        try {

            ObjectInputStream ulaz = new ObjectInputStream(new FileInputStream(file));
            obj = ulaz.readObject();

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.dat`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }

        if (obj instanceof ArrayList<?>)
            return (ArrayList<Laptop>) obj;

        return null;
    }
}
