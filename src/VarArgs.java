import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 4, 4, 5, 5, 56, 6};
//        String result = fn(a);
        System.out.println(fn(a));
    }

    static String fn(int... v) {
        return Arrays.toString(v);
    }
}
