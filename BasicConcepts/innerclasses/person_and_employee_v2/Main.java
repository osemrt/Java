public class Main {

    public static void main(String[] args) {

        Person.Employee[] staff = new Person.Employee[3];
        Person person;

        person = new Person("Osman Pamukoglu");
        staff[0] = person.new Employee(1000);

        person = new Person("Nihat Genc");
        staff[1] = person.new Employee(7500);

        person = new Person("Baris Mustecaplioglu");
        staff[2] = person.new Employee(6000);

        for(Person.Employee employee : staff)
            System.out.println(employee);

    }

}

