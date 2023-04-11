package Chapter5;

public class Quiz1 {
    public static void main(String[] args) {
        int i = 1, result = 0;
        while (i <= 30) {
            result += Math.pow(i++, 2) + 1;
        }
        System.out.println("sigma result : " + result);
    }
}
