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
       String str2 = br.readLine();
       String str3 = br.readLine();
    int max = Math.max(str.length(),str2.length());
    max = Math.max(max,str3.length());
    int min = Math.min(str.length(),str2.length());
    min = Math.min(min,str3.length());
    System.out.println(max - min);
   }
}