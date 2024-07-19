import java.util.*;
public class multipleNotItself{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=4;
    int count=1;
    int[] length=new int[4];
    int[] arr=new int[4];
    for(int i=0;i<4;i++){
        arr[i]=sc.nextInt();
    }
    for(int j=0;j<4;j++){
        for(int k=0;k<4;k++){
            if(arr[j]!=arr[k]){
                int value=arr[k];
                count=count*value;
            }
        }
         length[j]=count;
         count=1;
    }
     for(int a=0;a<4;a++){
        System.out.print(length[a]+" ");
     }
    }
}



//input: 1 2 3 4
//output: 24 12 8 6