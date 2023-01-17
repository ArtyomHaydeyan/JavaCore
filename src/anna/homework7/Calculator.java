package anna.homework7;

public class Calculator {
    double minus(double a, double b) {
        return (a - b);
    }

    double plyus(double a, double b) {
        return (a + b);

    }

    double multiply(double a, double b) {
        return (a * b);

    }
    double divide (double a, double b) {
        if (b == 0) {
            System.out.println("Error");
            return -1;
        } else {
            return (a /b );

        }
    }
}
