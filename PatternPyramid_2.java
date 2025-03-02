// * * * * * * * * * 
//   * * * * * * *   
//     * * * * *     
//       * * *       
//         *

import java.util.Scanner;

public class PatternPyramid_2 {
    public static void main(String x[]) {
        patternStatic_1();
        // patternDynamic_2();
    }

    static void patternStatic_1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j >= i && j <= (10 - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    static void patternDynamic_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of pyramid: ");
        int rows = sc.nextInt();
        int cols = 2 * rows - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j >= i && j <= ((cols + 1) - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
