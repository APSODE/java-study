package Chapter5;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int num1, num2, num3, min, temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("3개 정수? : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        temp = num1;

        if (num2 <= temp) {
            temp = num2;
        }

        if (num3 <= temp) {
            temp = num3;
        }

        min = temp;
        System.out.println("가장 작은 값 : " + min);




    }
}
