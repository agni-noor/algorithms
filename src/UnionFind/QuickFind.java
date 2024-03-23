package UnionFind;

public class QuickFind {
    private int[] id;
    private int count;

    public QuickFind(int N){
        count = N;
        id = new int[N];
        for(int i=0;i<count;i++){
            id[i]=i;
        }

    }

    public int find(int p){
        return id[p];
    }

    public int retCount(){
        return count;
    }

    public boolean connected(int p, int q){
        if(find(p)==find(q)){
            return true;
        }else return false;
    }

    public void union(int p, int q){
        if(connected(p,q)) return;
        else{
            int idp = find(p);
            int idq = find(q);
            for(int i=0; i< count; i++){
                if (id[i]==idp){
                    id[i] = idq;
                }
            }
        }
        return;
    }



}
