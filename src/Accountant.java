public class Accountant extends Staff {
    public Accountant(String firstName, String lastName, String email, int age, int contact, String gender, int id) {
        super(firstName, lastName, email, age, contact, gender, id);
    }

    @Override
    public void resign() {
        System.out.println("Accountant " + this.getLastName() + "will resign in 30 days");
    }

    @Override
    public void applyleave() {
        System.out.println("Accountant " + this.getLastName() + " will apply for annual leave");
    }

    @Override
    public void applyleave(String reason) {
        System.out.println("Accountant " + this.getLastName() + " Will apply for " + reason + " leave");
    }

    public void paySalary() {
        System.out.println("Accountant  pays salary");

    }
}
