package Chapter8;

import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        int[] randint_array = new int[10];
        Random rnd = new Random();
        for (int idx = 0; idx < randint_array.length; idx++) {
            int random_num = rnd.nextInt(100);
            randint_array[idx] = random_num;

        }

        for (int idx = 0; idx < randint_array.length; idx++) {
            System.out.print(randint_array[idx]);
        }
    }
}
