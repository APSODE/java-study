package Chapter7;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int user_input_number = sc.nextInt();
        int multiple_number = 1;
        int multiple_base = 3;

        while (user_input_number > 0) {
            int multiple_result = multiple_base * multiple_number++;
            if (multiple_result <= user_input_number) {
                System.out.println("[" + multiple_result + "]");
            } else {
                break;
            }
        }
        if (user_input_number <= 0) {
            System.out.println("입력할 정수의 값은 0보다 커야 합니다.");
        }
    }
}
