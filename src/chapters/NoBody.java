package chapters;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 150;
        j = 400;
        while (++i < --j);
        System.out.println("միջին թվբ․ հավասար է " + j);
    }
}
