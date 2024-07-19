public class Count {
    public static void main(String args[]) {
        int[] array = {2, 2, 1, 1, 1, 1, 2};
        int count = 1;
        int count1 = 1;
        int num = array[0];
        int num1 = array[0];
        int n = array.length;

        for (int i = 1; i < n-1; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count > count1) {
                    count1 = count;
                    num1 = num;
                }
                count = 1;
                num = array[i];
            }
        }
        if (count > count1) {
            count1 = count;
            num1 = num;
        }

        System.out.print("Count of the most frequent element: " + count1);
        System.out.println("\nMost frequent element: " + num1);
    }
}