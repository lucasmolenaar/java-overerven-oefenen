package nl.novi.basicprogramming;

public class Main {

    public static void main(String[] args) {
        Doctor hans = new Doctor("Hans", "Grunten", "Staatsstraat", 1300, "New Amsterdam");
        System.out.println(hans.getFirstName() + " " + hans.getLastName() + " werkt in het " + hans.getHospitalName() + " ziekenhuis.");
        hans.work();
        hans.eat("Grass", false);

        System.out.println("\n\n");

        Person piet = new Person("Piet", "Jansen", "Krottewijkje", 1000);
        System.out.println(piet.getFirstName() + " " + piet.getLastName());
        piet.work();

        System.out.println("\n");

//        Handyman sjaak = new Handyman("Sjaak", "Winkelhaak", "Krottewijkje", 400, "92-KRH-4");
//        System.out.println("Het kenteken van de werkbus van " + sjaak.getFirstName() + " is: " + sjaak.getLicensePlateNumber() + ".");
//        sjaak.eat("Chips", true);
    }
}
