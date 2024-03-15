package Day6;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInJava {
    public static void main(String[] args) {
        //
//        Function<Integer , Integer> a = (b)->b*b;
//        System.out.println(a.apply(4));

        Function<Integer , String> a = (b)-> String.valueOf(b*b);
        System.out.println(a.apply(4));

        UnaryOperator<Integer> x = (f)->f*f;
        System.out.println(x.apply(4));

        BiFunction<String , String , String> biFunction = (str1,str2)->str1+str2;
        System.out.println(biFunction.apply("Hi","Hello"));

        BinaryOperator<String> binaryOperator = (str3,str4)->str3+str4;
        System.out.println(binaryOperator.apply("Hello","Mujeeb"));
    }
}
