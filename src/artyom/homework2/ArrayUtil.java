package artyom.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {0, 135, -7444, 0, 57, -7444, 78, -11, 135, -18};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }
}

