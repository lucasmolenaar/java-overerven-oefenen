package nl.novi.basicprogramming;

public class Handyman extends Person {
    private String licensePlateNumber;

    public Handyman(String firstName, String lastName, String streetName, double balance) {
        super(firstName, lastName, streetName, balance);
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public void eat(String food, boolean like) {
        super.eat(food);
        if (like) {
            System.out.print(". And I like it.");
        } else {
            System.out.print(". And I don't like it.");
        }
    }
}
