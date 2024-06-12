package OOPs;

public class MethodOverloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static Double plusMethodInt(double x, double y) {
        return  (x + y);
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        Double myNum2 = plusMethodInt(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        {
            int x=6;
            System.out.println("Value of x is:"+ x);
        }

    }
}
