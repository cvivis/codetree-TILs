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
        char c = br.readLine().charAt(0);
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("grape");
        list.add("blueberry");
        list.add("orange");
        int cnt = 0;
        for(int i = 0; i < list.size();i++){
            if(list.get(i).charAt(2) == c || list.get(i).charAt(3) == c){
                System.out.println(list.get(i));
                cnt++;
            };
        }
        System.out.println(cnt);
    }
}