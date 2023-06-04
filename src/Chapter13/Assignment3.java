package Chapter13;

public class Assignment3 {
    public static void main(String[] args) {
        Triangle testTriangle = new Triangle();
        testTriangle.setBase(4);
        testTriangle.setHeight(4);
        System.out.println("삼각형의 밑변 : " + testTriangle.getBase());
        System.out.println("삼각형의 높이 : " + testTriangle.getHeight());
        System.out.println("삼각형의 넓이 : " + testTriangle.getArea());

    }
}

class Triangle {
    private double base;
    private double height;

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

    public double getArea() {
        return (getBase() * getHeight()) / 2;
    }
}
