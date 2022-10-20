import java.util.ArrayList;

public class Kurs {
    private String nazwa;
    private Prowadzacy prowadzacy;
    private String opis_kursu;
    private ArrayList<Uczestnik> uczestnicy = new ArrayList<>();
    private int cena;

    public Kurs(String nazwa, String opis_kursu, int cena) {
        this.nazwa = nazwa;
        this.opis_kursu = opis_kursu;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Prowadzacy getProwadzacy() {
        return prowadzacy;
    }

    public void setProwadzacy(Prowadzacy prowadzacy) {
        this.prowadzacy = prowadzacy;
    }

    public String getOpis_kursu() {
        return opis_kursu;
    }

    public void setOpis_kursu(String opis_kursu) {
        this.opis_kursu = opis_kursu;
    }

    public ArrayList<Uczestnik> getUczestnicy() {
        return uczestnicy;
    }

    public void setUczestnicy(ArrayList<Uczestnik> uczestnicy) {
        this.uczestnicy = uczestnicy;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Kurs: " + nazwa + "\n" + "Prowadzacy to " + prowadzacy + "\n" + "Opis kursu: " + opis_kursu + "\n" + "Uczestnicy: " + uczestnicy + "\n" + "Cena wynosi " + cena + "zł \n";
    }

    public void dodajProwadzacego(Prowadzacy prowadzacy1){
        this.prowadzacy=prowadzacy1;
    }

    public void dodajUczestnika(Uczestnik uczestnik1){
        if(uczestnicy.size()>=12){
            System.out.println("Nie ma miejsca");
        }else{
            if(uczestnicy.contains(uczestnik1)){
                System.out.println("Uczestnik dołączył już do kursie");
            }else{
                if(uczestnik1.getFundusz()<this.cena){
                    System.out.println("Za mało funduszy");
                }else{
                    uczestnik1.funduszera(this.cena);
                    uczestnicy.add(uczestnik1);
                    System.out.println("Uczestnik dodany do kursu");
                }
            }
        }
    }
}
