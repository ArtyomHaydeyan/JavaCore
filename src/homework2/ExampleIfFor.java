package homework2;

public class ExampleIfFor {
    public static void main(String[] args) {
//1
        int a = 39;
        int b = 36;
        if (a > b) {
            System.out.println("max:" + a);
        }
//2
        for (int i = a; i <=b ; i++) {
            System.out.print(i + " ");

        }
        for (int i = b; i <=a ; i++) {
            System.out.print(i+" ");

        }
//3
        System.out.println();
        char c;
        c = (char) a;
        System.out.println(c);
        c = (char) b;
        System.out.println(c);
//4
        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");
        } else{
            System.out.println("a-ն հավասար չէ b-ին");
        }


    }

}
