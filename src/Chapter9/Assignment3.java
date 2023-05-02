package Chapter9;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] binary_data_array = new int[64];
        int user_input_decimal = sc.nextInt();
        int index_count = 0;
        while (user_input_decimal > 0) {
            binary_data_array[index_count++] = user_input_decimal % 2;
            user_input_decimal /= 2;
        }
        for (int idx = index_count - 1; idx >= 0; idx--) {
            System.out.print(binary_data_array[idx] + " ");

        }
        System.out.println();
    }
}
