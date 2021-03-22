import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principle = sc.nextFloat();
        float roi = sc.nextFloat();
        float time = sc.nextFloat();
        float si = (principle * roi * time) / 100;
        System.out.println(si);
        sc.close();
    }
}
