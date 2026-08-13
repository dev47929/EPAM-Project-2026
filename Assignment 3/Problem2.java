import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] pts = new int[n];
        for (int i = 0; i < n; i++) {
            pts[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(pts[0]);
            return;
        }

        int[] dp = new int[n];
        dp[0] = pts[0];
        dp[1] = Math.max(pts[0], pts[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + pts[i]);
        }

        System.out.println(dp[n - 1]);
    }
}
