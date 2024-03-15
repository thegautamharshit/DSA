public class Patterns {
    public static void holow_rectange(int totRows, int totCols) {
        System.out.println("\u001B[4mHollow Rectangle\u001B[0m");
        //outer loop
        for (int i = 1; i <= totRows; i++) {
            //inner loop
            for (int j = 1; j <= totCols; j++) {
                //cell=(i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void inverted_triangle(int n) {
        System.out.println("\u001B[4mInverted Trianlge\u001B[0m");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invertedHalf(int n) {
        System.out.println("\u001B[4mInverted Half Triangle\u001B[0m");
        for (int i = 1; i <= n; i++) {
            //NOTE:- Here i have used formula(n-i+1) but above 1i have used just reverse for loop
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        System.out.println("\u001B[4mFloyds Traingle\u001B[0m");
        int count=0;
        for (int i = 1; i <= n; i++) {
            for (int j=1;j<=i;j++) {
                count++;
                System.out.print(count+" ");

            }
            System.out.println();
        }
    }

    public static void _0_1_Traingle(int n) {
        System.out.println("\u001B[4m0 1 Traingle\u001B[0m");


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        System.out.println("\u001B[4mButterfly\u001B[0m");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void rhombus(int n) {
        System.out.println("\u001B[4mRhombus\u001B[0m");
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        System.out.println("\u001B[4mHollow Rhombus\u001B[0m");
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        System.out.println("\u001B[4mDiamond\u001B[0m");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        System.out.println("\u001B[4mNumber Pyramid\u001B[0m");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindromePattern(int n) {
        System.out.println("\u001B[4mPalindrome Pattern With numbers\u001B[0m");
        for (int i = 1; i <=n; i++) {
            //space
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        holow_rectange(4,5);
        System.out.println("---------------------------------------");
        inverted_triangle(4);
        System.out.println("---------------------------------------");
        invertedHalf(5);
        System.out.println("---------------------------------------");
        floyds_triangle(5);
        System.out.println("---------------------------------------");
        _0_1_Traingle(5);
        System.out.println("---------------------------------------");
        butterfly(5);
        System.out.println("---------------------------------------");
        rhombus(5);
        System.out.println("---------------------------------------");
        hollow_rhombus(5);
        System.out.println("---------------------------------------");
        diamond(5);
        System.out.println("---------------------------------------");
        numberPyramid(5);
        System.out.println("---------------------------------------");
        palindromePattern(5);


    }
}
