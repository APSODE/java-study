package Chapter5;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        String  calc_type;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 <R, T, C> : ");
        calc_type = sc.next();

        if (calc_type.equals("R")) {
            int height, width;
            System.out.print("가로와 세로 ? : ");
            height = sc.nextInt();
            width = sc.nextInt();

            System.out.println("사각형 넓이 : " + height * width);

        } else if (calc_type.equals("T")) {
            double height, base;
            System.out.print("높이와 밑변 ? : ");
            height = sc.nextDouble();
            base = sc.nextDouble();

            System.out.println("삼각형 넓이 : " + height * base * 0.5);

        } else {
            double radius;
            System.out.print("반지름 ? : ");
            radius = sc.nextDouble();

            System.out.println("원의 넓이 : " + Math.pow(radius, 2) * Math.PI);

        }
    }
}
