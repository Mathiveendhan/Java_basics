public class oddEvenFinder{
    public static void main(String args[]){
        int[] array={5,8,10,12};
        System.out.print("even:");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
              System.out.print(array[i]+" ");  
            }
        }
        System.out.println(" ");
         System.out.print("odd:");
            for(int j=0;j<array.length;j++){
            if(array[j]%2==1){
              System.out.print(array[j]+" ");  
            }
        }
    }
  }


// even:8 10 12  
// odd:5 