package Chapter2;

import java.util.Scanner;

public class Literal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 0;
        System.out.print(x);

        float f = 12.3f;
        System.out.print(f);

        Scanner sc = new Scanner(System.in);
        double db = sc.nextDouble();
        sc = new Scanner(System.in); // Scanner 객체의 다중 생성 -> Scanner 객체는 한번만 생성하고 생성된 객체에서 재사용한다.
        String s = sc.nextLine();
    }
}
