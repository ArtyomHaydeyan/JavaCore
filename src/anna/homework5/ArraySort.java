package anna.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 16, 4, 3, 19, 154, 45, -6, 12};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < 0; j++) {

            }
            if (numbers[i] < numbers[i - 1]) {
                int temp = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = temp;
                System.out.println(numbers[0]);
            }
        }
    }
}