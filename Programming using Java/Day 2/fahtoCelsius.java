import java.util.Scanner;

public class fahtoCelsius {
    public static void main(String[] args) {
        double fah, celsius;
        Scanner sc = new Scanner(System.in);
        fah = sc.nextDouble();
        celsius = (fah - 32) * (0.5556);
        System.out.println(celsius);
        sc.close();

    }
}
