package nl.novi.basicprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private String streetName;
    private String bsnNumber;

    public Person(String firstName, String lastName, String streetName, String bsnNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.bsnNumber = bsnNumber;
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

    public String getBsnNumber() {
        return bsnNumber;
    }
    public void setBsnNumber(String bsnNumber) {
        this.bsnNumber = bsnNumber;
    }

    public void eat(String food) {
        System.out.print("I eat " + food);
    }

    public void work() {
        System.out.println(firstName + " works");
    }
}
