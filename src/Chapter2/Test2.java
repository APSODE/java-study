package Chapter2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String name;
        String birth;
        int grade;
        int toeic_point;
        float sc_point;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        name = sc.nextLine();

        System.out.print("생년월일 : ");
        birth = sc.nextLine();

        System.out.print("학년 : ");
        grade = sc.nextInt();

        System.out.print("토익 성적 : ");
        toeic_point = sc.nextInt();

        System.out.print("평균 학점 : ");
        sc_point = sc.nextFloat();

        System.out.println(name + ", " + birth + ", " + grade + ", " + toeic_point + ", " + sc_point);
    }
}
