import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z;
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if (x > y && x > z) {
            System.out.println("Largest Number is " + x);
        } else if (y > z) {
            System.out.println("Largest Number is " + y);
        } else {
            System.out.println("Largest Number is " + z);
        }
        s.close();
    }
}
