package Chapter11;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input_name_str_array = sc.nextLine().split(" ");

        for (int name_idx = 1; name_idx < input_name_str_array.length ; name_idx++) {
            System.out.print(input_name_str_array[name_idx].toLowerCase() + " ");
        }
        System.out.print(input_name_str_array[0].toLowerCase() + " ");
    }
}
