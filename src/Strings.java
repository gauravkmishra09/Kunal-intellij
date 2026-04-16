public class Strings {
    public static void main(String[] args){
//        String name = "Gaurav Mishra";
//        System.out.print(name);
        String a= "kunal";
        String b= "kunal";
        System.out.println(a==b);



        String x = new String("yash");
        String y = new String("yash");
        System.out.println(x==y);//method that caaare if new is used or not



        String ab = new String("new");
        String cd = new String("new");
        System.out.println(ab.equals(cd)); //function in java which dont care if new used or not


        System.out.println(a.charAt(0));
    }
}
