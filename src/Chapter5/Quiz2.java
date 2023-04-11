package Chapter5;

public class Quiz2 {
    public static void main(String[] args) {
        int j = 1, i = 10, j_r = 0, result = 0;
        while (i <= 30) {
            while (j <= 5) {
                j_r += j++;
            }
            result += i++ * j_r;
        }
        System.out.println("sigma result : " + result);
    }
}
