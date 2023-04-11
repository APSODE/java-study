package Chapter3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, width, length;
        System.out.print("높이? : ");
        height = sc.nextInt();
        System.out.print("너비? : ");
        width = sc.nextInt();
        System.out.print("길이? : ");
        length = sc.nextInt();

        System.out.println("상자의 체적은 " + height * width * length + "입니다.");
    }
}
