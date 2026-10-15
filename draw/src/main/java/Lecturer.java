public class Lecturer extends Person{
        private String cathedra;
        private int salary;

        public String getCathedra() {
            return cathedra;
        }
        public int getSalary() {
            return salary;
        }

        public Lecturer(String surname, String name, int age, String cathedra, int salary) {
            super(surname, name, age);
            this.cathedra = cathedra;
            this.salary = salary;
        }

    @Override
    public String toString() {
        return "Викладач кафедри " + cathedra + ", " + getSurname() + " " + getName() + ", вік: " + getAge() + ". Зарплата: " + salary;
    }
    }
