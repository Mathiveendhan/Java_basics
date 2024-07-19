import java.util.*;
public class countBiggestString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] str=new String[3];
        for(int w=0;w<3;w++){
            str[w]=sc.nextLine();
        }
        //String[] str={"akice and bob love  leetcode","i think so too","this is great thanks very much"};
        int c=1;
        int b=1;
        int count=1;
        for(int i=0;i<str.length;i++){
         String[] result=str[i].split(" ");
            c=result.length;
            if(c>b){
                b=c;
                count=c;
            }
            c=1;
        }
        System.out.print(count);
    }
    
}




//input:akice and bob love leetcode,i think so too,this is great thanks very much
//output:6