package LogicWhile.OopsProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;

    public Appointment(Doctor doctor, Patient patient, LocalDate date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void displayAppointment() {
        System.out.println("Appointment:");
        doctor.displayInfo();
        patient.displayInfo();
        System.out.println("Date: " + date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
