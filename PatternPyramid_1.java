//         *
//       * * *       
//     * * * * *     
//   * * * * * * *   
// * * * * * * * * * 

import java.util.Scanner;

public class PatternPyramid_1 {
    public static void main(String x[]) {
        // PatternStatic_1();
        patternDynamic_2();
    }

    static void PatternStatic_1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j >= (6 - i) && j <= (4 + i)) {
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

        System.out.print("Enter the rows of pyramid: ");
        int rows = sc.nextInt();
        int cols = rows + rows - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j >= ((rows + 1) - i) && j <= ((rows - 1) + i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
