import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your roll no : ");
        int rollno = input.nextInt();
        System.out.println("Roll No is " + rollno);

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.print("marks : " + marks);
    }
}
