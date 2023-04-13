package Chapter7;

public class Practice4 {
    public static void main(String[] args) {
        for(int star_line = 0; star_line < 4; star_line++){
            for(int blank = 0; blank < 3 - star_line; blank++){
                System.out.print(" ");
            }
            for(int star = 0; star < 2 * star_line + 1; star++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
