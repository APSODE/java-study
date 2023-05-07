package Chapter9;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running_status = true;
        int game_turn = 1;
        char[][] tic_tac_toe = new char[3][3];

        while (running_status) {
            // 게임판 데이터 표시용
            showGameTable(tic_tac_toe);

            // 우승자 확인
            boolean winner_is_black = isWinner('X', tic_tac_toe);
            boolean winner_is_white = isWinner('O', tic_tac_toe);

            // tic_tac_toe 배열에 빈칸이 존재하는지 확인 -> 빈칸이 있는 경우 false, 없는 경우 true여야 하므로 !를 사용함
            boolean blank_check = !(remainBlankCheck(tic_tac_toe));

            // 게임 중지 확인
            boolean game_stop_check = winner_is_black || winner_is_white || blank_check;
            if (game_stop_check) {
                // 흑과 백 둘중 하나의 승리인 경우
                if (winner_is_white || winner_is_black) {
                    if (winner_is_white) {
                        System.out.println("백의 승리입니다!");
                    } else {
                        System.out.println("흑의 승리입니다.");
                    }


                    // 승부를 결정지을수 없는 상태에서 게임판에 빈칸이 존재하지 않는 경우
                } else if (blank_check) {
                    System.out.println("흑과 백의 무승부입니다!");
                }
                running_status = false;

            // 게임의 속행이 가능한 경우
            } else {
                // 누구의 턴인지 확인하는 변수
                char current_turn_user = game_turn++ % 2 == 0 ? '흑' : '백';
                System.out.print(current_turn_user + "의 차례입니다. 놓을 위치의 행 번호와 열번호를 입력하세요. (예 : 0 1) : ");

                int row = sc.nextInt();
                int column = sc.nextInt();

                // 입력 받은 row와 column의 값이 게임판의 범위를 벗어나는 경우
                if (row >= 3 || column >= 3 || row <= -1 || column <= -1) {
                    System.out.println("(" + row + ", " + column + ")은 입력 가능한 값을 벗어났습니다. 다시 입력하여주십시오.");

                    // 턴 확인에서 이미 증가된 값 1 감소
                    game_turn--;

                    continue;
                }

                // 해당 칸이 빈칸인지 확인하는 변수
                boolean isEmpty = tic_tac_toe[row][column] == '\u0000';

                //빈칸인 경우에만 게임 데이터 입력
                if (isEmpty) {
                    tic_tac_toe[row][column] = current_turn_user == '흑' ? 'X' : 'O';
                } else {
                    System.out.println("(" + row + ", " + column + ")는 빈칸이 아닙니다. 다시 입력하여 주십시오.");
                    // 턴 확인에서 이미 증가된 값 1 감소
                    game_turn--;
                }
            }
        }
    }

    private static void showGameTable(char[][] ttt_table) {
        for (char[] ttt_row : ttt_table) {
            for (char ttt_data : ttt_row) {
                System.out.print((ttt_data == '\u0000' ? "□" : ttt_data) + " ");
            }
            System.out.println();
        }
    }

    private static boolean remainBlankCheck(char[][] ttt_table) {
        boolean check_result = false;

        int blank_amount = 0;
        for (char[] ttt_row : ttt_table) {
            for (char ttt_data : ttt_row) {
                if (ttt_data == '\u0000') {
                    blank_amount++;
                }
            }
        }

        if (blank_amount == 0) {
            System.out.println("빈칸이 존재하지 않습니다.");

        } else {
            check_result = true;
        }

        return check_result;
    }

    private static boolean isWinner(char user_character, char[][] ttt_table) {
        boolean check_result = false;

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

        // 게임 데이터 확인
        for (int[][] check_data : ttt_check_array) {
            // 확인 대상 게임 데이터 값 저장용 변수
            char[] ttt_game_data = new char[3];

            // 확인 대상 게임 데이터 값 저장을 위한 인덱스 변수 | 0 ~ 2의 범위를 가짐
            int ttt_game_data_idx = 0;

            // 확인대상 게임 데이터 값 추출
            for (int[] ttt_table_position : check_data) {
                ttt_game_data[ttt_game_data_idx++] = ttt_table[ttt_table_position[0]][ttt_table_position[1]];
            }

            // 확인 조건에 해당하는 게임 데이터가 모두 O또는 X로 이루어진 경우를 확인
            boolean isAllTheSame = ttt_game_data[0] == ttt_game_data[1] && ttt_game_data[1] == ttt_game_data[2] && (ttt_game_data[0] == 'O' || ttt_game_data[0] == 'X');

            // 입력으로 받은 승리 판정 확인 대상과 같다면 check_result를 true로 변경
            if (isAllTheSame && ttt_game_data[0] == user_character) {
                check_result = true;
            }
        }


        return check_result;
    }
}
