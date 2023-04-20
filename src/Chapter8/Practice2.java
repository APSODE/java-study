package Chapter8;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int[] input_integer_array = new int[10];
        Scanner sc = new Scanner(System.in);
        int max_int = Integer.MIN_VALUE;
        int min_int = Integer.MAX_VALUE;
        int total = 0;
        for (int idx = 0; idx < input_integer_array.length; idx++) {
            input_integer_array[idx] = sc.nextInt();
        }
        for (int idx = 0; idx < input_integer_array.length; idx++) {
            int temp = input_integer_array[idx];
            if (temp < min_int) {
                min_int = temp;
            }
            if (temp > max_int) {
                max_int = temp;
            }
            total += temp;
        }
        System.out.println("합 : " + total + " 최대값 : " + max_int + " 최소값 : " + min_int);
    }
}
