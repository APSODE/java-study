package Chapter3;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        double annual, deposit_money;
        Scanner sc = new Scanner(System.in);
        System.out.print("예금액? : ");
        deposit_money = sc.nextDouble();
        System.out.print("연이율? <%> : ");
        annual = sc.nextDouble();
        deposit_money *= (100 + annual) / 100;
        deposit_money *= (100 + annual) / 100;
        System.out.println("2년 후의 예금액은 " + deposit_money + "입니다.");

    }
}
