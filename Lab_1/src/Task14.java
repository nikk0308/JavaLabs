import java.util.Scanner;

public class Task14 {
    public void TriangleTask(){
        double a;
        double b;
        double c;
        double h;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input leg a of triangle: ");
        a = scanner.nextInt();
        System.out.print("Input leg b of triangle: ");
        b = scanner.nextInt();

        c = Math.sqrt(a*a + b*b);
        h = a * b / c;

        System.out.print("\nHypotenuse of triangle: " + c);
        System.out.print("\nAltitude of triangle: " + h);
    }
}
