public class StrOperator {
 public static void main(String[] args) {
//     System.out.println('a'+'b'); // char+ char
//     System.out.println("a"+"b"); // string+string
//     System.out.println((char)('a'+3)); // char+num
//     System.out.println("a"+1); // integer will be converted to integer that will call toString()
//       String series ="";
//     for(int i=0;i<26;i++){
//    char ch = (char)('a'+i);
//    series = series+ch;
//}
//
//     StringBuilder builder = new StringBuilder();
//     for(int i=0;i<26;i++){
//         char ch =(char) ('a'+i);
//         builder.append(ch);
//     }
//     System.out.println(builder);
//     System.out.println(builder.toString());
     String str = "abccba";

     System.out.print(checkpall(str));
     }
     static boolean checkpall( String str) {
         for (int i = 0; i < str.length()/2;i++){
             char start = str.charAt(i);
                     char end =str.charAt(str.length()-1-i);

         if(start!= end) {
             return false;
         }
         }
         return true;
     }
 }


