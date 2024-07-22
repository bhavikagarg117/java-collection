package Phase2_Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
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
    public String toString() {
        return name + ":" +age;
    }
}


class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

public class SortingWComparator {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("A", 30));
        people.add(new Person("B", 25));
        people.add(new Person("C", 35));


        System.out.println("Before sorting");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, new AgeComparator());

        System.out.println("After sorting");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
