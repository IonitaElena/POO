import java.util.Vector;

public class Graph extends MyList {
    public int[] visited;
    int noduri;

    public Graph(int nr_noduri) {
        noduri = nr_noduri;
        visited=new int[noduri+1];
        for (int i = 0; i <= nr_noduri; i++) {
            add(new MyList());
        }
    }

    public void add(int x, int y) {
        boolean val = false;
        MyList list = (MyList) this.get(x);
        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i) == y) {
                val = true;
                return;
            }
        }
        list.add(y);
    }

    public void dfs(int start) {
        MyList vecini=(MyList) get(start);
        System.out.print(start+" ");
        visited[start]=1;
        for(int i=0;i<vecini.size();i++){
            int elem=(int)vecini.get(i);
            if(visited[elem]==0)
                dfs(elem);
        }
    }
    
    public String toString() {
        String s = "";

        for (int i = 1; i <= noduri; i++) {

            MyList listaa = (MyList)this.get(i);
            s = s + i+ listaa.toString() + "\n";
        }
        return s;
    }
}
