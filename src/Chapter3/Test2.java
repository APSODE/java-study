package Chapter3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        double introduction_com, c_programming, english, common_math, ave;

        Scanner sc = new Scanner(System.in);

        System.out.print("컴퓨터 개론의 점수를 입력하시오. : ");
        introduction_com = sc.nextDouble();

        System.out.print("c프로그래밍의 점수를 입력하시오. : ");
        c_programming = sc.nextDouble();

        System.out.print("영어의 점수를 입력하시오. : ");
        english = sc.nextDouble();

        System.out.print("일반 수학의 점수를 입력하시오. : ");
        common_math = sc.nextDouble();

        ave = (introduction_com + c_programming + english + common_math) / 4;

        System.out.println("평균점수는 " + ave + "점입니다.");
    }
}
