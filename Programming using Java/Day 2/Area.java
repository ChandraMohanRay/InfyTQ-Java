import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        float Area = (float) (pi * rad * rad);
        System.out.println(Area);
        sc.close();
    }
}