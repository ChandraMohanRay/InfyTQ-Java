import java.util.Scanner;

public class oddnEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            // This block will get executed if the if-condition is true
            System.out.println(number + " is an even number");
        } else {
            // This block will get executed if the if-condition is false
            System.out.println(number + " is an odd number");
        }
        sc.close();
    }
}
