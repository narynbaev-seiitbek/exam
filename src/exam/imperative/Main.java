package exam.imperative;

import java.util.*;

import static exam.imperative.Gender.FEMALE;
import static exam.imperative.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Azat",17,MALE),
                new Person("Seiitbek",27,MALE),
                new Person("Nargiza",33,FEMALE),
                new Person("Nurjan",45,FEMALE),
                new Person("Zahid",45,MALE),
                new Person("Kunzaada",78,FEMALE)
        );

        System.out.println("Imperative approach");

        List<Person> female = new ArrayList<>();

        for (Person person : personList) {
            if (person.getGender().equals(FEMALE)) {
               female.add(person);
            }
        }
        for (Person person : female) {
            System.out.println(person);

        }

        System.out.println("Declarative approach ");

        personList.stream().filter(person -> person.getGender().equals(FEMALE))
                .forEach(System.out::println);

    }

}
