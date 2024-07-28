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
        N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int len = 0;
        for(int i = 0; i < N;i++){
            String str = br.readLine();
            len += str.length();
            if(str.charAt(0) == 'a')cnt++;
        }
        System.out.println(len + " "+cnt);
    }
}