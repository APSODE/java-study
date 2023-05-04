package Chapter9;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running_status = true;
        int[][] reservation_seat = new int[10][8];

        while (running_status) {
            int available_seat_amount = 0;
            for (int[] reservation_seat_r : reservation_seat) {
                for (int reservation_seat_c : reservation_seat_r) {
                    System.out.print(reservation_seat_c + " ");
                    available_seat_amount += reservation_seat_c == 0 ? 1 : 0;
                }
                System.out.println();
            }

            if (available_seat_amount == 0) {
                System.out.println("예약가능한 좌석이 존재하지 않습니다.");
                running_status = false;
            }

            System.out.print("예약을 원하는 좌석의 번호를 입력하세요, ((1 ~ 10) (1 ~ 8)) : ");
            int seat_row = sc.nextInt() - 1;
            int seat_col = sc.nextInt() - 1;

            if (seat_col < 0 || seat_row < 0) {
                System.out.println("좌석 번호에는 음수가 들어갈 수 없습니다.");
                continue;

            }

            if (seat_row >= 10 || seat_col >= 8) {
                System.out.println("범위를 넘어가는 좌석번호입니다. 올바른 번호를 입력해주세요.");
                continue;
            }

            boolean is_available_seat = reservation_seat[seat_row][seat_col] == 0;

            if (is_available_seat) {
                System.out.println(seat_row + "번의 좌석 예약에 성공하였습니다.");
                reservation_seat[seat_row][seat_col] = 1;


            } else {
                System.out.println(seat_row + "번 좌석은 이미 예약된 좌석이므로 좌석 예약에 실패하였습니다.");
            }

            System.out.print("예약을 계속 하시겠습니까? (y / n) : ");
            char input_continue_cmd = sc.next().charAt(0);

            if (input_continue_cmd == 'n') {
                running_status = false;
            }
        }
    }
}
