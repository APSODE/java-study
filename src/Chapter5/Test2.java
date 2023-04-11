package Chapter5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int amount, cost;
        Scanner sc = new Scanner(System.in);
        System.out.print("물건 개수 ? : ");
        amount = sc.nextInt();
        cost = amount * 100;

        if (amount >= 10) {
            cost *= 0.9;
        }
        System.out.println("물건의 전체 가격 : " + cost);
    }
}
