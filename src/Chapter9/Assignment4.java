package Chapter9;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] input_number_array = new double[30];
        int amount = 0;
        double average_temp = 0;
        double standard_deviation_temp = 0;
        int index = 0;
        while (true) {
            System.out.print("값 : ");
            double current_input_number = sc.nextDouble();
            input_number_array[index++] = current_input_number;
            average_temp += current_input_number;
            amount++;
            System.out.print("\n다음 ? : ");
            if (!(sc.next().charAt(0) == 'y')) {
                break;
            }
        }
        average_temp /= amount;
        for (int idx = 0; idx < amount; idx++) {
            standard_deviation_temp += Math.pow(input_number_array[idx] - average_temp, 2);
        }
        standard_deviation_temp /= amount;

        System.out.println("평균 : " + average_temp);
        System.out.println("표준 편차 : " + Math.sqrt(standard_deviation_temp));
    }
}
