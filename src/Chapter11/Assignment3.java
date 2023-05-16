package Chapter11;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_input_string = sc.nextLine();
        char[] user_input_string_array = user_input_string.toCharArray();
        String find_target_string = sc.nextLine();
        String change_string = sc.nextLine();
        int first_check_idx = user_input_string.indexOf(find_target_string);

        StringBuilder result_head_string = new StringBuilder();
        for (int idx = 0; idx < first_check_idx; idx++) {
            result_head_string.append(user_input_string_array[idx]);
        }

        StringBuilder result_tail_string = new StringBuilder();
        for (int idx = first_check_idx + find_target_string.length(); idx < user_input_string_array.length; idx++) {
            result_tail_string.append(user_input_string_array[idx]);
        }

        System.out.println(result_head_string + change_string + result_tail_string);

    }
}
