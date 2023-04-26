package Midterm;

import java.util.Scanner;

public class ExamPrepare5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line_amount = sc.nextInt();

        for (int line_num = line_amount; line_num >= 1; line_num--) {
            int first_star_amount = 2 * line_num - 1;
            int blank_amount = line_amount - line_num;

            for (int blank = 0; blank < blank_amount; blank++) {
                System.out.print(" ");
            }

            for (int star = 0; star < first_star_amount; star++) {
                System.out.print("*");
            }

            System.out.print(" ");

            int second_star_amount = 2 * line_amount - first_star_amount;

            for (int star = 0; star < second_star_amount; star++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int line_num = 2; line_num <= line_amount; line_num++) {
            int first_star_amount = 2 * line_num - 1;
            int blank_amount = line_amount - line_num;

            for (int blank = 0; blank < blank_amount; blank++) {
                System.out.print(" ");
            }

            for (int star = 0; star < first_star_amount; star++) {
                System.out.print("*");
            }

            System.out.print(" ");

            int second_star_amount = 2 * line_amount - first_star_amount;

            for (int star = 0; star < second_star_amount; star++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
