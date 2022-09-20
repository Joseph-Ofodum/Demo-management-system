abstract class Personnel {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int contact;
    private String gender;

    public Personnel(String firstName, String lastName, String email, int age, int contact, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.contact = contact;
        this.gender = gender;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}




