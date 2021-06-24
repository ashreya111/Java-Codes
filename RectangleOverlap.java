import java.util.Scanner;

public class RectangleOverlap {
    static class Point
    {
        int x, y;
    }
    static boolean doOverlap(Point l1, Point r1, Point l2, Point r2)
    {
        if(l1.x == r1.x || l1.y==r1.y || l2.x == r2.x || l2.y==r2.y)
        {

            return false;

        }
        if(l1.x>= r2.x || l2.x >= r1.x) {
            return false;
        }

        if(l1.y >= r2.y || l2.y >= r1.y) {
            return false;
        }

        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Point l1 = new Point();
        Point l2 = new Point();
        Point r1 = new Point();
        Point r2 = new Point();
        l1.x = sc.nextInt();
        l1.y = sc.nextInt();
        r1.x = sc.nextInt();
        r1.y = sc.nextInt();
        l2.x = sc.nextInt();
        l2.y = sc.nextInt();
        r2.x = sc.nextInt();
        r2.y = sc.nextInt();
        if (doOverlap(l1, r1, l2, r2)) {
            System.out.println("Rectangles Overlap");
        } else {
            System.out.println("Rectangles Don't Overlap");
        }
    }
}
