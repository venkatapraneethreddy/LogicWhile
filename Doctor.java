package LogicWhile;

public class Doctor extends Person {
    private String specialization;
    private int doctorId;

    public Doctor(int doctorId, String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor ID: " + doctorId + " | Name: " + name + " | Specialization: " + specialization);
    }
}
