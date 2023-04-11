package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("가위 (0)  바위 (1) 보 (2) 를 선택하세요. : " );

        int random_number = rnd.nextInt(3);
        int user_number = sc.nextInt();

        if ((user_number == 0 && random_number == 2) || (user_number == 1 && random_number == 0) || (user_number == 2 && random_number == 1)) {
            System.out.println("유저가 승리!\nuser : " + user_number + "  com : " + random_number);
        } else if ((user_number == 0 && random_number == 1) || (user_number == 1 && random_number == 2) || (user_number == 2 && random_number == 0)) {
            System.out.println("유저가 패배!\nuser : " + user_number + "  com : " + random_number);
        } else {
            System.out.println("무승부!\nuser : " + user_number + "  com : " + random_number);
        }
    }
}
