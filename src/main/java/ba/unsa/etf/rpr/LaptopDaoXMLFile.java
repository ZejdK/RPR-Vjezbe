package ba.unsa.etf.rpr;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LaptopDaoXMLFile {

    private File file;
    private ArrayList<Laptop> laptopi;



    public LaptopDaoXMLFile() {

        laptopi = new ArrayList<>();

        try {

            file = new File("laptopi.xml");

            XmlMapper mapper = new XmlMapper();
            mapper.writeValue(file, laptopi);

            FileOutputStream fo = new FileOutputStream(file);
            fo.write(xml.getBytes());
            fo.close();

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.xml`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }



    public void dodajLaptopUListu(Laptop laptop) {

        laptopi.add(laptop);
    }

    public void dodajLaptopUFile(Laptop laptop) {

        try {

            ArrayList<Laptop> pohranjeniLaptopi = vratiPodatkeIzDatoteke();

            pohranjeniLaptopi.add(laptop);

            XmlMapper mapper = new XmlMapper();
            mapper.writeValue(file, laptopi);

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.xml`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {

        for (Laptop l : laptopi)
            if (procesor.equals(l.getProcesor()))
                return l;

        throw new NeodgovarajuciProcesorException("");
    }

    public void napuniListu(ArrayList<Laptop> laptopi) {

        this.laptopi = laptopi;
    }

    public ArrayList<Laptop> vratiPodatkeIzDatoteke() {

        Object obj = null;

        try {

            XmlMapper mapper = new XmlMapper();
            laptopi = mapper.readValue(file, ArrayList.class);

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.xml`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }

        if (obj instanceof ArrayList<?>)
            return (ArrayList<Laptop>) obj;

        return null;
    }
}
