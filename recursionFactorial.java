// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class recursionFactorial {
    
    public static int multiply(int num){
        if(num==1){
            return 1;
        }
        return num*multiply(num-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(multiply(n));
    }
}