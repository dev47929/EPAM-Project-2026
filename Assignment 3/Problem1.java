import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long b = sc.nextLong();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        int count = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] <= b) {
                sum += arr[i];
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
