public class BinarySearch1{
    public static void main(String args[]){
        int[] array={5,8,13,17,24,30,0};
        int find=24;
        int mid=0;
        int num=array.length;
        int num1=num-1;
        if(num%2==0){
            mid=num/2;
        }
        if(num%2==1){
            num=num-1;
            mid=num/2;
        }
        if(find<=mid){
            for(int i=0;i<=num;i++){
                if(array[i]==find){
                    System.out.println(i+1);
                }
            }
        }
        if(find>=mid){
            for(int i=0;i<=num;i++){
                if(array[i]==find){
                    System.out.println("index of this "+array[i]+"th element is "+(i+1));
                }
            }
        }
    }
}


//index of this 24th element is 41