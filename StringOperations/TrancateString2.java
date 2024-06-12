package StringOperations;

public class TrancateString2 {
    static void truncateSentence(String s, int k) {

       // String s = "Hello how are you Contestant";  //input

        String[] Array_of_S = {"Hello", "how","are", "you"," Contestant"};  // Output
       // int k = 4;
        for(int i=0 ;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+ "\t");
        }
        //System.out.println("Value of S is:" +s);
        //System.out.println("Value of K is :" +k);
    }

}
