package Chapter3;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int input_number, thousand, hundred, ten, one;

        Scanner sc = new Scanner(System.in);

        System.out.print("원하는 정수를 입력하시오. : ");
        input_number = sc.nextInt();

        thousand = input_number / 1000;
        hundred = (input_number - (thousand * 1000)) / 100;
        ten = (input_number - (thousand * 1000 + hundred * 100)) / 10;
        one = (input_number - (thousand * 1000 + hundred * 100 + ten * 10));

        System.out.println("천의 자리 : " + thousand);
        System.out.println("백의 자리 : " + hundred);
        System.out.println("십의 자리 : " + ten);
        System.out.println("일의 자리 : " + one);
        
    }
}
