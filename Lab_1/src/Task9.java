import java.util.Scanner;

public class Task9 {
    public void GetNumberPowers(){
        long firstVar;
        long secondVar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your number A (up to 18): ");
        firstVar = scanner.nextInt();

        System.out.print("\nA^1: " + firstVar);
        secondVar = firstVar * firstVar;
        System.out.print("\nA^2: " + secondVar);
        firstVar *= secondVar;
        System.out.print("\nA^3: " + firstVar);
        firstVar *= secondVar;
        System.out.print("\nA^5: " + firstVar);
        secondVar = firstVar * firstVar;
        System.out.print("\nA^10: " + secondVar);
        secondVar *= firstVar;
        System.out.print("\nA^15: " + secondVar);
    }
}
