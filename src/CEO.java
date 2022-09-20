public class CEO extends Staff {
    public CEO(String firstName, String lastName, String email, int age, int contact, String gender, int id) {
        super(firstName, lastName, email, age, contact, gender, id);
    }

    @Override
    public void resign() {
        System.out.println("CEO " + this.getLastName() + "will resign in 60 days");
    }


    @Override
    public void applyleave() {
        System.out.println("CEO " + this.getLastName() + " will apply for annual leave");


    }

    @Override
    public void applyleave(String reason) {
        System.out.println("CEO " + this.getLastName() + " Will apply for " + reason + " leave");
    }

    public void paySalary() {
        System.out.println("the Ceo directs the accountant to pay salary");
    }

    public void hire(Applicant applicant) {
        System.out.println("the ceo hires " + applicant.getFirstName());
    }

    public void fire(Staff staff) {
        System.out.println("the ceo fires " + staff.getFirstName());
    }
}



