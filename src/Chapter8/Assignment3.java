package Chapter8;

public class Assignment3 {
    public static void main(String[] args) {
        int first_number = 0, second_number = 1;
        System.out.print(first_number + " " + second_number + " ");
        for(int idx = 0; idx < 18; idx++){
            int result = first_number + second_number;

            System.out.print(result + " ");
            first_number = second_number;
            second_number = result;

        }

    }
}
