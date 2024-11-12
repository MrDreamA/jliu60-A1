public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Using classes and objects

        // Create instances of the classes
        HealthProfessional generalPractitioner1 = new GeneralPractitioner(1, "Kate", "Male", "General Practitioner", "MBBS");
        HealthProfessional generalPractitioner2 = new GeneralPractitioner(2, "Lily", "Female", "General Practitioner", "MBBS");
        HealthProfessional generalPractitioner3 = new GeneralPractitioner(3, "John", "Male", "General Practitioner", "MBBS");
        HealthProfessional nursePractitioner1 = new NursePractitioner(4, "Jane", "Female", "Nurse Practitioner", "RN");
        HealthProfessional nursePractitioner2 = new NursePractitioner(5, "Adam", "Male", "Nurse Practitioner", "RN");
        // Print the details of the health professionals
        generalPractitioner1.printAllVariables();
        generalPractitioner2.printAllVariables();
        generalPractitioner3.printAllVariables();
        nursePractitioner1.printAllVariables();
        nursePractitioner2.printAllVariables();
        System.out.println("------------------------------");
    }
}