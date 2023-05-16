package Chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Map<Character, Character> encryption_map = new HashMap<>();
        Map<Character, Character> decryption_map = new HashMap<>();
        char[] key_array = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] value_array = "efghijklmnopqrstuvwxyzabcd".toCharArray();
        encryption_map.put(' ', ' ');
        decryption_map.put(' ', ' ');
        for (int idx = 0; idx < key_array.length; idx++) {
            encryption_map.put(key_array[idx], value_array[idx]);
            decryption_map.put(value_array[idx], key_array[idx]);
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 암호화");
            System.out.println("2. 복호화");
            System.out.println("3. 종료");

            int selected_menu = sc.nextInt();
            sc.nextLine(); // 버퍼 에러 해결용

            if (selected_menu == 1) {
                System.out.print("평문을 입력하시오. : ");
                String input_string = sc.nextLine();
                char[] input_string_array = input_string.toCharArray();
                for (char string_char : input_string_array) {
                    System.out.print(encryption_map.get(string_char));
                }
                System.out.println();
            } else if (selected_menu == 2) {
                System.out.print("암호문을 입력하시오. : ");
                String input_string = sc.nextLine();
                char[] input_string_array = input_string.toCharArray();
                for (char string_char : input_string_array) {
                    System.out.print(decryption_map.get(string_char));
                }
                System.out.println();
            } else if (selected_menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 입력입니다. 다시 입력하십시오.");
            }
        }
    }
}
