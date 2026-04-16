import java.util.Arrays;

//public class multiDimension {
//    public static void main(String[] args) {
//        int[] [] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(Arrays.deepToString(arr));
//    }
//
//}
import java.util.Arrays;
import java.util.Scanner;
public class multiDimension{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] [] arr= new int[4] [3];
//        for(int row=0;row<arr.length;row++){
//           for(int col=0;col<arr[row].length;col++){
//               arr[row][col]= sc.nextInt();
////               System.out.println(arr[row][col]+" ");
////
//           }
//        }
//////        System.out.println(arr[row][col]);
////       System.out.println(Arrays.deepToString(arr));
//    for(int row=0;row<arr.length;row++){
//        System.out.println(Arrays.toString(arr[row]));

//}//
//
//
//    }//
//
//}//
////if colmn is not fixed
//    1234
//    23
//    2      types

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
           System.out.println();
        }
    }
}

