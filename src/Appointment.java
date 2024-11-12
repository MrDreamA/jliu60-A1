public class Appointment {
    /**
     * declare variables
     */
    private HealthProfessional healthProfessional;
    private String patientName;
    private String patientPhone;
    private String preferredTime;

    /**
     * default constructor
     */
    Appointment(){
        this.healthProfessional = null;
        this.patientName = null;
        this.patientPhone = null;
        this.preferredTime = null;
    }

    /**
     * parameterized constructor
     * @param healthProfessional the selected health professional
     * @param patientName name of the patient
     * @param patientPhone phone number of the patient
     * @param preferredTime preferred time of the patient
     */
    Appointment(HealthProfessional healthProfessional, String patientName, String patientPhone, String preferredTime){
        this.healthProfessional = healthProfessional;
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
    }

    public void printAllVariables(){
        System.out.println("The Appointment Details are:");
        healthProfessional.printAllVariables();
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient Phone: "+patientPhone);
        System.out.println("Preferred Time: "+preferredTime);
        System.out.println();
    }

}
