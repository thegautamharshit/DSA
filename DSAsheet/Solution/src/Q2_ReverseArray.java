public class Q2_ReverseArray {

    static void print(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    static void reverse(int[] arr) { // O(n) O(n)
        int[] new_arr= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i]=arr[arr.length-i-1];
            /*0 = (4)5-0-1
              1 = (3)5-1-1
              2 = (2)5-2-1
              3 = (1)5-3-1
              4 = (0)5-4-1
              */
        }
        print(new_arr);
    }

    static void reverse_2(int[] arr) { // O(n) O(1)
        int temp,i=0,j=arr.length-1;
        while (i < j) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        print(arr);
    }
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        print(n);
//        reverse(n); // O(n) O(n)
        reverse_2(n); // O(n) O(1)
    }
}