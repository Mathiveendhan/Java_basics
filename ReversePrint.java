public class ReversePrint{
    public static void main(String args[]){
        int[] x={1,2,3};
        int n=x.length;
        for(int i=n-1;i<=n&&i>=0;i--){
            System.out.println(x[i]);
        }
    }
}