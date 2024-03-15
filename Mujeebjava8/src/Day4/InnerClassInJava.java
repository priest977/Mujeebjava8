package Day4;
interface Employee{
    String id();
    String designation();
}
public class InnerClassInJava  {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String id() {
                return "1000";
            }

            @Override
            public String designation() {
                return "Software Engineer";
            }
        };
        System.out.println(employee.id());
        System.out.println(employee.designation());
    }


}
