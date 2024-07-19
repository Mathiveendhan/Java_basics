//even position



// class evenWord {
//     public static void main(String[] args) {
//         String s="I love java programming";
//         String[] str=s.split(" ");
//         for(int i=0;i<str.length;i++){
//             if(i%2==0){
//                 System.out.println(str[i]);
//             }
//         }
//     }
// }



class evenword{
    public static void main(String args[]){
        String s="I love java programming";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            int n=str[i].length();
            if(n%2==0){
                System.out.println(str[i]);
            }
        }
    }
}