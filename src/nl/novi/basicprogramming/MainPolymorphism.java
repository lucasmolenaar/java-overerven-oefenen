package nl.novi.basicprogramming;

import java.util.ArrayList;
import java.util.List;

public class MainPolymorphism {
    public static void main(String[] args) {
        // Onderstaande is Polymorphism (polymorfisme)
        Person someDoctor = new Doctor("Dokter", "Ans", "Dokterstraat", 6004, "New Amsterdam");
//        Person someHandyman = new Handyman("Sjaak", "Trekhaak", "Bouwvakkersstraat", 300, "93-KFR-1");

        List<Person> people = new ArrayList<>();
        people.add(someDoctor);
//        people.add(someHandyman);

        for (Person person : people) {
            System.out.println("De naam is " + person.getFirstName() + " " + person.getLastName());
        }
    }
}
