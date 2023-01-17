package artyom.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 100;
        int b = 95;
        // 1
        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }
        //2
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(" " + i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        //3
        char c = (char) a;
        char c1 = (char) b;
        System.out.println(c);
        System.out.println(c1);
        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");
        } else {
            System.out.println("a-ն հավասար չէ b-ին");
        }
    }
}