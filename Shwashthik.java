import java.util.Scanner;

public class Main {
    public static void printPattern(int n) {
        // code for shwashthik chinnh (pattern)
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Condition to print '*' at specific positions
                if (i == mid || j == mid || i == 0 && j <= mid || j == 0 && i >= mid || i == n - 1 && j >= mid || j == n - 1 && i <= mid) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
    }
}
