package chapters;

public class Average {
    public static void main(String[] args) {

        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + numbers[i];
        System.out.println("Միջինը = է " + result / 5);

    }

}
