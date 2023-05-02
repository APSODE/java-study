package Chapter9;


import java.util.Random;

public class Assignment5 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] random_number_array = new int[1000];
        int[] random_number_count = new int[20];
        int maximum = -1;
        int maximum_key = -1;

        for (int count = 0; count < 1000; count++) {
            int current_random_number = rnd.nextInt(20);
            random_number_array[count] = current_random_number;
            random_number_count[current_random_number]++;
        }
        for (int idx = 0; idx < 20; idx++) {
            System.out.println(idx + " : " + random_number_count[idx]);
            if (random_number_count[idx] > maximum) {
                maximum = random_number_count[idx];
                maximum_key = idx;
            }
        }
        System.out.println("최대 발생 수 : " + maximum_key);
    }
}
