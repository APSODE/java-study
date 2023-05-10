package Chapter10;

public class Assignment1 {
    public static void main(String[] args) {
        int[][] table = {
                {12, 56, 32, 16, 98},
                {99, 56, 34, 41, 3},
                {65, 3, 87, 78, 21}
        };

        for (int row_idx = 0; row_idx < table.length; row_idx++) {
            int row_sum = 0;
            for (int row_data : table[row_idx]) {
                row_sum += row_data;
            }
            System.out.println((row_idx + 1) + "번째 행의 합계 : " + row_sum);
        }
        for (int column_idx = 0; column_idx < table[0].length; column_idx++) {
            int column_sum = 0;

            for (int row_idx = 0; row_idx < table.length; row_idx++) {
                column_sum += table[row_idx][column_idx];
            }

            System.out.println((column_idx + 1) + "번쨰 행의 합계 : " + column_sum);
        }

    }
}
