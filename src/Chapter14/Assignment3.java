package Chapter14;

public class Assignment3 {
    public static void main(String[] args) {
        Triangle test1 = new Triangle();
        Triangle test2 = new Triangle(10, 10);
        Triangle test3 = new Triangle();

        Triangle[] test_list = {test1, test2};

        for (Triangle test_object : test_list) {
            String test_string = createObjectDataString(test_object);
            System.out.println(test_string);
        }

        test3.setBase(100);
        test3.setHeight(100);
        String test_string = createObjectDataString(test3);
        System.out.println(test_string);

    }

    public static String createObjectDataString(Triangle triangle) {
        String data_string = "";
        data_string += "삼각형의 밑변 : " + triangle.getBase() + "\n";
        data_string += "삼각형의 높이 : " + triangle.getHeight() + "\n";
        data_string += "삼각형의 면적 : " + triangle.getArea() + "\n";

        return data_string;
    }
}

class Triangle {
    private double base;
    private double height;

    public Triangle() {
        this.base = 4;
        this.height = 4;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (this.base * this.height) / 2;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
