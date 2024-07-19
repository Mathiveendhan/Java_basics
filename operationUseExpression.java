import java.util.*;
public class operationUseExpression{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String[] str=new String[3];
    for(int i=0;i<3;i++){
     str[i]=sc.nextLine();
    }
    int x=0;
    int y=0;
    int count = 0;
    for(int j=0;j<3;j++){
        if(str[j].equals("--x")||str[j].equals("x--")){
            count -= 1;
        }
        if(str[j].equals("x++")||str[j].equals("++x")){
            count +=1;
        }
    }
    System.out.print(count);
  }
}



//input:--x,x++,x++
//output:1