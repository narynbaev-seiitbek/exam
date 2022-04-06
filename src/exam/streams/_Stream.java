package exam.streams;

import java.util.List;

import static exam.streams.Gender.FEMALE;
import static exam.streams.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {


        List<Person> person = List.of(
                new Person("Azat",17, MALE),
                new Person("Seiitbek",27,MALE),
                new Person("Nargiza",33,FEMALE),
                new Person("Nurjan",45,FEMALE),
                new Person("Zahid",45,MALE),
                new Person("Kunzaada",78,FEMALE)
        );


    }
}
