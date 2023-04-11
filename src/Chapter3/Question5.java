package Chapter3;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        double a, b, c, answer_n, answer_p;
        Scanner sc = new Scanner(System.in);
        System.out.println("ax^2 + bx + c");
        System.out.print("a? : ");
        a = sc.nextDouble();
        System.out.print("b? : ");
        b = sc.nextDouble();
        System.out.print("c? : ");
        c = sc.nextDouble();

        double a1 = Math.pow(b, 2) - (4 * a * c);
        answer_p = ((b * -1) + Math.sqrt(a1)) / (2*a);
        answer_n = ((b * -1) - Math.sqrt(a1)) / (2*a);

        System.out.println("이차방정식의 근은 " + answer_p + "또는 " + answer_n + "입니다.");
    }
}
