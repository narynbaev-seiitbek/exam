package exam.optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {


        Optional<String> op = Optional.of("John");
        System.out.println(op.orElse("Bey"));

        Optional<String> op2 = Optional.empty();
        System.out.println(op2.orElse("sdsd"));
    }
}
