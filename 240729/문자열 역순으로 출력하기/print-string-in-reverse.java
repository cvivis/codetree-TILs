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
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 4;i++){
            list.add(br.readLine());
        }
        for(int i = list.size()-1;i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}