package Chapter9;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int[] day_per_month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int user_input_month = sc.nextInt();
        System.out.println(user_input_month + "월은 " + day_per_month[user_input_month - 1] + "일까지 있습니다.");
    }
}
