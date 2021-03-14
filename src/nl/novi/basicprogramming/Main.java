package nl.novi.basicprogramming;

public class Main {

    public static void main(String[] args) {
        Doctor hans = new Doctor("Hans", "Grunten", "Staatsstraat", "223114786", "New Amsterdam");
        System.out.println(hans.getFirstName() + " " + hans.getLastName() + " werkt in het " + hans.getHospitalName() + " ziekenhuis.");
        hans.work();
        hans.eat("Grass", false);

        System.out.println("\n\n");

        Person piet = new Person("Piet", "Jansen", "Krottewijkje", "493350984");
        System.out.println(piet.getFirstName() + " " + piet.getLastName() + " zijn BSN-nummer is: " + hans.getBsnNumber());
        piet.work();

        System.out.println("\n");

        Handyman sjaak = new Handyman("Sjaak", "Winkelhaak", "Krottewijkje", "012345678", "92-KRH-4");
        System.out.println("Het kenteken van de werkbus van " + sjaak.getFirstName() + " is: " + sjaak.getLicensePlateNumber() + ".");
        sjaak.eat("Chips", true);
    }
}
