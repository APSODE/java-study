package Midterm;

import java.util.Scanner;

public class ExamPrepare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line_amount = sc.nextInt();

        for (int line_num = 1; line_num <= line_amount; line_num++) {
            int star_amount = 2 * line_num - 1;
            int blank_amount = line_amount - line_num;
            for (int blank = 0; blank < blank_amount; blank++) {
                System.out.print(" ");
            }
            for (int star = 0; star < star_amount; star++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
