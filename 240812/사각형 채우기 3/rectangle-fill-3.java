import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokens;
    static StringBuilder output = new StringBuilder();
    static int N;
    static int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        long[] dp = new long[1001];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 7;
        for(int i = 3; i <= N;i++){
            dp[i] = (dp[i-1] * 2 + dp[i-2] * 3) % mod;
            for(int j = 3; j <= i; j++){
                dp[i] = (dp[i] + dp[i-j] * 2) % mod;
            }
        }

        System.out.println(dp[N]);
    }
}