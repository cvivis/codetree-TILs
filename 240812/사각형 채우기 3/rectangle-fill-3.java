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

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int[] dp = new int[1000];
        dp[1] = 2;
        dp[2] = 7;
        for(int i = 3; i <= N;i++){
            dp[i] = (dp[i-1] * 2 + dp[i-2])%1000000007;
        }
        System.out.println(dp[N]);
    }
}