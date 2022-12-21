package homework2;

public class FigurePainter {

    public static void main(String[] args) {
//1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//2
        int k = 4;
        for (int i = 0; i < 5; i++) {
            for (int j = k; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//3
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

}


