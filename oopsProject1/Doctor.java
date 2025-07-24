package oopsProject1;

public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;

    // Constructor
    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor [ID=" + doctorId + ", Name=" + name + ", Specialization=" + specialization + "]";
    }
}