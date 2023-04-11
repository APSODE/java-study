package Chapter2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //틀린 코드 수정하기
        String s = "abc"; //String s = 'abc';
        System.out.print(s);

        double d = 12.3;

        int f = (int) d; // int f = d;
        System.out.print(f);

        Scanner sc = new Scanner(System.in);
        double db = sc.nextDouble(); //double db = sc.next();
        System.out.print(db);

        sc.close();

        String ss = sc.next(); // String s = sc.next();
        System.out.print(ss); // System.out.print(s);
    }
}
