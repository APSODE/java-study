package Chapter3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        double x, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("x의 값을 입력하시오. : ");
        x = sc.nextDouble();

        result = (5 * (Math.pow(x, 3))) + (6 * (Math.pow(x, 2))) - (8 * x) + 2;

        System.out.println("값은 : " + result + "입니다.");
    }
}
