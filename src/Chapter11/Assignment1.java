package Chapter11;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input_string_word_array = sc.nextLine().split(" ");

        for (int str_word_idx = input_string_word_array.length - 1; str_word_idx >= 0; str_word_idx--) {
            System.out.print(input_string_word_array[str_word_idx] + " ");
        }

    }
}
