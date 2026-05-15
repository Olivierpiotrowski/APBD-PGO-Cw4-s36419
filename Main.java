public class Main {

    public static void main(String[] args) {

        ZespolProjektowy zespol =
                new ZespolProjektowy("SmartCity App");

        Pracownik p1 =
                new Programista(
                        "DEV-01",
                        "Anna",
                        "Maj",
                        12000,
                        "Java",
                        5
                );

        Pracownik p2 =
                new Tester(
                        "TEST-01",
                        "Piotr",
                        "Lis",
                        9500,
                        true,
                        40
                );

        Pracownik p3 =
                new Programista(
                        "DEV-02",
                        "Karol",
                        "Wójcik",
                        11000,
                        "Kotlin",
                        3
                );

        zespol.dodajPracownika(p1);
        zespol.dodajPracownika(p2);
        zespol.dodajPracownika(p3);

        zespol.wypiszSkladZespolu();

        System.out.println("\nŁączny koszt zespołu: "
                + zespol.policzLacznyKoszt());

        System.out.println("\n=== PRZEDSTAWIENIE ===");

        System.out.println(p1.przedstawSie());
        System.out.println(p2.przedstawSie());

        System.out.println("\n=== INSTANCEOF ===");

        if (p1 instanceof Programista) {

            Programista programista = (Programista) p1;

            programista.wypiszTechnologie();
        }

        System.out.println("\n=== EQUALS ===");

        Tester kopiaTestera =
                new Tester(
                        "TEST-01",
                        "Inne",
                        "Dane",
                        5000,
                        false,
                        1
                );

        System.out.println(p2.equals(kopiaTestera));

        zespol.wypiszProgramistow();
    }
}