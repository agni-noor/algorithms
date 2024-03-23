package UnionFind;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        QuickFind qf = new QuickFind(N);
        System.out.println(qf.connected(1,2));
        qf.union(1,2);
        System.out.println(qf.connected(1,2));
        for(int i=0;i<N;i++){
            System.out.println(qf.find(i));
        }
    }
}
