package Day5;

import java.util.function.Function;

public class FunctionalInterfaceJavaPredefined {
    public static void main(String[] args) {
        Function<String , Integer> a = (str)->str.length();
        System.out.println(a.apply("Nafish"));
    }
}
