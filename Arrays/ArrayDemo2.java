package Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] arr = {"Lalit", "Kumar" , "Rajawat"};
        char[] Home = {'a','b'};

        for(String a : arr){
           // System.out.println(a);
            //a="Lalit"
            for(int i=0; i<a.length();i++)
            {
                //a="Lalit"
                System.out.print(a.charAt(i) + "\t");
            }
            System.out.println("\n");
           // String b=a.replace("a","");
             //  System.out.println("lenth of string is ");
            //System.out.println(b);
        }
    }
}
