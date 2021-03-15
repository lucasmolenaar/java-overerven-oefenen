package nl.novi.basicprogramming;

public class MainBank {
    public static void main(String[] args) {
        // Instantiating new Doctor Person and Handyman Person (Polymorphism)
        Person richDoctor = new Doctor("Piet", "Arts", "Rijkestraat", 5000, "NWZ");
        Person poorHandyman = new Handyman("Hans", "Timmerman", "Sloeberlaan", 600);

        // Instantiating new Bank object
        Bank bank = new Bank();

        System.out.println("Dokter zijn bedrag is: " + richDoctor.getBalance());
        System.out.println("Timmerman zijn bedrag is: " + poorHandyman.getBalance());

        System.out.println("------------");

        //(1)sender Person, (2)receiver Person, (3)amount to be transferred
        bank.transferMoney(richDoctor, poorHandyman, 3000);

        System.out.println("------------");

        // Amounts of money after transfer method from Bank Object
        System.out.println("Dokter zijn bedrag is nu: " + richDoctor.getBalance());
        System.out.println("Dokter zijn bedrag is nu: " + poorHandyman.getBalance());
    }
}
