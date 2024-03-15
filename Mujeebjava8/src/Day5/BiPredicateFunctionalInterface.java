package Day5;

import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterface {
    public static void main(String[] args) {
        BiPredicate<Integer , Integer> a = (z,b)->z%2==0 || b%2==0;
        System.out.println(a.test(3,5));
    }
}
