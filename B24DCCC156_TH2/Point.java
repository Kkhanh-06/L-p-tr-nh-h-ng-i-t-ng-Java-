import java.util.Scanner;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public static boolean isTriangle(Point a, Point b, Point c) {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        return ab + bc > ca && ab + ca > bc && bc + ca > ab;
    }

    public static double perimeter(Point a, Point b, Point c) {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            if (Point.isTriangle(p1, p2, p3)) {
                System.out.printf("%.3f\n", Point.perimeter(p1, p2, p3));
            } else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}
