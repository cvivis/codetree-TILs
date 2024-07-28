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
        N = Integer.parseInt(br.readLine());
        printStar(N);
    }
//    1 2 3 4 5 6 7 8 9 0 0
    private static void printStar(int n){
        if(n <= 0 )return;
        System.out.print(n + " ");
        printStar(n-1);
        System.out.print(n+" ");
    }
}