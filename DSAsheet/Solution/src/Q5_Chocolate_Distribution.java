import java.util.Arrays;

public class Q5_Chocolate_Distribution {



    static void check(int[] arr,int m) {
        Arrays.sort(arr);
        int min= arr.length-1;

        for (int i = 0; i < arr.length - m + 1; i++) {
            int diff = arr[i+m-1]-arr[i];
            if (min > diff) {
                min=diff;
            }
        }
        System.out.println(min);
    }



    public static void main(String[] args) {
        int[] n ={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;

        int[] n2 = {3, 4, 1, 9, 56, 7, 9, 12};
        int m2=5;

        int[] n3={7, 3, 2, 4, 9, 12, 56};
        int m3=3;


        check(n,m);
        check(n2,m2);
        check(n3,m3);
    }
}