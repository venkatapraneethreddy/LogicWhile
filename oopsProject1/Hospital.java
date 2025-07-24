package oopsProject1;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    // Methods to manage patients
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient);
    }

    public void removePatient(int patientId) {
        patients.removeIf(p -> p.getPatientId() == patientId);
        System.out.println("Patient with ID " + patientId + " removed.");
    }

    public void displayPatients() {
        System.out.println("\nPatients in " + hospitalName + ":");
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    // Methods to manage doctors
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor);
    }

    public void removeDoctor(int doctorId) {
        doctors.removeIf(d -> d.getDoctorId() == doctorId);
        System.out.println("Doctor with ID " + doctorId + " removed.");
    }

    public void displayDoctors() {
        System.out.println("\nDoctors in " + hospitalName + ":");
        if (doctors.isEmpty()) {
            System.out.println("No doctors registered.");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

    // Methods to manage appointments
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }

    public void cancelAppointment(int appointmentId) {
        appointments.removeIf(a -> a.getAppointmentId() == appointmentId);
        System.out.println("Appointment with ID " + appointmentId + " cancelled.");
    }

    public void displayAppointments() {
        System.out.println("\nAppointments in " + hospitalName + ":");
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    // Helper methods to find patient and doctor by ID
    public Patient findPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null;
    }

    public Doctor findDoctorById(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }
}