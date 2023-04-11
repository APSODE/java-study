package Chapter2;

public class Test3 {
    public static void main(String[] args) {
        int x = 10, y = 3, z = 2;
        z = ++x + ++y;
        System.out.println(
                "x = " + x + " y = " + y + " z = " + z
        );
    }
}
