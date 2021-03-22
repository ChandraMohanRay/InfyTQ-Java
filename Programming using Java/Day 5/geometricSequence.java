import java.util.Scanner;

public class geometricSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int r = 2;
        int n = sc.nextInt();
        int curr_term;
        for (int i = 0; i < n; i++) {
            curr_term = a * (int) Math.pow(r, i);
            System.out.println(curr_term);
        }
        sc.close();
    }
}
