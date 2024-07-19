import java.util.*;
public class letterAlternative {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String arr1=sc.nextLine();
    String arr2=sc.nextLine();
    int n1=arr1.length();
    int n2=arr2.length();
    int j=0;
    if(n1==n2){
    for(int i=0;i<n1;i++){
       System.out.print(arr1.charAt(i)+""+arr2.charAt(i));
       }
    }
    int count=0;
    if(n1<n2){
     for(j=0;j<n1;j++){
         System.out.print(arr1.charAt(j)+""+arr2.charAt(j));
         count++;
         }
      //int l=count;
      for(int k=count;k<n2;k++){
         System.out.print(arr2.charAt(k));
         } 
      }
    int count1=0;
    if(n1>n2){
    for(int x=0;x<n2;x++){
      System.out.print(arr1.charAt(x)+""+arr2.charAt(x));
        count1++; 
         }
      for(int q=count1;q<n1;q++){
        System.out.print(arr1.charAt(q));
         }
      }
   } 
 }