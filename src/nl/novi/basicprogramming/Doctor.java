package nl.novi.basicprogramming;

public class Doctor extends Person {
    private String hospitalName;

    public Doctor(String firstName, String lastName, String streetName, String bsnNumber, String hospitalName) {
        super(firstName, lastName, streetName, bsnNumber);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + " is a doctor");
    }
}