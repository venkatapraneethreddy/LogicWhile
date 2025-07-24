package oopsProject1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital("City Hospital");
        int patientIdCounter = 1;
        int doctorIdCounter = 101;
        int appointmentIdCounter = 1001;

        while (true) {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. Remove Patient");
            System.out.println("5. Remove Doctor");
            System.out.println("6. Cancel Appointment");
            System.out.println("7. Display Patients");
            System.out.println("8. Display Doctors");
            System.out.println("9. Display Appointments");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Add Patient
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int patientAge;
                    try {
                        patientAge = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age. Please enter a number.");
                        continue;
                    }
                    System.out.print("Enter patient ailment: ");
                    String ailment = scanner.nextLine();
                    Patient patient = new Patient(patientIdCounter++, patientName, patientAge, ailment);
                    hospital.addPatient(patient);
                    break;

                case 2:
                    // Add Doctor
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter doctor specialization: ");
                    String specialization = scanner.nextLine();
                    Doctor doctor = new Doctor(doctorIdCounter++, doctorName, specialization);
                    hospital.addDoctor(doctor);
                    break;

                case 3:
                    // Schedule Appointment
                    hospital.displayPatients();
                    System.out.print("Enter patient ID: ");
                    int patientId;
                    try {
                        patientId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a number.");
                        continue;
                    }
                    Patient selectedPatient = hospital.findPatientById(patientId);
                    if (selectedPatient == null) {
                        System.out.println("Patient not found.");
                        continue;
                    }

                    hospital.displayDoctors();
                    System.out.print("Enter doctor ID: ");
                    int doctorId;
                    try {
                        doctorId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a number.");
                        continue;
                    }
                    Doctor selectedDoctor = hospital.findDoctorById(doctorId);
                    if (selectedDoctor == null) {
                        System.out.println("Doctor not found.");
                        continue;
                    }

                    System.out.print("Enter appointment date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter appointment time (e.g., 10:00 AM): ");
                    String time = scanner.nextLine();
                    Appointment appointment = new Appointment(appointmentIdCounter++, selectedPatient, selectedDoctor, date, time);
                    hospital.scheduleAppointment(appointment);
                    break;

                case 4:
                    // Remove Patient
                    hospital.displayPatients();
                    System.out.print("Enter patient ID to remove: ");
                    try {
                        patientId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a number.");
                        continue;
                    }
                    hospital.removePatient(patientId);
                    break;

                case 5:
                    // Remove Doctor
                    hospital.displayDoctors();
                    System.out.print("Enter doctor ID to remove: ");
                    try {
                        doctorId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a number.");
                        continue;
                    }
                    hospital.removeDoctor(doctorId);
                    break;

                case 6:
                    // Cancel Appointment
                    hospital.displayAppointments();
                    System.out.print("Enter appointment ID to cancel: ");
                    int appointmentId;
                    try {
                        appointmentId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a number.");
                        continue;
                    }
                    hospital.cancelAppointment(appointmentId);
                    break;

                case 7:
                    // Display Patients
                    hospital.displayPatients();
                    break;

                case 8:
                    // Display Doctors
                    hospital.displayDoctors();
                    break;

                case 9:
                    // Display Appointments
                    hospital.displayAppointments();
                    break;

                case 10:
                    // Exit
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 10.");
            }
        }
    }
}