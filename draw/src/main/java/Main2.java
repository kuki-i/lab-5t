public class Main2 {
    public static void main(String[] args) {
        Person person1 = new Person("Du Bois", "Harrier", 44);
        Student student1 = new Student("Steel", "Juno", 38, "Y2256", 3472);
        Lecturer lecturer1 = new Lecturer("Sims", "Jonathan", 33, "Beholding", 40000);

        Person[] people = {person1, student1, lecturer1};
        for (Person person : people) {
            System.out.println(person);
        }
    }
  }
