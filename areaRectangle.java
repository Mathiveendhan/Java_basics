//package rectangle;
import java.util.*;
class area {
    int areaOfRectangle(int l,int b){
        int result=l*b;
        //System.out.println("Area of rectangle is "+result);
        return result;
    }
}
public class areaRectangle {
    public static void main(String args[]){
        area a1=new area();
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int result1 = a1.areaOfRectangle(length,breadth);
        System.out.println("Area of the rectangle is "+result1);
    }
}
