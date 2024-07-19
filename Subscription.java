import java.util.*;
public class Subscription{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int count=sc.nextInt();
    for(int i=1;i<=count;i++){
        int person=sc.nextInt();
        int Subscription=sc.nextInt();
        if(person>0&&person<7){
            System.out.println(1*Subscription);
        }
        System.out.print("");
        if(person>6&&person<13){
             System.out.println(2*Subscription);
        }
        System.out.print("");
        if(person>12&&person<19){
             System.out.println(3*Subscription);
        }
        System.out.print("");
    }
  }
}

//input:
    // 3
    // 1(count of person in a group)
    // 100(amount for subscription)
    // 100(total subscription amount)
    // 12(count of person in a group)
    // 250(amount for subscription)
    // 500(total subscription amount)
    // 16(count of person in a group)
    // 135(amount for subscription)
    // 405(total subscription amount)