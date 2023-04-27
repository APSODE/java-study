//2023년도 별찍기 기출 문제
package Midterm;

public class PreviousExamination {
    public static void main(String[] args) {
        int line_amount = 3;
        for (int line_num = 1; line_num <= line_amount; line_num++) {
            int star_amount = 2 * line_num - 1;
            int blank_amount1 = line_amount - line_num;
            int blank_amount2 = 2 * line_amount - star_amount;

            for (int blank = 0; blank < blank_amount1; blank++) {
                System.out.print(" ");
            }
            for (int star = 0; star < star_amount; star++) {
                System.out.print("*");
            }
            for (int blank = 0; blank < blank_amount2; blank++) {
                System.out.print(" ");
            }
            for (int star = 0; star < star_amount; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
