public class Student extends Person{
        private String group;
        private int student_id;

        public String getGroup() {
            return group;
        }
        public int getStudent_id() {
            return student_id;
        }

        public Student(String surname, String name, int age, String group,int student_id) {
            super(surname, name, age);
            this.group = group;
            this.student_id = student_id;
        }

    @Override
    public String toString() {
        return "Студент групи " + group + ", " + getSurname() + " " + getName() + ", вік: " + getAge() + ". Номер студентського квитка: " + student_id;
    }
    }
