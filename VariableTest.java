import java.util.Scanner;

public class VariableTest {
    public static void main(String[] args) {

        int x;

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            x = input.nextInt();
            System.out.println("You enter the number " + x); // You need to bring this up inside the 'try'
        } catch (Exception e) {
            System.out.println("Exception has occured");
        }
        // System.out.println("You enter the number " + x);
        // This will give an error due to variable inside the 'try'
    }
}