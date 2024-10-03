import java.util.Scanner;

public class Task19 {
    public void GetSquare(){
        double firstSide;
        double secondSide;
        double thirdSide;
        double fourthSide;
        double diagonal;

        double firstHalfPerimeter;
        double secondHalfPerimeter;

        double firstSquare;
        double secondSquare;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first side: ");
        firstSide = scanner.nextInt();
        System.out.print("Input second side: ");
        secondSide = scanner.nextInt();
        System.out.print("Input third side: ");
        thirdSide = scanner.nextInt();
        System.out.print("Input fourth side: ");
        fourthSide = scanner.nextInt();
        System.out.print("Input diagonal: ");
        diagonal = scanner.nextInt();

        firstHalfPerimeter = (firstSide + secondSide + diagonal) / 2;
        secondHalfPerimeter = (thirdSide + fourthSide + diagonal) / 2;

        firstSquare = Math.sqrt(firstHalfPerimeter * (firstHalfPerimeter - firstSide) *
                (firstHalfPerimeter - secondSide) * (firstHalfPerimeter - diagonal));
        secondSquare = Math.sqrt(secondHalfPerimeter * (secondHalfPerimeter - thirdSide) *
                (secondHalfPerimeter - fourthSide) * (secondHalfPerimeter - diagonal));

        System.out.print("\nSquare of your figure: " + (firstSquare + secondSquare));
    }
}
