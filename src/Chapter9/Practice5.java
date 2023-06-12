package Chapter9;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running_status = true;
        int[][] product_storage = new int[100][10];

        while (running_status) {
            System.out.println("==============================================");
            System.out.println("입고 (i)\n출고 (o)\n재고 (s)\n종료 (q)");
            System.out.println("==============================================");
            System.out.print("select menu ('i', 'o', 's' or 'q') : ");
            char selected_menu = sc.next().charAt(0);

            switch (selected_menu) {
                case ('i') -> {
                    System.out.print("물품 번호 (0 ~ 99)와 저장 위치(1 ~ 10)를 같이 입력하시오. : ");
                    int input_product_id = sc.nextInt();
                    int input_product_location = sc.nextInt() - 1;
                    product_storage[input_product_id][input_product_location]++;
                }

                case ('o') -> {
                    System.out.print("물품 번호 (0 ~ 99)와 저장 위치(1 ~ 10)를 같이 입력하시오. : ");
                    int input_product_id = sc.nextInt();
                    int input_product_location = sc.nextInt() - 1;
                    if (product_storage[input_product_id][input_product_location] - 1 >= 0) {
                        System.out.println(input_product_id + "번 물건을 " + (input_product_location + 1) + "번 저장 위치에서 출고 하였습니다.");
                        product_storage[input_product_id][input_product_location]--;
                    } else {
                        System.out.println(input_product_id + "번 물건은 " + (input_product_location + 1) + "번 저장 위치에 존재하지 않습니다.");
                    }
                }

                case ('s') -> {
                    for (int storage_row_idx = 0; storage_row_idx < product_storage.length; storage_row_idx++) {
                        System.out.println("물품 번호 " + storage_row_idx + "번의 재고상태");
                        StringBuilder storage_data_string = new StringBuilder();
                        for (int storage_column_idx = 0; storage_column_idx < product_storage[storage_row_idx].length; storage_column_idx++) {
                            int current_storage_product_amount = product_storage[storage_row_idx][storage_column_idx];
                            storage_data_string.append((storage_column_idx + 1) + "번 저장위치 : " + current_storage_product_amount + "개\n");
                        }
                        System.out.println(storage_data_string);
                        System.out.println();
                    }
                }

                case ('q') -> running_status = false;

                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
