package ba.unsa.etf.rpr.tutorial;

import java.util.ArrayList;

public class App 
{
    private static void IstestirajLicneInfo() {

        Osoba[] spisak = new Osoba[6];
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

        ArrayList<Introducable> spisak = new ArrayList<>();

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

    private static void IstestirajOcijenjivanjeNastavnika() {

        Nastavnik nastavnik = new Nastavnik("Mujo", "Mujic", "prof");

        Student s1 = new Student("Suljo", "Suljic", "1", "222222");
        Student s2 = new Student("Suljo2", "Suljic3", "1", "222223");
        Student s3 = new Student("Suljo3", "Suljic3", "1", "222224");

        nastavnik.ocijeni(s1, 6);
        nastavnik.ocijeni(s2, 8);
        nastavnik.ocijeni(s3, 9);

        nastavnik.predstavi();

        // mozda jos implementirati neke info o tome da se vidi koja je ocjena nastavnika?
    }

    private static void IstestirajOcijenjivanjePredmeta() {

        Predmet likovno = new Predmet("Likovno", "saranje");

        Student s1 = new Student("Suljo", "Suljic", "1", "222222");
        Student s2 = new Student("Suljo2", "Suljic3", "1", "222223");
        Student s3 = new Student("Suljo3", "Suljic3", "1", "222224");

        likovno.ocijeni(s1, 6);
        likovno.ocijeni(s2, 8);
        likovno.ocijeni(s3, 9);

        likovno.predstavi();

        // mozda jos implementirati neke info o tome da se vidi koja je ocjena predmeta
    }

    private static void IstestirajKolekcijuImena() {

        KolekcijaImena imena = new KolekcijaImena();

        Student[] studenti = {

                new Student("Suljo", "Suljic", "1", "222222"),
                new Student("Suljo2", "Suljic3", "1", "222223"),
                new Student("Suljo223", "Suljic223", "1", "222224"),
                new Student("Suljo14", "Suljic14", "1", "222225")
        };

        for (Student s : studenti)
            imena.dodajIme(s.getIme() + " " + s.getPrezime());

        try {

            Pobjednik pobjednik = new Pobjednik(imena);
            System.out.println("Pobjednik je " + pobjednik.getIme() + " " +  pobjednik.getPrezime() + " sa " + pobjednik.getBrojZnakova() + " znakova");

        } catch (Exception e) {

            System.out.println("Uhvacen izuzetak: " + e.getMessage());
        }
    }

    public static void main( String[] args )
    {
        IstestirajLicneInfo();
        System.out.println("-------");
        IstestirajKolekcijuPoruka();
        IstestirajOcijenjivanjePredmeta();
        IstestirajOcijenjivanjeNastavnika();
        IstestirajKolekcijuImena();
    }
}
