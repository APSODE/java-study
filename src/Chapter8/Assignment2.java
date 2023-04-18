package Chapter8;

public class Assignment2 {
    public static void main(String[] args) {
        int triangle_count = 0;
        for (int first_side = 1; first_side <= 100; first_side++) {
            for (int second_side = 1; second_side <= 100; second_side++) {
                for (int third_side = 1; third_side <= 100; third_side++) {
                    boolean triangle_check = Math.pow(third_side, 2) == Math.pow(second_side, 2) + Math.pow(first_side, 2);
                    if (triangle_check) {
                        System.out.println(first_side + " : " + second_side + " : " + third_side);
                        triangle_count++;
                    }
                }
            }
        }
        System.out.println("총 " + triangle_count + "개의 삼각형 존재.");
    }
}
