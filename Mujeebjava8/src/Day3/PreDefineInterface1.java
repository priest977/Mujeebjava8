package Day3;

public class PreDefineInterface1 {
    public static void main(String[] args) {
        Runnable re = ()->{
            for(int i = 1;i<=10;i++){
                System.out.println(i);
            }
        };
        re.run();
    }
}
