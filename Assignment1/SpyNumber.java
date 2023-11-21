import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int product = 1;
        while (number != 0) {
            sum += number % 10;
            product *= number % 10;
            number /= 10;
        }
        if (product == sum) {
            System.out.println("Number is a spy number");
        } else {
            System.out.println("Number is not a spy number");
        }
        scanner.close();
    }
}
