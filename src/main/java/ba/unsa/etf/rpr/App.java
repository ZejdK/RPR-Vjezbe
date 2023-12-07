package ba.unsa.etf.rpr;

public class App
{
    public static int DajRand(int m, int o) {

        return (int)(Math.random() * m + o);
    }

    public static Laptop IzmisliLaptop() {

        String[] brendovi = { "ASUS", "Lenovo", "Dell", "HP", "Apple" };
        String[] modeli = { "U1123I", "HU4344DI", "UUE24", "234I", "E43U", "UE44OA", "XJ432QK", "E134I", "AO3UE", "HDI4U", "G44P", "IU2E" };

        Laptop mojLapi = new Laptop();

        mojLapi.setBrend(brendovi[DajRand(brendovi.length, 0)]);
        mojLapi.setCijena(DajRand(30, 1) * 100);
        mojLapi.setModel(modeli[DajRand(modeli.length, 0)]);
        mojLapi.setHdd(DajRand(3, 1) * 1000);
        mojLapi.setSsd(DajRand(20, 1) * 100);
        mojLapi.setRam(DajRand(4, 1) * 4);
        mojLapi.setGrafickaKartica("Nvidia " + modeli[DajRand(modeli.length, 0)]);
        mojLapi.setProcesor("Intel i5 " + modeli[DajRand(modeli.length, 0)]);
        mojLapi.setVelicinaEkrana(13 + DajRand(5, 0));

        return mojLapi;
    }

    public static void IstestirajSerializable() {

        LaptopDaoSerializableFile l = new LaptopDaoSerializableFile();

        System.out.println("A");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("B");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("C");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("D");
    }

    public static void IstestirajXML() {

        LaptopDaoXMLFile l = new LaptopDaoXMLFile();

        System.out.println("A");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("B");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("C");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("D");
    }

    public static void IstestirajJSON() {

        LaptopDaoJSONFile l = new LaptopDaoJSONFile();

        System.out.println("A");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("B");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("C");

        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.dodajLaptopUFile(IzmisliLaptop());
        l.vratiPodatkeIzDatoteke().ispisi();

        System.out.println("D");
    }

    public static void main( String[] args ) {

        IstestirajSerializable();
        IstestirajXML();
        IstestirajJSON();
    }
}
