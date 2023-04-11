package Chapter6;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요! : ");
        String user_input_character = sc.next();
        String check_string = "AEIOUWYaeiouwy";

        int check = check_string.contains(user_input_character) ? 1 : 0;

        switch (check) {
           case 1 -> System.out.println("모음!");
           case 0 -> System.out.println("자음!");
        }

    }
}
