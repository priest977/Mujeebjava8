package Day2;

interface A{
    default void sayHello(){
        System.out.println("A say Hello");
    }
    static void sayNothing(){
        System.out.println("A say Nothing");
    }
}
interface B{
    default void sayHello(){
        System.out.println("B say Hello");
    }
    static void sayNothing(){
        System.out.println("A say Nothing");
    }
    static void sayNothing1(){
        System.out.println("A1 say Nothing");
    }
}
interface C {
    default void sayBye(){
        System.out.println("C Say Bye");
    }
}
public class DayTwo implements A,B,C{
    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        dayTwo.sayHello();
        dayTwo.sayBye();
        A.sayNothing();
        B.sayNothing();
        B.sayNothing1();
    }
    @Override
    public void sayHello() {
        B.super.sayHello();
    }
}
