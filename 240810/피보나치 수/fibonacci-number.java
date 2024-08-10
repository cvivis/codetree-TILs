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
        int[] dp = new int[50];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= N;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[N]);
    }
}