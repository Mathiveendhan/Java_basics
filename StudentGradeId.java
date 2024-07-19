//package Demo;
import java.util.*;
public class StudentGradeId {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(",");
        String[] name=str[0].split(" ");
        String ID=str[1];
        int Count=sc.nextInt();
        sc.nextLine();

        String marks=sc.nextLine();
        //int n1=marks.length();
        //String Marks=new String[];
        String[] Marks=marks.split(",");
        int n=Marks.length;
        int add=0;
        int Add;
        int[] test=new int[n];
        for(int i=0;i<n;i++){
            String score=Marks[i];
            test[i]=Integer.parseInt(score);
            add=add+test[i];
        }
        char c='O';
        Add=add/Count;
        if(Add<90){
            c='O';
        }
        else if(Add<80 || Add>70){
            c='A';
        }
        else if(Add<70 || Add>50){
            c='B';
        }
        else{
            c='C';
        }
        System.out.println("Name:"+name);
        System.out.println("ID"+ID);
        System.out.println("Grade:"+c);


    }
}


//        virat koli,7897
//        3
//        67,89,99



