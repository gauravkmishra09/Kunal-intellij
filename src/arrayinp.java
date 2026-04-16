import java.util.Arrays;
import java.util.Scanner;

public class arrayinp {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int [] arr= new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
////            System.out.print(arr[i]+" ");
//
//        }
////        for(int num:arr){
////            System.out.print(num+" ");
////        }
//
//        System.out.println(Arrays.toString(arr));
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    change(arr);
    System.out.println(Arrays.toString(arr));
}
    static void change(int[] arr){
        arr[0]= 99;


}













}
