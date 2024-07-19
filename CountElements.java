public class CountElements{
    public static int arrayCount(int[] array,int n){
        int a,count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] array={12,13,18,10,1,1,8,5,1};
        int num=1;
        int result=arrayCount(array,num);
        System.out.println("Count of 1 is "+result);
    }
}

//Count of 1 is 3