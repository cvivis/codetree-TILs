import java.io.*;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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
        for(int i = 0 ; i < 10;i++){
            String str = tokens.nextToken();
            if(i % 2 == 0){
                System.out.println(str);
            }
        }
    }
}