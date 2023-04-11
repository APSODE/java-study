package Chapter5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int user_birth_year, user_birth_month, user_birth_day, current_year, current_month, current_day;
        int user_age;

        Scanner sc = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();

        System.out.print("사용자의 생일을 입력하시오. : ");
        user_birth_year = sc.nextInt();
        user_birth_month = sc.nextInt();
        user_birth_day = sc.nextInt();

//        System.out.print("현재 날짜를 입력하시오. : ");
//        current_year = sc.nextInt();
//        current_month = sc.nextInt();
//        current_day = sc.nextInt();
        current_year = localDate.getYear();
        current_month = localDate.getMonthValue();
        current_day = localDate.getDayOfMonth();

        if (current_month >= user_birth_month && current_day >= user_birth_day) {
            user_age = current_year - user_birth_year;
        } else {
            user_age = current_year - user_birth_year - 1;
        }

        System.out.println("당신의 만나이는 " + user_age + "살 입니다.");
    }
}
