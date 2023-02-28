import java.util.*;

public class Fibonacci {
    static int fibNo(int n) {
        int dp[] = new int[n + 2];

        dp[0] = 0;
        dp[1] = 1;
        int i;
        for (i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int res = fibNo(n);
        System.out.println(res);
        sc.close();
    }
}
