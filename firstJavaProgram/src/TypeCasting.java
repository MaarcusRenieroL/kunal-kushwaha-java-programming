import java.util.Scanner;


public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println("num = " + num);

        // converting integer to float or type casting

        int a = (int) (67.45f);
        System.out.println(a);

        // automatic type promotions in expressions

        int number = 257;
        byte rem = (byte) (a); // adding 275 % 256 = 1
        System.out.println(rem);

        byte a1 = 40;
        byte b = 50;
        byte c = 100;
        int d = (a1 * b) / c;

        // expressions are performed automatically using integers

        System.out.println(d);

        int character = 'a';

        // automatic type conversion
        // this will print the ASCII value of the character

        System.out.println(character);

        // byte, short, char - int
        // if any one of the operands is long, float or double, the whole operation will be promoted to long, double or float

        byte by = 42; // promoted to float
        char ch = 'a'; // promoted to int
        short s = 1024; // promoted to double
        int i = 50000;
        float fl = 5.67f;
        double dl = 0.1234;
        double result = (fl * by) + (i / ch) - (dl - s);

        // f * b = float value
        // i * c = int value
        // d - s = double
        // float + int - double = double (because double is max)

        System.out.println((fl * by) + " " + (i / ch) + " " + (dl - s));
        System.out.println(result);

    }
}
