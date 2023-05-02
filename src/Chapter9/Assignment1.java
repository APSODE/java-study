package Chapter9;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input_number_array = new int[10];
        for (int count = 0; count < 10; count++) {
            input_number_array[count] = sc.nextInt();
        }
        for (int count = 9; count >= 0; count--) {
            System.out.print(input_number_array[count] + " ");
        }
        System.out.println();
    }
}
