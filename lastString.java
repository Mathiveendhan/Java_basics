import java.util.*;
public class lastString{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);    
    String str=sc.nextLine();
    String[] str1=str.split(" ");
    int n=str1.length;
    System.out.print(str1[n-1]);
    }
    
}



//input:I love java programming
//output:programing
