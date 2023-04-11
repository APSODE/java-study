package Chapter3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        final int hour = 3600, min = 60;
        int input_hour, input_min, input_sec, total_sec;
        Scanner sc = new Scanner(System.in);
        System.out.print("시간? <시> : ");
        input_hour = sc.nextInt();
        System.out.print("시간? <분> : ");
        input_min = sc.nextInt();
        System.out.print("시간? <초> : ");
        input_sec = sc.nextInt();
        total_sec = input_hour * hour + input_min * min + input_sec;
        System.out.println(input_hour + "시 " + input_min + "분 " + input_sec + "초는 " + total_sec + "초 입니다.");

    }
}
