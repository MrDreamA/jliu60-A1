public class HealthProfessional {
    /**
     * Declare variables
     */
    private int id;
    private String name;
    private String gender;

    /**
     * Default Constructor
     */
    HealthProfessional() {
        id =0;
        name = null;
        gender = null;
    }

    /**
     * Overloading the constructor to initialize the object with parameters.
     * @param id the id of health professional
     * @param name the name of health professional
     * @param gender the gender of health professional
     */
    HealthProfessional(int id, String name, String gender){
        this.id =id;
        this.name = name;
        this.gender = gender;
    }

    /**
     * Method to print all instance variables
     */
    public void printAllVariables(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
    }
}
