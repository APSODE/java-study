package Chapter5;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        double height, weight, std_weight;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.print("키 ? : ");
        height = sc.nextDouble();
        System.out.print("몸무게 ? : ");
        weight = sc.nextDouble();
        std_weight = (height - 100) * 0.9;
        if (((weight / std_weight) * 100) > 105) {
            result = "과체중";
        } else if (((weight / std_weight) * 100) <= 105 && ((weight / std_weight) * 100) >= 95) {
            result = "표준 체중";
        } else {
            result = "저체중";
        }

        System.out.println("알림> " + result + "입니다.");
    }
}
