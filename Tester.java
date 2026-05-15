public class Tester extends Pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika,
                  String imie,
                  String nazwisko,
                  double stawkaBazowa,
                  boolean czyAutomatyzujacy,
                  int liczbaScenariuszy) {

        super(idPracownika, imie, nazwisko, stawkaBazowa);

        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {

        if (czyAutomatyzujacy) {
            return getStawkaBazowa() + 1500;
        }

        return getStawkaBazowa();
    }

    @Override
    public String przedstawSie() {
        return "Tester " + getImie() +
                ", scenariusze testowe: " + liczbaScenariuszy;
    }

    public void uruchomRaportTestow() {
        System.out.println("Uruchamianie raportu testów...");
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    @Override
    public String toString() {

        String typTestera;

        if (czyAutomatyzujacy) {
            typTestera = "Automatyzujący";
        } else {
            typTestera = "Manualny";
        }

    return super.toString() +
            " | Tester: " + typTestera +
            " | Scenariusze: " + liczbaScenariuszy;
    }
}