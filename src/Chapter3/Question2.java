package Chapter3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        final double pyeong = 3.3058;
        int input_pyeong;
        Scanner sc = new Scanner(System.in);
        System.out.print("평수? : ");
        input_pyeong = sc.nextInt();
        System.out.println(input_pyeong + "은 " + pyeong * input_pyeong + "평방미터 입니다.");
    }
}