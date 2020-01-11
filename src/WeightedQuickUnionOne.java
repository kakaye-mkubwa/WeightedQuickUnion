public class WeightedQuickUnionOne {
    private int[] id;

    public WeightedQuickUnionOne(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i){
        while(i != id[i]) i = id[i];
        return i;
    }

    public boolean isConnected(int p,int q){
        return root(p) == root(q);
    }

    /**
     * Function to find the size of tree, by checking whether they have similar roots
     * @param i this is a root of a given number
     * @return
     */
    private int size(int i){
        int counter = 0;

        for (int b:id) {
            if (root(b) == i) counter++;
        }
        return counter;
    }

    /**
     * Different from quick union
     * Link root of smaller tree to root of larger tree
     * @param p
     * @param q
     */
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);

        if (i == j) return;
        if (size(i) < size(j)){
            id[i] = j;
        }else{
            id[j] = i;
        }
    }
}
