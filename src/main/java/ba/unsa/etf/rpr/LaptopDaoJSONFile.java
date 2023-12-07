package ba.unsa.etf.rpr;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class LaptopDaoJSONFile implements LaptopDao {

    private File file;
    private final LaptopLista lista;

    public LaptopDaoJSONFile() {

        lista = new LaptopLista();

        try {

            file = new File("resursi/laptopi.json");

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, lista);

        } catch (Exception e) {

            System.out.println(" 1 Greska pri citanju datoteke `laptopi.json`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    public void dodajLaptopUListu(Laptop laptop) {

        lista.dodaj(laptop);
    }

    public void dodajLaptopUFile(Laptop laptop) {

        try {

            LaptopLista pohranjeniLaptopi = vratiPodatkeIzDatoteke();

            pohranjeniLaptopi.dodaj(laptop);

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, pohranjeniLaptopi);

        } catch (Exception e) {

            System.out.println(" 2 Greska pri citanju datoteke `laptopi.json`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {

        Laptop l = lista.pretrazi(procesor);

        if (l != null)
            return l;

        throw new NeodgovarajuciProcesorException("");
    }

    public void napuniListu(ArrayList<Laptop> laptopi) {

        this.lista.setLaptopi(laptopi);
    }

    public LaptopLista vratiPodatkeIzDatoteke() {

        LaptopLista obj = null;

        try {

            ObjectMapper mapper = new ObjectMapper();
            obj = mapper.readValue(file, LaptopLista.class);

            if (obj != null)
                return obj;

        } catch (Exception e) {

            System.out.println("Greska pri citanju datoteke `laptopi.json`: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }

        return null;
    }
}
