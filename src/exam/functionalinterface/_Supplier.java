package exam.functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrl.get());

    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5232/users";
    }

    static Supplier<String> getDBConnectionUrl = () ->
            "jdbc://localhost:5232/users";

}
