// class numPyramid {
//     public static void main(String[] args) {
//         int n=3;
//         int start=1;
//         for(int i=0;i<=n;i++){
//             if(i==0){
//                 System.out.print(" "+ " " +" ");
//             }
//             if(i==1){
//                 System.out.print(" "+ " ");
//             }
//             if(i==2){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<=i;j++){
//             System.out.print(start);
//             start++;
//             System.out.print(" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


//    1  
//   2 3  
//  4 5 6  
// 7 8 9 10 

// class HelloWorld {
//     public static void main(String[] args) {
//         int n=3;
//         int m=n-1;
//         int start=1;
//         for(int i=0;i<=n;i++){
//             for(int k=0;k<=m;k++){
//                 System.out.print(" ");
//             }
//             m--;
//             for(int j=0;j<=i;j++){
//                System.out.print(start);
//                System.out.print(" ");
//             }
//             start++;
//            System.out.println(" ");
//         }
//     }
// }

//    1  
//   2 2  
//  3 3 3  
// 4 4 4 4 


import java.util.*;
class numPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                  System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
             System.out.print(j+" ");   
            }
            System.out.println(" ");
        }
    }
}


// input:4
//     1  
//    1 2 1  
//   1 2 3 2 1  
//  1 2 3 4 3 2 1 