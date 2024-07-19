import java.util.*;
public class getStoreDisplayArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array1 size:");
        int s1=sc.nextInt();
        System.out.println("Enter the array2 size:");
        int s2=sc.nextInt();
        int[] array1 = new int[s1];
        int[] array2 = new int[s2];
        System.out.println("enter the elements of the array1:");
        for(int i=0;i<=s1-1;i++){
            int m=sc.nextInt();
            array1[i]=m;
        }
        System.out.println("Enter the elements of array2:");
        for(int j=0;j<=s2-1;j++){
            int n=sc.nextInt();
            array2[j]=n;
        }
        System.out.println("display the elements of array1:");
        for(int x=0;x<=s1-1;x++){
            System.out.println(array1[x]);
        }
        System.out.println("display the elements of array2:");
        for(int y=0;y<=s2-1;y++){
            System.out.println(array2[y]);
        }
    }
}

// Enter the array1 size:
// 2
// Enter the array2 size:
// 3
// enter the elements of the array1:
// 1
// 2
// Enter the elements of array2:
// 1
// 2
// 3
// display the elements of array1:
// 1
// 2
// display the elements of array2:
// 1
// 2
// 3