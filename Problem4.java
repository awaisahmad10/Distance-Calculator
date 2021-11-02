import java.util.Scanner;

public class Problem4 {
    public static void main(String [] args){
        double x1, y1, x2, y2;
        double distance;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the coordinates of the first point " + "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        double distanceX = Math.pow((x1 - x2),2);
        double distanceY = Math.pow((y1 - y2), 2);
        distance = Math.sqrt(distanceX + distanceY);
        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
    }
}
