import java.util.*;
public class test{

static class SchoolTransport {
    List<SchoolBus> buses = new ArrayList<>();

    void addBus(SchoolBus bus) {
        buses.add(bus);
    }

    boolean enroll(Student student) {
        for (SchoolBus bus : buses) {
            if (bus.add(student)) {
                return true;
            }
        }
        return false;
    }
}

static class SchoolBus {
    int capacity;
    List<Student> students = new ArrayList<>();

    SchoolBus(int capacity) {
        this.capacity = capacity;
    }

    boolean add(Student student) {
        if (students.size() < capacity) {
            students.add(student);
            return true;
        }
        return false;
    }

    public String toString() {
        return "SchoolBus{" +
                "capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}

static class Student {
    String name;
    int id;
    String address;

    Student(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}

public static void main(String[] args)
{
  SchoolBus bus1 = new SchoolBus(20);
  bus1.add(new Student("Alex", 1, "Elm St"));
  bus1.add(new Student("Bella", 10, "Oak St"));
  bus1.add(new Student("Bob", 25, "Oak St"));
  bus1.add(new Student("Candy", 100, "Chestnut St"));

  SchoolBus bus2 = new SchoolBus(4);
  bus2.add(new Student("Debbie", 16, "Oak St"));
  bus2.add(new Student("Erin", 6, "Elm St"));
  bus2.add(new Student("Frank", 106, "Chestnut St"));
  bus2.add(new Student("Gaby", 1, "Beech St"));

  SchoolBus bus3 = new SchoolBus(20);
  bus3.add(new Student("Holly", 17, "Oak St"));
  bus3.add(new Student("Irene", 7, "Elm St"));

  SchoolTransport school = new SchoolTransport();
  school.addBus(bus1);
  school.addBus(bus2);
  school.addBus(bus3);

  for (SchoolBus bus : school.buses)
    System.out.println(bus);
  System.out.println();

  System.out.println(school.enroll(new Student("*John*", 5, "Elm St")));
  for (SchoolBus bus : school.buses)
    System.out.println(bus);
  System.out.println();

  System.out.println(school.enroll(new Student("*Kathy*", 2, "Beech St")));
  for (SchoolBus bus : school.buses)
    System.out.println(bus);
  System.out.println();

  System.out.println(school.enroll(new Student("*Lee*", 12, "Oak St")));
  for (SchoolBus bus : school.buses)
    System.out.println(bus);
  System.out.println();
}
}



