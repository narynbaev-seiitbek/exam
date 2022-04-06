package exam.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        //Without Predicate
        System.out.println(isPhoneNumberValid("07345678911"));
        System.out.println(isPhoneNumberValid("0734567891"));
        System.out.println(isPhoneNumberValid("08345678910"));

        //With Predicate
        System.out.println(isPhoneNumberValidPredicate.test("07345678911"));
        System.out.println(isPhoneNumberValidPredicate.test("0734567891"));
        System.out.println(isPhoneNumberValidPredicate.test("07345678911"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }
}
