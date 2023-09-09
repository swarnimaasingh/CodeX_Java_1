import java.util.Scanner;

public class TableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int number = scanner.nextInt();
        int i = 1;
        while (i != 11) {
            System.out.println(number + " X " + i + " = " + (i * number));
            i++;
        }
        scanner.close();
    }
}