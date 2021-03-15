package nl.novi.basicprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private String streetName;
    private double balance;

    public Person(String firstName, String lastName, String streetName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public double getBalance() { return balance;}
    public void setBalance(double balance) { this.balance = balance;}

    public void eat(String food) {
        System.out.print("I eat " + food);
    }

    public void work() {
        System.out.println(firstName + " works");
    }
}
