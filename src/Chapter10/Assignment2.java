package Chapter10;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table = new int[3][4];
        int[][] reverse_table = new int[4][3];

        for (int row_idx = 0; row_idx < table.length; row_idx++) {
            System.out.print((row_idx + 1) + "번째 행의 값 입력 : ");
            for (int column_idx = 0; column_idx < table[row_idx].length; column_idx++) {
                table[row_idx][column_idx] = sc.nextInt();
            }
        }

        for (int row_idx = 0; row_idx < table.length; row_idx++) {
            for (int column_idx = 0; column_idx < table[row_idx].length; column_idx++) {
                reverse_table[column_idx][row_idx] = table[row_idx][column_idx];
            }
        }

        for (int[] row : reverse_table) {
            for (int data : row) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
