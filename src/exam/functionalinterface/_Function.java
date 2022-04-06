package exam.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result
        int res = incrementToNumber(1);
        System.out.println(res);

        Integer resFunc = incrementToNumberFunction.apply(1);
        System.out.println(resFunc);

        Integer multiply = multiplyBy10Function.apply(resFunc);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementToNumberFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(5));

        // BiFunction takes 2 argument and produces 1 result

        System.out.println(incrementByOneAndMultiply(4,100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
        System.out.println("percent");

        System.out.println(findPercentOfNumbers(300,18));

        System.out.println(findPercentBiFunction.apply(300,18));

        System.out.println(findToSquare(9));

        System.out.println(findToSquareFunction.apply(9));


        //20-100//35
        //x - 35
        //20*35/100
        //18% -300
        //300/100=3
        //3*18=54

    }

    static BiFunction<Integer, Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne+1)*numberToMultiplyBy;


    static Function<Integer,Integer> multiplyBy10Function = number -> number*10;

    static Function<Integer,Integer> incrementToNumberFunction = number2 -> number2 +1;

    //Percent BiFunction

    static BiFunction<Integer,Integer,Integer> findPercentBiFunction =
            (number, percent)-> (number/100)*percent;

    static Function<Integer, Integer> findToSquareFunction = number-> number*number;



    public static int incrementToNumber(int number) {
        return number+1;
    }

    public static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number+1)*numToMultiplyBy;
    }

    public static int findPercentOfNumbers(int number, int percent ) {
        return (number/100)*percent;
    }

    public static int findToSquare(int number) {
        return number*number;

    }
}
