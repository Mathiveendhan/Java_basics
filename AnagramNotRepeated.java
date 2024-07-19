public class AnagramNotRepeated{
    public static void main(String args[]){
        String str1="INTEGR";
        String str2="NIETRG";
        int n1=str1.length();
        int n2=str2.length();
        int count=0;
        if(n1==n2){
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                if(str1.charAt(j)==str2.charAt(i)){
                    count++;
                }
            }
        }
        if(count==n1){
            System.out.println("Anagram");
        }
         else{
            System.out.println("not anagram");
        }
        }
        else{
            System.out.println("not anagram");
        }
    }
}