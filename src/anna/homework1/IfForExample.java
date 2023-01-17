package anna.homework1;

public class IfForExample {
    public static void main(String[] args) {
//1
        int a = 41;
        int b = 37;
        if (a < b) {
            System.out.println("max:" +a);
        } else
            System.out.println("max:" + b);
//2
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(" " + i);
            }
        } else
            for (int i = a; i <= b; i++) {
                System.out.print(" " + i);
            }
        System.out.println();
//3
        char c = (char) a;
        char d = (char) b;
        System.out.println(c);
        System.out.println(d);
//4
        if(a==b) {
            System.out.println("a-ն հավասար է b-ին։");
        }else {
            System.out.println("a-ն հավասար չէ b-ին։");
        }
    }
}
