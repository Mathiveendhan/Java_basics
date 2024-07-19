import java.util.*;
public class sentenceOrder{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] str1=str.split(" ");
    String[] result=new String[4];
    for(int i=0;i<str1.length;i++){
             String value=str1[i].toString();
             int a=value.length();
             char d=value.charAt(a-1);
             int z=Character.getNumericValue(d);
             int value1=z-1;
             result[value1]=str1[i];
    }
    for(int q=0;q<4;q++){
        System.out.print(result[q]+" ");
    }
  }
}




//input:is2 sentence4 This1 a3
//output:This1 is2 a3 sentence4