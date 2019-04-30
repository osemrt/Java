public class Person {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        Person person;

        person = new Person("Osman Pamukoglu");
        staff[0] = person.new Employee(1000);

        person = new Person("Nihat Genc");
        staff[1] = person.new Employee(7500);

        person = new Person("Baris Mustecaplioglu");
        staff[2] = person.new Employee(6000);

        for(Employee employee : staff)
            System.out.println(employee);

    }


    private String name;

    public Person(String name) {
        this.name = name;
    }

    private class Employee {

        private int salary;

        public Employee(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "salary=" + salary +
                    '}';
        }
    }

}

