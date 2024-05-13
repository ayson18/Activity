import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;

        System.out.println("Enter integers to sum, type '0' to finish:");


        while ((input = scanner.nextInt()) != 0) {
            sum += input;
        }

        System.out.println("The sum is: " + sum);
    }
}
