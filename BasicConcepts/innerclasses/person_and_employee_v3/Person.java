public class Person {

    private String name;
    private Employee employee;

    public Person(String name) {
        this.name = name;
    }

    public void enlist(int salary) {
        this.employee = new Employee(salary);
    }

    @Override
    public String toString() {

        if (employee != null)            // Caution!
            return "Person{" +
                    "name='" + name + '\'' +
                    ", salary=" + employee.getSalary() +
                    '}';
        else
            return "Person{" +
                    "name='" + name + '\'' +
                    ", salary=" + 0 +
                    '}';

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
    }

}

