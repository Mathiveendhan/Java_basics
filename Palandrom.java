public class Palandrom{
    public static int Palandrom(String s){
        
        int j=s.length();
        int i=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j-1)){
                return 0;
            }
            j--;
            i++;
        }
        return 1;
    }
    public static void main(String args[]){
         String s="MALAYALAM";
        int r=Palandrom(s);
        if(r==1){
          System.out.println("Palandrom");
        }
        else{
            System.out.println("not Palandrom");
        }
    }
}
