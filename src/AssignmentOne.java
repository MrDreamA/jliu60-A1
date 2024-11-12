import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Using classes and objects

        // Create instances of the classes
        HealthProfessional generalPractitioner1 = new GeneralPractitioner(1, "Kunye", "Male", "General Practitioner", "MBBS");
        HealthProfessional generalPractitioner2 = new GeneralPractitioner(2, "YunlinLi", "Female", "General Practitioner", "MBBS");
        HealthProfessional generalPractitioner3 = new GeneralPractitioner(3, "YunhengTan", "Male", "General Practitioner", "MBBS");
        HealthProfessional nursePractitioner1 = new NursePractitioner(4, "Yeyan", "Female", "Nurse Practitioner", "RN");
        HealthProfessional nursePractitioner2 = new NursePractitioner(5, "ZihanWei", "Male", "Nurse Practitioner", "RN");
        // Print the details of the health professionals
        generalPractitioner1.printAllVariables();
        generalPractitioner2.printAllVariables();
        generalPractitioner3.printAllVariables();
        nursePractitioner1.printAllVariables();
        nursePractitioner2.printAllVariables();
        System.out.println("------------------------------");
        // Part 5 - Collection of appointments

        // Appoint two times of general practitioners
        AssignmentOne assignmentOne = new AssignmentOne();
        assignmentOne.createAppointment(generalPractitioner1, "ShuailunMa", "1234567890", "10:30");
        assignmentOne.createAppointment(generalPractitioner2, "WenguangZhang", "9876543210", "11:30");
        // Appoint two times of nurse practitioners
        assignmentOne.createAppointment(nursePractitioner1, "ZeshengSu", "5555555555", "12:30");
        assignmentOne.createAppointment(nursePractitioner2, "ZhiboLiu", "9999999999", "13:30");
        // Print the existing appointments
        assignmentOne.printExistingAppointments();
        // Cancel one of the appointments
        assignmentOne.cancelAppointment(assignmentOne.appointments.get(0));
        // Print the updated list of appointments
        assignmentOne.printExistingAppointments();
        System.out.println("------------------------------");

    }
    // Create an arraylist to store a list of appointments
    ArrayList<Appointment> appointments = new ArrayList<Appointment>();
    // Method to create an appointment
    public void createAppointment(HealthProfessional healthProfessional, String patientName, String patientPhone, String preferredTime){
        // Create an instance of the Appointment class
        Appointment appointment = new Appointment(healthProfessional,patientName, patientPhone, preferredTime);
        // Add the appointment to the arraylist
        appointments.add(appointment);
    }
    // Method to printExistingAppointments
    public void printExistingAppointments(){
        // Loop through the arraylist and print the details of each appointment
        for (Appointment appointment : appointments) {
            appointment.printAllVariables();
        }
    }
    public void cancelAppointment(Appointment appointment){
        // Remove the appointment from the arraylist
        appointments.remove(appointment);
    }
}