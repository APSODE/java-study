package Chapter10;

import java.util.Random;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("첫번째 행렬의 크기 : ");
        int fm_row_size = sc.nextInt();
        int fm_column_size = sc.nextInt();
        int[][] f_matrix = new int[fm_row_size][fm_column_size];
        for (int fm_row_idx = 0; fm_row_idx < f_matrix.length; fm_row_idx++) {
            for (int fm_column_idx = 0; fm_column_idx < f_matrix[fm_row_idx].length; fm_column_idx++) {
                f_matrix[fm_row_idx][fm_column_idx] = rnd.nextInt(100);
            }
        }


        System.out.print("두번째 행렬의 크기 : ");
        int sm_row_size = sc.nextInt();
        int sm_column_size = sc.nextInt();
        int[][] s_matrix = new int[sm_row_size][sm_column_size];
        for (int sm_row_idx = 0; sm_row_idx < s_matrix.length; sm_row_idx++) {
            for (int sm_column_idx = 0; sm_column_idx < s_matrix[sm_row_idx].length; sm_column_idx++) {
                s_matrix[sm_row_idx][sm_column_idx] = rnd.nextInt(100);
            }
        }
        System.out.println("첫번째 행렬 데이터");
        for (int[] fm_row : f_matrix) {
            for (int f_data : fm_row) {
                System.out.print(f_data + " ");
            }
            System.out.println();
        }
        System.out.println("두번째 행렬 데이터");
        for (int[] sm_row : s_matrix) {
            for (int s_data : sm_row) {
                System.out.print(s_data + " ");
            }
            System.out.println();
        }

        int[][] result_matirx = new int[fm_row_size][sm_column_size];

        if (fm_column_size != sm_row_size) {
            System.out.println("행렬곱이 불가능합니다.");
            return;
        }

        for (int rm_row_idx = 0; rm_row_idx < result_matirx.length; rm_row_idx++) {
            for (int rm_column_idx = 0; rm_column_idx < result_matirx[rm_row_idx].length; rm_column_idx++) {
                for (int idx = 0; idx < sm_row_size; idx++) {
                    result_matirx[rm_row_idx][rm_column_idx] += f_matrix[rm_row_idx][idx] * s_matrix[idx][rm_column_idx];
                }
            }
        }

        for (int[] matrix_row : result_matirx) {
            for (int matrix_data : matrix_row) {
                System.out.print(matrix_data + " ");
            }
            System.out.println();
        }
    }
}
