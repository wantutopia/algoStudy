public class Dfs {

    static int[] visited = new int[10];
    static int[][] graph = {
            {0,0,0,0,0,0,0,0},
            {0,0,1,1,0,0,0,0},
            {0,1,0,0,1,0,0,0},
            {0,1,0,0,0,1,1,1},
            {0,0,1,0,0,0,0,0},
            {0,0,0,1,0,0,0,0},
            {0,0,0,1,0,0,0,0},
            {0,0,0,1,0,0,0,0},
    };
    static int[] visited2 = new int[8];
    static int[][] graph2 = {
            {1,1,1,0,0,0,0,0},
            {1,0,0,1,1,0,0,0},
            {1,0,0,0,0,1,1,0},
            {0,1,0,0,0,0,0,1},
            {0,1,0,0,0,0,0,1},
            {0,0,1,0,0,0,0,1},
            {0,0,1,0,0,0,0,1},
            {0,0,0,1,1,1,1,0}
    };

    public static void main(String[] args) {

        dfs(0);
    }

    static void dfs(int node) {

        visited2[node] = 1;
        for (int i=0; i<8; i++) {
            if(graph2[node][i] == 1 && visited2[i] != 1) {
                System.out.println(String.valueOf(node+1)+ "에서" + String.valueOf(i+1) + "로 이동");
                dfs(i);
            }
        }

    }
}
