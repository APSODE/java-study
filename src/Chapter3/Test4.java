package Chapter3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int x, y, quadrant;

        Scanner sc = new Scanner(System.in);

        System.out.print("x좌표를 입력하시오. : ");
        x = sc.nextInt();

        System.out.print("y좌표를 입력하시오. : ");
        y = sc.nextInt();

        quadrant = x > 0 ? (y > 0 ? 1 : 4) : ((y > 0 ? 2 : 3));

        System.out.println("좌표는 " + quadrant + "사분면입니다.");


    }
}
