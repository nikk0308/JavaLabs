import java.util.Scanner;

public class Task1 {
    public void PrintAverageOfThreeNums(){
        int firstNum;
        int secondNum;
        int thirdNum;
        double averageNum;
        int closestToAverageNum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        firstNum = scanner.nextInt();
        System.out.print("Input second number: ");
        secondNum = scanner.nextInt();
        System.out.print("Input third number: ");
        thirdNum = scanner.nextInt();

        averageNum = (firstNum + secondNum + thirdNum) / 3.0;
        closestToAverageNum = ((averageNum - (int) averageNum) < 0.5) ?
                ((int) averageNum) : ((int) averageNum + 1);
        System.out.print("\nAverage of numbers: " + averageNum);
        System.out.print("\nClosest to average: " + closestToAverageNum);
    }
}
