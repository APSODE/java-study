package Chapter6;

public class Quiz2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 30; i++) {
            int j_r = 0;
            for (int j = 1; j <= 5; j++) {
                j_r += j;
            }
            sum += i * j_r;
        }
        System.out.println(sum);
    }
}
