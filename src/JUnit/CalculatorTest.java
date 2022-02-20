package JUnit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c=new Calculator();

        int result1= c.add(1,3);
        System.out.println(result1);

        int result2=c.sub(1,3);
        System.out.println(result2);
    }
}
