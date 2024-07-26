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
        tokens = new StringTokenizer(br.readLine());
        String str = tokens.nextToken();
        String str2 = tokens.nextToken();
        int len1 = str.length(); 
        int len2 = str2.length();
        if(len1 > len2){
            System.out.println(str + " " + len1);
        }
        else if(len1 < len2){
            System.out.println(str2 + " " + len2);
        }
        else{
            System.out.println("same");
        }
        
    }
}