import java.util.*;
public class increasingTriplet {
  public static boolean triple(int[] num){
  int n=num.length;
    if(n<3){
    return false;
    }
    int a=Integer.MAX_VALUE;
    int b=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      //int[] nums=new int[n];
     int nums=num[i];
      if(nums<a){
        a=nums;
      }
      else if(nums<b){
       b=nums;
      }
      else if(nums>b){
      return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter count:");
  int count=sc.nextInt();
  int[] num = new int[count];
  System.out.println("enter the values:");
  //int[] num={1,2,3,4,5};
  for(int q=0;q<count;q++){
      num[q]=sc.nextInt();
  }
  System.out.println(triple(num));
  }
}