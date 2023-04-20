package Chapter8;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int[][] vector_array = new int[2][3];
        int[] vector_sum_array = new int[3];
        char[] vector_char_array = {'x', 'y'};

        Scanner sc = new Scanner(System.in);
        for (int vector_char_idx = 0; vector_char_idx < 2; vector_char_idx++) {
            char vector_char = vector_char_array[vector_char_idx];
            System.out.print("백터" + vector_char + "를 입력하시오(" + vector_char + "1, " + vector_char + "2, " + vector_char + "3) : ");
            for (int vector_elem_idx = 0; vector_elem_idx < vector_array[vector_char_idx].length; vector_elem_idx++) {
                vector_array[vector_char_idx][vector_elem_idx] = sc.nextInt();
            }
        }
        for (int vector_char_idx = 0; vector_char_idx < 2; vector_char_idx++) {
            for (int vector_elem_idx = 0; vector_elem_idx < vector_array[vector_char_idx].length; vector_elem_idx++) {
                vector_sum_array[vector_elem_idx] += vector_array[vector_char_idx][vector_elem_idx];
            }
        }

        System.out.println("백터의 합은 vector ( " + vector_sum_array[0] + " " + vector_sum_array[1] + " " + vector_sum_array[2] + " )");
    }
}
