public class Main {


    public static void main(String[] args) {
        Staff staff1 = new Staff(
                "Ekene",
                "Ofodum",
                "josephofodum@gmail.com",
                31,
                98878,
                "Male",
                6
        );

        System.out.println(staff1.getAge());
        System.out.println(staff1.getGender());
        System.out.println(staff1.getLastName());
        staff1.resign();
        staff1.applyleave();

        Applicant applicant = new Applicant(
                "Peace",
                "Bella",
                "bellapeace@yahoo.com",
                25,
                88888,
                "female");
        applicant.application("Manager");
        System.out.println(applicant.getposition());

        CEO ceo = new CEO(
                "Godstime",
                "Azeke",
                "Az@gmail.com",
                50,
                9099,
                "male",
                5);
        ceo.paySalary();
        ceo.fire(staff1);
        ceo.hire(applicant);

        Manager manager = new Manager(
                "Meggie",
                "MArtins",
                "ntiike@gmail.com",
                28,
                111,
                "female",
                20);
            manager.attendance();


        Accountant accountant = new Accountant(
                " Yome",
                "okporka",
                "hhgg@yahoo.com",
                27,
                9487,
                "female",
                23

                );
        accountant.paySalary();

    }



}