class Palindrome {
    public static void main(String[] args) {
       String str = "malayalam";
       String s1 = str;
       String s2 = "";
       for(int i = s1.length()-1;i>=0;i--){
           s2 = s2+s1.charAt(i);
       }
       if(s1.equals(s2))
       {
           System.out.print("Palindrome");
       }
       else{
           System.out.print(" not Palindrome");
       }
       
       
    }
}

//Palindrome(output)