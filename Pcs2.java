import java.util.Scanner;
public class Pcs2 {
    public static int solve(int p) {
        int ans = 0;
        if (p >= 100) {
            ans += p / 100;
            p = p % 100;
        }

        if (p > 0) {
            ans += p;
        }
        if (ans > 10) {
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int p = scanner.nextInt();
            System.out.println(solve(p));
        }
        scanner.close();
    }
}
