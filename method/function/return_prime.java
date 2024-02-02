package method.function;

import java.util.Scanner;
public class return_prime{
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = sc.nextInt();

        System.out.print("Enter the end number: ");
        int end = sc.nextInt();

        if (start < 0) {
            System.out.println("Start number must be positive.");
            return;
        }

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.println(num + ": is prime");
            } else {
                System.out.println(num + ": not prime");
            }
        }
    }
}
