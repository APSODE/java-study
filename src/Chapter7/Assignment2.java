package Chapter7;

public class Assignment2 {
    public static void main(String[] args) {
        int first_side = 1, triangle_count = 0;
        while (first_side <= 100) {
            int second_side = 0;
            while (second_side <= 100) {
                int third_side = 0;
                while (third_side <= 100) {
                    boolean triangle_check = Math.pow(third_side, 2) == Math.pow(second_side, 2) + Math.pow(first_side, 2);
                    boolean side_check = third_side > 0 && second_side > 0 && first_side > 0;
                    if (triangle_check && side_check) {
                        System.out.println(first_side + " : " + second_side + " : " + third_side);
                        triangle_count++;
                    }
                    third_side++;
                }
                second_side++;
            }
            first_side++;
        }
        System.out.println("총 " + triangle_count + "개의 삼각형 존재.");
    }
}
