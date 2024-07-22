package Phase2_Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Person1 implements Comparable<Person1> {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person1 other) {

        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + ":" +age;
    }
}

public class SortingWComparable {
    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1("Joe", 30));
        people.add(new Person1("Alf", 25));
        people.add(new Person1("Kip", 35));


        System.out.println("Before sorting");
        for (Person1 person : people) {
            System.out.println(person);
        }

        Collections.sort(people);

        System.out.println("After sorting by age");
        for (Person1 person : people) {
            System.out.println(person);
        }
    }
}

