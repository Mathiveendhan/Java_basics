//package Student;
import java.util.*;
public class Main1{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     Student display[]=new Student[n];
     for(int i=0;i<n;i++){
         System.out.println("enter the student name:");
         String name=sc.nextLine();
         sc.nextLine();
         System.out.println("enter the student age:");
         int age=sc.nextInt();
         sc.nextLine();
         display[i]=new Student(name,age);
        // display[i]=new display();

     }
    }
}


class Student {
    int Age;
    String Name;
    public Student(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }
    void dislay(){
        System.out.println(Name);
        System.out.println(Age);
        //System.out.println("enter the student name:");
    }
}
