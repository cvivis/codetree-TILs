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
//        List<String> list = new ArrayList<>();
        tokens = new StringTokenizer(br.readLine());
        int cnt = 0;
        while(tokens.hasMoreTokens()){
            cnt += tokens.nextToken().length();
        }
        System.out.println(cnt);
    }
}