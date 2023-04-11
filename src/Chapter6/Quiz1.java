package Chapter6;

public class Quiz1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            sum += Math.pow(i, 2) + 1;
        }
        System.out.println(sum);
    }
}
