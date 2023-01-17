package artyom.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.plus(-28.5, -6));
        System.out.println(calc.minus(35.8,46.8));
        System.out.println(calc.divide(45.4,0));
        System.out.println(calc.multiply(5,0));
    }
}
