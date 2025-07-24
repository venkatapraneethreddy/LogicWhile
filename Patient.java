package LogicWhile;

public class Patient extends Person {
    private int patientId;

    public Patient(int patientId, String name, int age) {
        super(name, age);
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + patientId + " | Name: " + name + " | Age: " + age);
    }
}
