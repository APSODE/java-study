package Chapter5;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int user_income;
        double tax;

        Scanner sc = new Scanner(System.in);
        System.out.print("소득 ? : ");
        user_income = sc.nextInt();

        if (user_income > 8000) {
            tax = user_income * 0.35;

        } else if (user_income > 4000) {
            tax = user_income * 0.26;

        } else if (user_income > 1000) {
            tax = user_income * 0.17;

        } else {
            tax = user_income * 0.08;

        }
        System.out.println("소득세는 " + tax + "만원 입니다.");
    }
}
