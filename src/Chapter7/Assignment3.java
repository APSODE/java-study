package Chapter7;

public class Assignment3 {
    public static void main(String[] args) {
        int first_number = 0, second_number = 1;
        System.out.print(first_number + " " + second_number + " ");
        while (true) {
            int result = first_number + second_number;
            if (result <= 5000) {
                System.out.print(result + " ");
                first_number = second_number;
                second_number = result;
            } else {
                break;
            }
        }
    }
}
