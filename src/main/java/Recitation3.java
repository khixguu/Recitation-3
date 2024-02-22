import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        Circle circle16 = new Circle(new Point(x,y), 16.0);
        Circle circle40 = new Circle(new Point(14,12), 40.0);
        System.out.println("Enter x:");
        System.out.println("Enter y:");

        if (circle40.intersects(circle16)) {
            System.out.println("Circles intersect!");
        }else
                System.out.println("Circles do not intersect!");
        }
        // add your code here
    }
