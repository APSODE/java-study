package Chapter13;


public class Assignment4 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(100);
        p1.setY(100);

        Point p2 = new Point();
        p2.setX(100);
        p2.setY(100);

        Rectangle r1 = new Rectangle();
        r1.setStartPoint(p1);
        r1.setWidth(5);
        r1.setHeight(5);

        Rectangle r2 = new Rectangle();
        r2.setStartPoint(p2);
        r2.setWidth(5);
        r2.setHeight(5);

        double r1_area = r1.getArea();
        double r2_area = r2.getArea();

        if (r1_area > r2_area) {
            System.out.println("첫 번째 사각형이 두 번째 사각형보다 면적이 넓습니다");
        } else if (r1_area < r2_area) {
            System.out.println("두 번째 사각형이 첫 번째 사각형보다 면적이 넓습니다");
        } else {
            System.out.println("첫 번째 사각형과 두 번째 사각형 면적이 동일합니다.");
        }

        Rectangle inter = r1.intersect(r2);
        if (inter == null) {
            System.out.println("겹치는 영역이 없습니다.");
        } else {
            System.out.println("(" + inter.getStartPoint().getX() + ", " + inter.getStartPoint().getY() + ") 에서 너비 " +
                    inter.getWidth() + ", 높이 " + inter.getHeight() + " 만큼 겹칩니다.");
        }
    }
}

class Point {
    private double x;
    private double y;


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
}

class Rectangle {
    private Point startPoint;
    private double width;
    private double height;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
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

    public double getArea() {
        return this.height * this.width;
    }

    private static Rectangle[] sortRects(Rectangle[] rectangles) {
        Point rect1 = rectangles[0].getStartPoint();
        Point rect2 = rectangles[1].getStartPoint();

        Rectangle[] sorted_rect_array;

        if (rect1.getX() - rect2.getX() < 0 || rect1.getY() - rect2.getY() < 0) {
            sorted_rect_array = new Rectangle[]{rectangles[0], rectangles[1]};
        } else {
            sorted_rect_array = new Rectangle[]{rectangles[1], rectangles[0]};
        }

        return sorted_rect_array;
    }

    private Point[] getRectPoints() {
        double[][] rect_point_array = {
                {this.startPoint.getX(), this.startPoint.getY()},  // p1 -> LEFT / UP
                {this.startPoint.getX() + this.width, this.startPoint.getY()},  // p2 -> RIGHT / UP
                {this.startPoint.getX(), this.startPoint.getY() + this.height}, // p3 -> LEFT / DOWN
                {this.startPoint.getX() + this.width, this.startPoint.getY() + this.height} // p4 -> RIGHT / DOWN
        };

        Point[] result_points = new Point[4];
        for (int point_idx = 0; point_idx < 4; point_idx++) {

            double[] point_data = rect_point_array[point_idx];

            Point pointObject = new Point();
            pointObject.setX(point_data[0]);
            pointObject.setY(point_data[1]);

            result_points[point_idx] = pointObject;
        }

        return result_points;
    }

    private static Rectangle createRectangle(Point point_UPLEFT, Point point_DOWNRIGHT) {
        Rectangle RT_RECTANGLE = new Rectangle();
        RT_RECTANGLE.setStartPoint(point_UPLEFT);
        RT_RECTANGLE.setWidth(point_DOWNRIGHT.getX() - point_UPLEFT.getX());
        RT_RECTANGLE.setHeight(point_DOWNRIGHT.getY() - point_UPLEFT.getY());

        return RT_RECTANGLE;
    }

    private static Rectangle overlapRect(Rectangle[] rectangles) {
        Point[] first_rect_points = rectangles[0].getRectPoints();
        Point[] second_rect_points = rectangles[1].getRectPoints();

        Rectangle RT_RECTANGLE = null;

        // check list 1 : r1_p1_x <= r2_p1_x < r1_p4_x && r1_p1_y <= r2_p1_y < r1_p4_y
        if (first_rect_points[0].getX() <= second_rect_points[0].getX() && second_rect_points[0].getX() < first_rect_points[3].getX()) {
            if (first_rect_points[0].getY() <= second_rect_points[0].getY() && second_rect_points[0].getY() < first_rect_points[3].getY()) {
                RT_RECTANGLE = createRectangle(first_rect_points[0], second_rect_points[3]);
            }
        }

        // check list 2 : r1_p3_x <= r2_p3_x < r1_p2_x && r1_p2_y < r2_p3_y <= r1_p3_y
        if (first_rect_points[2].getX() <= second_rect_points[2].getX() && second_rect_points[2].getX() < first_rect_points[1].getX()) {
            if (first_rect_points[1].getY() < second_rect_points[2].getY() && second_rect_points[2].getY() <= first_rect_points[2].getY()) {
                RT_RECTANGLE = createRectangle(first_rect_points[0], second_rect_points[3]);
            }
        }

        // check list 3 : r1_p1_x <= r2_p1_x < r1_p2_x && r1_p1_y == r2_p1_y == r1_p4_y
        if (first_rect_points[0].getX() <= second_rect_points[0].getX() && second_rect_points[0].getX() < first_rect_points[1].getX()) {
            if (first_rect_points[0].getY() == second_rect_points[0].getY() && second_rect_points[0].getY() == first_rect_points[3].getY()) {
                RT_RECTANGLE = createRectangle(first_rect_points[0], second_rect_points[3]);
            }
        }

        // check list 4 : r1_p1_x == r2_p1_x == r1_p4_x && r1_p1_y <= r2_p1_y < r1_p4_y
        if (first_rect_points[0].getX() == second_rect_points[0].getX() && second_rect_points[0].getX() == first_rect_points[1].getX()) {
            if (first_rect_points[0].getY() <= second_rect_points[0].getY() && second_rect_points[0].getY() < first_rect_points[3].getY()) {
                RT_RECTANGLE = createRectangle(first_rect_points[0], second_rect_points[3]);
            }
        }

        return RT_RECTANGLE;
    }

    public Rectangle intersect(Rectangle rectangle) {
        Rectangle[] sort_target_rects = new Rectangle[]{this, rectangle};
        Rectangle[] sorted_rects = sortRects(sort_target_rects);
        return Rectangle.overlapRect(sorted_rects);
    }
}
