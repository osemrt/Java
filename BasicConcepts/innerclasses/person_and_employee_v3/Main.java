public class Main {

    public static void main(String[] args) {

        Person[] staff = new Person[3];

        staff[0] = new Person("Osman Pamukoglu");
        staff[0].enlist(10000);

        staff[1] = new Person("Nihat Genc");
        staff[1].enlist(7000);

        staff[2] = new Person("Baris Mustecaplioglu");
        staff[2].enlist(5000);

        for (Person person : staff)
            System.out.println(person);
    }

}

