package Chapter8;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int[][] vector_array = new int[2][3];
        char[] vector_char_array = {'x', 'y'};

        Scanner sc = new Scanner(System.in);
        for (char vector_char_idx = 0; vector_char_idx < 2; vector_char_idx++) {
            char vector_char = vector_char_array[vector_char_idx];
            System.out.print("백터" + vector_char + "를 입력하시오(" + vector_char + "1, " + vector_char + "2, " + vector_char + "3) : ");
            vector_array[vector_char_idx][0] = sc.nextInt();
            vector_array[vector_char_idx][1] = sc.nextInt();
            vector_array[vector_char_idx][2] = sc.nextInt();

        }
        int vector_first_sum = vector_array[0][0] + vector_array[1][0];
        int vector_second_sum = vector_array[0][1] + vector_array[1][1];
        int vector_third_sum = vector_array[0][2] + vector_array[1][2];
        System.out.println("백터의 합은 vector ( " + vector_first_sum + " " + vector_second_sum + " " + vector_third_sum + " )");
    }
}
