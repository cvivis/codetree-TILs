import java.util.*;
import java.io.*;
class Edge {
    int x, y, z;
    
    public Edge(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
};

public class Main {    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer tokens;
    public static boolean[] visited;
    
    public static int[] dist;
    public static int[][] graph;
    public static void main(String[] args) throws IOException{
        // 정점의 수 : 5, 간선의 수 : 8인 그래프
        tokens = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokens.nextToken()); 
        int m = Integer.parseInt(tokens.nextToken());
        visited = new boolean[n+1];
        dist = new int[n+1];
        graph = new int[n+1][n+1];
        // 주어진 간선 정보 (x, y, z)
        // x -> y로 향하는 간선이 있으며, 가중치는 z 
        // Edge[] edges = new Edge[n+1][n+1];
        // for(int i = 0; i <= n;i++){
        //     Arrays.fill(graph[i],-1);
        // }

        // 그래프를 인접행렬로 표현
        for(int i = 1; i <= m; i++) {
            tokens = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tokens.nextToken()); 
            int y = Integer.parseInt(tokens.nextToken()); 
            int z = Integer.parseInt(tokens.nextToken()); 
            graph[x][y] = z;
        }
        
        // 그래프에 있는 모든 노드들에 대해
        // 초기값을 전부 아주 큰 값으로 설정
        // INT_MAX 그 자체로 설정하면
        // 후에 덧셈 진행시 overflow가 발생할 수도 있으므로
        // 적당히 큰 숫자로 적어줘야함에 유의!
        for(int i = 1; i <= n; i++)
            dist[i] = (int)1e9;

        // 시작위치에는 dist값을 0으로 설정
        // 여기서는 시작위치를 5번으로 가정
        dist[1] = 0;

        // O(|V|^2) 다익스트라 코드
        for(int i = 1; i <= n; i++) {
            // V개의 정점 중 
            // 아직 방문하지 않은 정점 중
            // dist값이 가장 작은 정점을 찾아줍니다.
            int minIndex = -1;
            for(int j = 1; j <= n; j++) {
                if(visited[j])
                    continue;
                
                if(minIndex == -1 || dist[minIndex] > dist[j])
                    minIndex = j;
            }

            // 최솟값에 해당하는 정점에 방문 표시를 진행합니다.
            visited[minIndex] = true;

            // 최솟값에 해당하는 정점에 연결된 간선들을 보며
            // 시작점으로부터의 최단거리 값을 갱신해줍니다.
            for(int j = 1; j <= n; j++) {
                // 간선이 존재하지 않는 경우에는 넘어갑니다.
                if(graph[minIndex][j] == 0)
                    continue;

                dist[j] = Math.min(dist[j], dist[minIndex] + graph[minIndex][j]);
            }
        }

        // 시작점(n번 정점)으로부터 각 지점까지의 최단거리 값을 출력합니다.
        for(int i = 2; i <= n; i++)
            System.out.println(dist[i]);
            if(dist[i] == (int)1e9){
                System.out.println(-1);
            }
    }
}