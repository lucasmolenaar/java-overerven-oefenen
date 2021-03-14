package nl.novi.basicprogramming;

public class Main {

    public static void main(String[] args) {
        Doctor hans = new Doctor("Hans", "Grunten", "Staatsstraat", "223114786", "New Amsterdam");
        System.out.println(hans.getFirstName() + " " + hans.getLastName() + " werkt in het " + hans.getHospitalName() + " ziekenhuis.");
        hans.work();

        Person piet = new Person("Piet", "Jansen", "Krottewijkje", "493350984");
        System.out.println(piet.getFirstName() + " " + piet.getLastName() + " zijn BSN-nummer is: " + hans.getBsnNumber());
        piet.work();
    }
}
