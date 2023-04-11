package Chapter6;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        double a, b, c;
        double real_root_f, real_root_n;
        Scanner sc = new Scanner(System.in);
        System.out.print("이차 방정식의 계수를 입력하시오. : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        boolean real_root_exist_check = Math.pow(b, 2) - (4 * a * c) > 0;
        if (real_root_exist_check) {
            if (a == 0) {
                System.out.println("해당 방정식의 근은 : " + (-1 * (c / b)));
            } else {
                double check = Math.pow(b, 2) - (4 * a * c);

                real_root_f = ((b * -1) + Math.sqrt(check)) / (2*a);
                real_root_n = ((b * -1) - Math.sqrt(check)) / (2*a);
                System.out.println("해당 방정식의 근은 : " + real_root_f + ", " + real_root_n + "입니다.");
            }

        } else {
            System.out.println("실근이 존재하지 않습니다.");
        }



    }
}
