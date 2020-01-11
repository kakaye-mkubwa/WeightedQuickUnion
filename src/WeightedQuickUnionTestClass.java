public class WeightedQuickUnionTestClass {
    public static void main(String[] args){
        WeightedQuickUnionOne weightedQuickUnionOne = new WeightedQuickUnionOne(7);
        weightedQuickUnionOne.union(4,2);
        weightedQuickUnionOne.union(3,6);
        weightedQuickUnionOne.union(2,1);
        if (weightedQuickUnionOne.isConnected(4,1)){
            System.out.println("4 & 5 connected");
        }else{
            System.out.println("4 & 5 not connected");
        }
    }
}
