import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
   int [] ab = new int[5];
       for(int i=0;i<ab.length;i++){
           ab[i]=sc.nextInt();
           System.out.print(ab[i]+" ");
       }
//        System.out.println(Arrays.toString(ab));
    }
}
