package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    private static void IstestirajLicneInfo() {

        Osoba spisak[] = new Osoba[6];
        spisak[0] = new Student("Studirac", "Studirovski", "3", "28658");
        spisak[1] = new Nastavnik("Imenko", "Imenkovic", "klaun");
        spisak[2] = new Nastavnik("Mujesira", "Mujic", "Doktor");
        spisak[3] = new Student("Mujo", "Hasic", "2", "28994");
        spisak[4] = new Student("Suljo", "Suljic", "1", "29384");
        spisak[5] = new Student("Haso", "Hasovski", "2", "28934");

        for (Osoba l : spisak) {

            if (l instanceof Student) {

                Student s = (Student) l;
                System.out.println("Osoba je student " + s.getIme() + " " + s.getPrezime() + " na "
                                    + s.getGodinaStudija() + ". godini studija sa indeksom " + s.getBrojIndexa());
            } else if (l instanceof Nastavnik) {

                Nastavnik n = (Nastavnik) l;
                System.out.println("Osoba je nastavnik " + n.getTitula() + " " + n.getIme() + " " + n.getPrezime());
            }
        }
    }

    private static void IstestirajKolekcijuPoruka() {

        ArrayList<Introducable> spisak = new ArrayList<Introducable>();

        spisak.add(new Osoba("Mujo", "Mujovski"));
        spisak.add(new Osoba("Haso", "Hasetic"));
        spisak.add(new Nastavnik("Fata", "Fatimic", "Dr"));
        spisak.add(new Nastavnik("Hljeb", "Kruhovic", "Vanr Dr"));
        spisak.add(new Student("Huse", "Husini", "1", "27940"));
        spisak.add(new Student("Suljo", "Suljagic", "1", "27999"));
        spisak.add(new Student("Suljo", "Sinonimic", "1", "28034"));
        spisak.add(new Student("Hasan", "Hasanic", "2", "27744"));
        spisak.add(new Student("Husein", "Huseinovic Husovski III", "3", "25755"));
        spisak.add(new Predmet("Matematika I", "kompleksni brojeve i trigonometrija"));
        spisak.add(new Predmet("Matematika II", "nizovi i redovi"));
        spisak.add(new Predmet("Bosanski VII", "padezi i promjena kroz glagolska vremena"));
        spisak.add(new Predmet("Likovno", "crtanje i bojenje"));

        KolekcijaPoruka p = new KolekcijaPoruka(spisak);

        for (String predstavljanje : p.getPoruke()) {

            System.out.println(predstavljanje);
        }
    }

    public static void main( String[] args )
    {

        IstestirajLicneInfo();
        System.out.println("-------");
        IstestirajKolekcijuPoruka();
    }
}
