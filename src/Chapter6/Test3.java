package Chapter6;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        double input_num_1, input_num_2, result = 0;
        System.out.println("***************\n+---Add\n----Subtract\n*---Multiply\n/---Divide\nQ---Quit");
        System.out.print("연산을 선택하세요. : ");
        operator = sc.next().charAt(0);
        System.out.print("두 수를 공백으로 구분하여 입력하세요. : ");
        input_num_1 = sc.nextDouble();
        input_num_2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = input_num_1 + input_num_2;
            case '-' -> result = input_num_1 - input_num_2;
            case '*' -> result = input_num_1 * input_num_2;
            case '/' -> result = input_num_1 / input_num_2;
            case 'Q' -> {
            }
        }
        if (operator != 'Q') {
            System.out.println("결과 : " + result);
        }
    }
}
