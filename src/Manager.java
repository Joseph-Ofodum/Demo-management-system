public class Manager extends Staff {
    public Manager(String firstName, String lastName, String email, int age, int contact, String gender, int id) {
        super(firstName, lastName, email, age, contact, gender, id);
    }


    @Override
    public void resign() {
        System.out.println("Manager " + this.getLastName() + "will resign in 30 days");
    }


    @Override
    public void applyleave() {
        System.out.println("Manager " + this.getLastName() + " will apply for annual leave");
    }

    @Override
    public void applyleave(String reason) {
        System.out.println("Manager " + this.getLastName() + " Will apply for " + reason + " leave");
    }

    public void attendance() {
        System.out.println("Manager  has taken attendance for the day");

    }
}

