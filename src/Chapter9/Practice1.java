package Chapter9;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running_status = true;
        int[] product_storage = new int[100];

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
                    int input_product_location = sc.nextInt();
                    product_storage[input_product_id] = input_product_location;
                }
                case ('o') -> {
                    System.out.print("물품 번호 (0 ~ 99)와 저장 위치(1 ~ 10)를 같이 입력하시오. : ");
                    int input_product_id = sc.nextInt();
                    int input_product_location = sc.nextInt();
                    if (product_storage[input_product_id] != 0) {
                        System.out.println(input_product_id + "번 물건을 " + input_product_location + "번 저장 위치에서 출고 하였습니다.");
                        product_storage[input_product_id] = 0;
                    } else {
                        System.out.println(input_product_id + "번 물건은 " + input_product_location + "번 저장 위치에 존재하지 않습니다.");
                    }
                }
                case ('s') -> {
                    int[] product_amount = new int[10];
                    for (int stroage_idx : product_storage) {
                        if (stroage_idx != 0) {
                            product_amount[stroage_idx - 1]++;
                        }
                    }

                    for (int idx = 0; idx < product_amount.length; idx++) {
                        System.out.println("위치 " + (idx + 1) + " : " + product_amount[idx]);
                    }
                }
                case ('q') -> running_status = false;
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
