package Day3;

import java.util.*;

// Older Way Car making Company ka properties
interface CarMakingCompany{
    void engine();
    void break1();
    void wheel();
}
class Alto implements CarMakingCompany {

    @Override
    public void engine() {
        System.out.println("Making 100CC Engine");
    }

    @Override
    public void break1() {
        System.out.println("Not Strong");
    }

    @Override
    public void wheel() {
        System.out.println("Alto Have 4 Wheels");
    }
}
public class UseOflambdaExpression {
    public static void main(String[] args) {
//        Alto alto = new Alto(); // Making Object
        CarMakingCompany carMakingCompany = new Alto(); // Yeh Bhi tarika object create krne ka
        carMakingCompany.engine();
        carMakingCompany.break1();
        carMakingCompany.wheel();

//        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
    }
}
