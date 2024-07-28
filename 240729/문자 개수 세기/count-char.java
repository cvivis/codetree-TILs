import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static StringTokenizer tokens;
   static StringBuilder output = new StringBuilder();
   static int N;
   public static void main(String[] args) throws IOException {
        String str = br.readLine();
        char c  = br.readLine().charAt(0);
        int cnt = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == c)cnt++;
        }
        System.out.println(cnt);

   }
}