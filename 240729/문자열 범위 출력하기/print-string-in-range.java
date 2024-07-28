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
    //    tokens = new StringTokenizer(br.readLine());
    //    String str = tokens.nextToken();
    String str = br.readLine();
    for(int i = 2;i<10;i++){
        System.out.print(str.charAt(i));
    }

   }
}