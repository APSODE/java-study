package Chapter5;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        char input_type;
        Scanner sc = new Scanner(System.in);

        System.out.print("문자를 입력하시오 <R / T / C> : ");
        input_type = sc.next().charAt(0);

        switch (input_type) {
            case 'R' -> {
                int height_r, width;
                System.out.print("가로와 세로 ? : ");
                height_r = sc.nextInt();
                width = sc.nextInt();
                System.out.println("사각형 넓이 : " + height_r * width);
            }
            case 'T' -> {
                double height_t, base;
                System.out.print("높이와 밑변 ? : ");
                height_t = sc.nextDouble();
                base = sc.nextDouble();
                System.out.println("삼각형 넓이 : " + height_t * base * 0.5);
            }
            case 'C' -> {
                double radius;
                System.out.print("반지름 ? : ");
                radius = sc.nextDouble();
                System.out.println("원의 넓이 : " + Math.pow(radius, 2) * Math.PI);
            }
            default -> {
            }
        }
    }
}
