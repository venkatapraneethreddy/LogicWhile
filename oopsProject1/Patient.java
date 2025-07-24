package oopsProject1;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(int patientId, String name, int age, String ailment) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    // Getters and Setters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + name + ", Age=" + age + ", Ailment=" + ailment + "]";
    }
}