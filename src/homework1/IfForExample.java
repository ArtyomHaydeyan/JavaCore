package homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 38;
        int b = 45;
        if (a > b) {
            System.out.println("max: " + a);
        }
        if (a <= b) {
            System.out.println("max " + b);
        }
        for (int i = b; i <= a; i++) {
            System.out.print(i + " ");
        }
       for (int i = a; i <= b ; i++) {
        System.out.print(i + " ");
        }
        System.out.println();
        char c;
        c = (char) a;
        System.out.println(c);
        c = (char) b;
        System.out.println(c);
        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");
        } else {
            System.out.println("a-ն հավասար չէ b-ին");
        }
    }


}
