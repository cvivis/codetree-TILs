import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
*
5 8
1 2 2
1 3 3
1 4 1
1 5 10
2 4 2
4 3 1
3 5 1
4 5 3
1 5

* */
public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokens;
    static StringBuilder output = new StringBuilder();
    static int N,M;
    static List<ArrayList<Node>> graph = new ArrayList<>();
    static PriorityQueue<Element> pq = new PriorityQueue<>();
    static int[] dist,path;
    static int A,B;

    static class Node{
        int from;
        int to;
        int w;
        public Node(int from, int to, int w){
            this.from = from;
            this.to = to;
            this.w = w;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "from=" + from +
                    ", to=" + to +
                    ", w=" + w +
                    '}';
        }
    }
    static class Element implements Comparable<Element>{
        int dist;
        int index;

        public Element(int dist, int index) {
            this.dist = dist;
            this.index = index;
        }

        @Override
        public int compareTo(Element o) {
            return this.dist - o.dist;
        }
    }

    public static void main(String[] args) throws IOException {
        tokens = new StringTokenizer(br.readLine());
        N = Integer.parseInt(tokens.nextToken());
        M = Integer.parseInt(tokens.nextToken());
        dist = new int[N+1];
        path = new int[N+1];
        for(int i = 0; i <= N;i++){
            graph.add(new ArrayList<>());
        }
        Arrays.fill(dist,(int)1e9);
        for(int i = 0; i < M;i++){
            tokens = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(tokens.nextToken());
            int to = Integer.parseInt(tokens.nextToken());
            int w = Integer.parseInt(tokens.nextToken());
            graph.get(from).add(new Node(from,to,w));
            graph.get(to).add(new Node(to,from,w));
        }
        tokens = new StringTokenizer(br.readLine());
        A = Integer.parseInt(tokens.nextToken());
        B = Integer.parseInt(tokens.nextToken());
        dist[A] = 0;
        path[A] = -1;
        dijkstra();
        System.out.println(dist[B]);
//        System.out.println(Arrays.toString(path));
        int p = B;
        List<Integer> pList = new ArrayList<>();
        while(p != -1){
            pList.add(p);
            p = path[p];
        }
       for(int i = pList.size()-1; i >=0; i--){
           System.out.print(pList.get(i)+" ");
       }
    }
    public static void dijkstra(){
        pq.add(new Element(0,A));
        while(!pq.isEmpty()){
            Element now = pq.poll();
            if(now.dist != dist[now.index])continue;
            for(int i = 0; i < graph.get(now.index).size();i++){
                Node next = graph.get(now.index).get(i);
//                System.out.println(next);
                if(dist[next.to] > dist[now.index] + next.w){
                    dist[next.to] = dist[now.index] + next.w;
                    path[next.to] = now.index;
                    pq.add(new Element(dist[next.to],next.to));
                }
            }
        }
    }
}