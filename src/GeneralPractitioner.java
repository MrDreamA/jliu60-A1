import java.util.Objects;

public class GeneralPractitioner extends HealthProfessional{
    /**
     * declare variables
     */
    private String specializationType;
    private String degree;

    /**
     * Default Constructor
     */
    GeneralPractitioner(){
        this.specializationType = "General Practitioner";
        this.degree = null;
    }

    /**
     * Overloading Constructor with parameters
     * @param id the id of the health professional
     * @param name the name of the health professional
     * @param gender the gender of the health professional
     * @param specializationType the specialization of the health professional
     */
    GeneralPractitioner(int id, String name, String gender, String specializationType, String title){
        super(id, name, gender);
        this.specializationType = specializationType;
        this.degree = title;
    }

    /**
     * Method to print all instance variables
     */
    @Override
    public void printAllVariables(){
        System.out.println("The health professional details are:");
        super.printAllVariables();
        System.out.println("Specialization Type: "+specializationType);
        System.out.println("Degree: "+degree);
        System.out.println();
    }
}
