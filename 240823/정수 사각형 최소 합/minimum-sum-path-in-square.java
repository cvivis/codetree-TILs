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
    static int[][] dp,input;


    public static void main(String[] args) throws IOException {
        tokens = new StringTokenizer(br.readLine());
        N = Integer.parseInt(tokens.nextToken());
        input = new int[N+1][N+1];
        dp = new int[N+1][N+1];
        for(int i = 1; i <= N;i++ ){
            tokens = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N;j++){
                input[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }
        dp[1][N] = input[1][N];
        for(int i = 1; i <= N;i++){
            dp[i][N] = dp[i-1][N] + input[i][N];
        }
        for(int i = N-1; i >= 1;i--){
            dp[1][i] = dp[1][i+1] + input[1][i];
        }
        for(int i = 2; i <= N;i++ ){
            for(int j = N-1; j >= 1;j--){
                dp[i][j] = Math.min(dp[i][j+1],dp[i-1][j]) + input[i][j];
            }
        }
        System.out.println(dp[N][1]);

    }
}