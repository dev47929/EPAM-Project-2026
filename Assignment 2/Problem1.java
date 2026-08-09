import java.util.*;

public class Problem1 {
    static int res = 0;

    public static void main(String[] args) {
        
        isTreeTrusted();
    }

    public static void isTreeTrusted() {
        res = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] key = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            key[i] = sc.nextInt();
        }

        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ls.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            ls.get(c1).add(c2);
            ls.get(c2).add(c1);
        }

        dfs(ls, key, 1, -1, k, key[1]);   

        System.out.println(res);
    }

    public static void dfs(List<List<Integer>> ls, int[] key, int node, int parent, int k, int xor) {
       
        if (xor >= k){ 
            res++;
        }

        for (int child : ls.get(node)) {
            if (child != parent) {
                dfs(ls, key, child, node, k, xor ^ key[child]);
            }
        }
    }
}