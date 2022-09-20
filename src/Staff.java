 public class Staff extends Personnel {
    private int id;
    public Staff (String firstName, String lastName, String email, int age, int contact, String gender, int id){
        super(firstName, lastName, email, age, contact, gender);
        this.id = id;
    }
    public void resign(){
        System.out.println("Staff " +  this.getLastName() + "with id:" + id + "will resign in 60 days");
    }

    public void applyleave(){
        System.out.println("Staff " +  this.getLastName() + "with id:" + id + " will apply for annual leave");
    }

    public void applyleave(String reason){
        System.out.println("Staff " +  this.getLastName() + "with id:" + id + " Will apply for " + reason +" leave");
    }
}
