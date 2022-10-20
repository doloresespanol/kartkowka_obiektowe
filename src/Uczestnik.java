public class Uczestnik extends Osoba {
    private int fundusz;

    public Uczestnik(String imie, String nazwisko, int fundusz) {
        super(imie, nazwisko);
        this.fundusz = fundusz;
    }

    public int getFundusz() {
        return fundusz;
    }

    public void setFundusz(int fundusz) {
        this.fundusz = fundusz;
    }

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko() + "Fundusz: " + getFundusz();
    }

    public void funduszera(int cena){
        this.fundusz = this.fundusz-cena;
    }
}
