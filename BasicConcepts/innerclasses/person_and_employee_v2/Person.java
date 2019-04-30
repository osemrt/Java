public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public class Employee{

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

