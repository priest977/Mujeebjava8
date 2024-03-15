package Day1;

@FunctionalInterface
interface FunctionalInteface{
    void sayHello(); // abstract method
    default void SayBye(){
        System.out.println("Hello say Bye ");
    }
   static void SayNothing(){
        System.out.println("say Hello Nothing");
    }
//    void SayBye();
}
public class Basic  {
//    @Override
//    public void sayHello() {
//        System.out.println("Say Hello");
//    }

//    @Override
//    public void SayBye() {
//        System.out.println("Say Bye");
//    }
    public static void main(String[] args) {
//        FunctionalInteface functionalInteface = new Basic();
//        functionalInteface.sayHello();
//        functionalInteface.SayBye();
        FunctionalInteface.SayNothing();
//        functionalInteface.SayBye();
        // Sum of all the integer
//        int [] arr = {1,2,3,4,5};
//        // 15
//        // for loop
//        int sum = 0;
//        for(int i = 0;i<arr.length;i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//        int a = 5;
//        int b = 5;
//        Runnable runnable = () -> System.out.println(a + b);
//        System.out.println(runnable);


        // How to Write lambda Expression

//        normalFunction();
    }



    }
//      ()->System.out.println("Hello Normal Function");


    // lambda Expression


