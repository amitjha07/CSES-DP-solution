import java.util.Arrays;
import java.util.Scanner;

public class minimizecoin
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int sum= scanner.nextInt();
        int a[]= new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]= scanner.nextInt();
        }
        int dp[]=new int[sum+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for (int coin : a) {
            for (int i = coin; i <= sum; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        System.out.println((dp[sum] == Integer.MAX_VALUE) ? -1 : dp[sum]);
    }
}
