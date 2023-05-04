package Chapter9;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int[][] box = new int[5][3];
        Scanner sc = new Scanner(System.in);
        for (int box_idx = 0; box_idx < 5; box_idx++) {
            System.out.print(box_idx + "번째 행의 값 : ");
            for (int data_idx = 0; data_idx < 3; data_idx++) {
                box[box_idx][data_idx] = sc.nextInt();
            }
        }
        for (int[] box_row : box) {
            for (int box_data : box_row) {
                System.out.print(box_data + " ");
            }
            System.out.println();
        }
    }
}
