import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of a " + number + " is " + fact);
        sc.close();
    }
}
