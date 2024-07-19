public class elementSearch{
    public static int Maxi(int[] array){
        int x=0;
        for(int i=0;i<array.length;i++){
            if(x<array[i]){
                x=array[i];
            }
        }
        return x;
    }
    public static void main(String args[]){
        int[] array={5,8,10,2,30,45};
        int result=Maxi(array);
        System.out.print(result);
    }
}

//45