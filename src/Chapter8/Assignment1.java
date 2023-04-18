package Chapter8;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int user_input_number = sc.nextInt();
        int multiple_base = 3;


        if (user_input_number <= 0) {
            System.out.println("입력할 정수의 값은 0보다 커야 합니다.");
        } else {
            for (int multiple_number = 1; multiple_number <= user_input_number / multiple_base; multiple_number++){
                int multiple_result = multiple_base * multiple_number;
                System.out.println("[" + multiple_result + "]");
            }
        }
    }
}
