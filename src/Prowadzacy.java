public final class Prowadzacy extends Osoba {
    private String umiejetnosci;

    public Prowadzacy(String imie, String nazwisko,String umiejetnosci) {
        super(imie, nazwisko);
        this.umiejetnosci=umiejetnosci;
    }

    public String getUmiejetnosci() {
        return umiejetnosci;
    }

    public void setUmiejetnosci(String umiejetnosci) {
        this.umiejetnosci = umiejetnosci;
    }

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko();
    }
}
