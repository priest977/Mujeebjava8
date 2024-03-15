package Day3;

@FunctionalInterface
interface CarMakingCompany1{
    void run1();
}
// With The help of lambda Expression
public class WithTheHelpOflambdaExpression {
    public static void main(String[] args) {
        CarMakingCompany1 b = ()->{
            for(int i = 0;i<=10;i++){
                System.out.println(i);
            }
        };
        b.run1();
    }

}
