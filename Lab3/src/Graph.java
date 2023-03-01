public class Graph {
    private int[][] matrice;
    private int Infinit=9500;
    private int n;

    public Graph(int n){
        this.n=n;
        this.matrice=new int[n+1][n+1];
    }
    public int getSize(){
        return n;
    }
    public void addArc(int v, int w, int cost){
        matrice[v][w]=cost;
        //matrice[w][v]=cost;
    }
    public boolean isArc(int v, int w){
        if(matrice[v][w]==0)
            return false;
        else
            return true;
    }
    public String toString(){
        String afisare="";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                afisare += matrice[i][j] + " ";
            afisare += "\n";
        }
        return afisare;
    }



    public int[][] floydWarshall() {
        int result[][];
        result = new int[n+1][n+1];
        int k, i, j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++) {
                if(i == j) {
                    result[i][j] = 0;
                } else if(isArc(i, j)) {
                    result[i][j] = matrice[i][j];
                } else {
                    result[i][j] = Infinit;
                }
            }
        }
        for(k = 1; k <= n; k++) {
            for(i = 1; i <= n; i++) {
                for(j = 1; j <= n; j++) {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if(result[i][j] > dist) {
                        result[i][j] = dist;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addArc(1, 3, 2);
        g.addArc(1, 2, 3);
        g.addArc(2, 4, 6);
        g.addArc(2, 3, 2);
        System.out.println(g);
        System.out.println("Floyd-Warshall");
        int [][] my_matrix = g.floydWarshall();
        System.out.println("distanta minima dintre nodurile 1 si 4 este "+ my_matrix[1][4]); // rezultat - 9
    }

}
