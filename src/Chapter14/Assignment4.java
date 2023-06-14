package Chapter14;

public class Assignment4 {
    public static void main(String[] args) {
        Rectangle firstRect = new Rectangle(5, 6);
        System.out.println("Area of Rectangle 1 : " + firstRect.getArea());
        Rectangle secondRect = new Rectangle();
        System.out.println("Area of Rectangle 2 : " + secondRect.getArea());
        Rectangle thirdRect = new Rectangle(new Point(3, 3), 5, 6);
        System.out.println("Area of Rectangle 3 : " + thirdRect.getArea());
        System.out.println("Total Number of Objects : " + Rectangle.rectCount);

    }
}

class Rectangle {
    public static int rectCount;

    private double width;
    private double height;
    private Point start_point;

    public Rectangle() {
        this.width = 10;
        this.height = 10;
        this.start_point = new Point();
        rectCount++;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.start_point = new Point();
        rectCount++;
    }

    public Rectangle(Point custom_start_point, double width, double height) {
        this.width = width;
        this.height = height;
        this.start_point = custom_start_point;
        rectCount++;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Point getStartPoint() {
        return start_point;
    }

    public void setStartPoint(Point start_point) {
        this.start_point = start_point;
    }
}

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "시작점 데이터\n  x 좌표" + this.x + "\n  y 좌표 : " + this.y + "\n";
    }
}

