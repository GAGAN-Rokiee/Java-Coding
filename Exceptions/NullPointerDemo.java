package Exceptions;

public class NullPointerDemo {
    public static void main(String[] args) {
        String s= "Gagan";
        String str = "abc";

        try {
            int length = s.length(); // This line will throw a NullPointerException
            int num = Integer.parseInt(str);
            int b= 8/0;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred!");
           // e.printStackTrace();
        } catch ( ArithmeticException ex)
        {
            System.out.println("Arithmatic Exception");
        }
        catch (Exception e)
        {
            System.out.println("Any other Exception");
        }
        finally {
            System.out.println("No Excption occured");
        }
    }
}
