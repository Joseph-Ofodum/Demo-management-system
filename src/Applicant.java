public class Applicant extends Personnel{
    private String position;

    public Applicant(String firstName, String lastName, String email, int age, int contact, String gender) {
        super(firstName, lastName, email, age, contact, gender);
    }

    public void application(String position){
        System.out.println("Applicant " + getLastName() + " is applying for the " + position + " position");
    }

    public String getposition(){
        return position;
    }
}
