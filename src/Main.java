public class Main {
    public static void main(String[] args) {
        //utworz klase Kurs extends Osoba wartosci prywatne - nazwa, prowadzacy, opis_kursu, uczestnicy(max 12), cena
        //utworz klase Uczestnik - fundusz
        //utworz klase Prowadzacy - umiejetnosci
        //utworz klase Osoba - imie, nazwisko
        //metody : dodajUczestnikaDoKursu

        //tworzenie prowadzacych
        Prowadzacy prowadzacy1 = new Prowadzacy("Adam","Buksa","C++, HTML");
        Prowadzacy prowadzacy2 = new Prowadzacy("Cezary","Buksa","Java, HTML");

        //tworzenie uczestnikow
        Uczestnik uczestnik1 = new Uczestnik("Aleksy","Tromba",300);
        Uczestnik uczestnik2 = new Uczestnik("Pol","Tromba",90);
        Uczestnik uczestnik3 = new Uczestnik("Mano","Tromba",240);

        //tworzenie kursow
        Kurs kurs1 = new Kurs("Kurs HTML i C++","Nauka języka",100);
        Kurs kurs2 = new Kurs("Kurs HTML i Java","Nauka języka",250);

        //dodawanie prowadzacych
        kurs1.dodajProwadzacego(prowadzacy1);
        kurs2.dodajProwadzacego(prowadzacy2);

        //dodawanie uczestnikow
        kurs1.dodajUczestnika(uczestnik3);
        kurs1.dodajUczestnika(uczestnik3);
        kurs2.dodajUczestnika(uczestnik1);
        kurs2.dodajUczestnika(uczestnik3);

        System.out.println(kurs1);
        System.out.println(kurs2);
    }
}