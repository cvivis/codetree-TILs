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
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= N;i++){
            for(int j = 1; j <= i;j++){
                dp[i] +=  (dp[j-1] * dp[i-j]);
            }
        }
//        System.out.println(Arrays.toString(dp));
        System.out.println(dp[N]);
    }
}