package Day4;

import java.util.function.Predicate;

public class FunctionalPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x ->x > 1000;
        System.out.println(predicate.test(20));


        // and --> default method
        Predicate<String> compareFirstLetter = str -> str.charAt(0) == 'n';
        Predicate<String> compareLastletter = str1 ->str1.length()-1 == 'h';
        Predicate<String> result = compareFirstLetter.and(compareLastletter);
        System.out.println(result.test("Nafish"));
    }
    public static void sayhello(){
        System.out.println("Hello Bhai");
    }
}
