import java.util.Scanner;

public class cses
{
 static int MOD=1000000007;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int dp[]=new int[n+1];
        dp[0]=1;
        for (int left = 1; left <= n; left++) {
            for (int i = 1; i <= 6; i++) {
                if (left - i >= 0) {
                    dp[left] += dp[left - i];
                    dp[left] %= MOD;
                }
            }
        }
        System.out.println(dp[n]);
    }
}
