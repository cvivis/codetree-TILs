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
        dp[2] = 1;
        dp[3] = 1;
        for(int i = 4; i <= N;i++){
            dp[i] = (dp[i-2] + dp[i-3])%10007;
        }
        System.out.println(dp[N]);
    }
}