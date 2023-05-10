package Chapter9;

import java.util.Scanner;

public class Practice3_no_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running_status = true;
        int game_turn = 1;
        // 백 : 'O'    흑 : 'X'
        char[] player_characters = {'O', 'X'};
        char[][] tic_tac_toe = new char[3][3];

        // tic_tac_toe 배열 기준으로 승리가능한 조건 확인용 인덱스 배열
        int[][][] ttt_check_array = {
                // 가로 세칸 확인 -> 3가지 경우의 수
                {{0, 0}, {0, 1}, {0, 2}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{2, 0}, {2, 1}, {2, 2}},

                // 세로 세칸 확인 -> 3가지 경우의 수
                {{0, 0}, {1, 0}, {2, 0}},
                {{0, 1}, {1, 1}, {2, 1}},
                {{0, 2}, {1, 2}, {2, 2}},

                // 대각선 세칸 확인 -> 2가지 경우의 수
                {{0, 0}, {1, 1}, {2, 2}},
                {{0, 2}, {1, 1}, {2, 0}}
        };

        while (running_status) {
            // 줄바꿈 한번하는 것으로 가독성 높이기
            System.out.println();

            // 현재의 게임판을 보여주는 코드 & 빈칸 갯수를 세는 코드
            int blank_amount = 0;
            for (char[] ttt_row : tic_tac_toe) {
                for (char ttt_data : ttt_row) {
                    // ttt_data가 char array의 기본값과 동일하다면 blank_amount에 1을 더함
                    if (ttt_data == '\u0000') {
                        blank_amount++;
                    }
                    // 게임판 현황을 보기 위해 ttt_data의 값을 출력
                    System.out.print((ttt_data == '\u0000' ? "□" : ttt_data) + " ");
                }
                System.out.println();
            }
            // 빈칸의 갯수가 0이면 blank_check가 false가 됨
            boolean blank_check = blank_amount > 0;

            // 승리 유저 확인
            boolean white_is_winner = false;
            boolean black_is_winner = false;

            for (int user_char_idx = 0; user_char_idx < 2; user_char_idx++) {
                for (int[][] check_data : ttt_check_array) {
                    char[] ttt_game_data = new char[3];
                    int ttt_game_data_idx = 0;

                    for (int[] ttt_table_posiotion : check_data) {
                        ttt_game_data[ttt_game_data_idx++] = tic_tac_toe[ttt_table_posiotion[0]][ttt_table_posiotion[1]];
                    }

                    boolean isAllTheSame = ttt_game_data[0] == ttt_game_data[1] && ttt_game_data[1] == ttt_game_data[2] && (ttt_game_data[0] == 'O' || ttt_game_data[0] == 'X');

                    if (isAllTheSame) {
                        if (user_char_idx == 0) {
                            white_is_winner = true;
                        } else {
                            black_is_winner = true;
                        }
                        // 승리를 확인하면 더 이상의 비교가 필요없으므로 break를 통해 빠져나온다.
                        break;
                    }
                }

                // 백 또는 흑의 승리가 확인되면 다른 말은 확인할 필요가 없으므로 break를 통해 빠져나온다.
                if (white_is_winner || black_is_winner) {
                    break;
                }
            }

            // 승리 유저 출력 코드 & 게임 속행 여부 확인
            boolean game_stop_check = white_is_winner || black_is_winner || !blank_check;
            if (game_stop_check) {
                // white_is_winner, black_is_winner 둘 중 하나가 true일 경우 작동
                if (white_is_winner || black_is_winner) {
                    if (white_is_winner) {
                        System.out.println("백의 승리입니다!");
                    } else {
                        System.out.println("흑의 승리입니다!");
                    }

                    // white_is_winner, black_is_winner 모두가 false, !blank_check가 true일 경우 무승부
                } else {
                    System.out.println("흑과 백의 무승부입니다!");
                }
                running_status = false;

            // 게임의 속행이 가능한 경우
            } else {
                // 현재 턴의 유저 문자
                char current_user_character = player_characters[game_turn % 2 == 0 ? 1 : 0];
                char current_user_name = game_turn++ % 2 == 0 ? '흑' : '백';

                System.out.print(current_user_name + "의 차례입니다. 놓을 위치의 행 번호와 열 번호를 입력하세요. (예 : 1 0) : ");
                int row = sc.nextInt();
                int column = sc.nextInt();

                // 입력받은 row, column의 값이 알맞은 범위인지 확인하는 코드
                boolean row_boundary_check = 0 <= row && row <= 2;
                boolean column_boundary_check = 0 <= column && column <= 2;

                if (row_boundary_check && column_boundary_check) {
                    boolean is_blank = tic_tac_toe[row][column] == '\u0000';
                    if (is_blank) {
                        tic_tac_toe[row][column] = current_user_character;

                    } else {
                        System.out.println("해당 칸은 이미 사용되었습니다.");
                        game_turn--;
                    }
                } else {
                    System.out.println("(" + row + ", " + column + ")은 입력 가능한 값의 범위를 벗어났습니다. 다시 입력하여주십시오.");
                    game_turn--;
                }
            }
        }
    }
}
