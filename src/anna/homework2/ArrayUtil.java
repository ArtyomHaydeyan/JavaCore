package anna.homework2;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {7, -14, 87, 16259, -74, 0, 1987, 31, -40, 99};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                evenCount++;
            }
        }
        System.out.println();
        System.out.println(evenCount);
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
                oddCount++;
            }

        }
        System.out.println();
        System.out.println(oddCount);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sum / 10);
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
        System.out.println(array[array.length/2 ]);
    }
}