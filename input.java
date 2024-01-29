import java.util.Scanner;
public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Prime
        System.out.println("\n\n                 Prime Number Checker");
        int num;
        System.out.print("Enter a number to check if it is prime or not: ");
        num=sc.nextInt();
        if (prime.isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        //Palindrome
        System.out.println("\n\n                 Palindrome Checker");
        System.out.print("Enter the string to be checked for palindrome : ");
        String str1 = sc.nextLine();
        if (palindrome.isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }
        //Amstrong
        System.out.println("                Amstrong Number");
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();

        if (amstrong.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
           //Fibonacci
        fibo fibonacci = new fibo();
        System.out.println("                Fibonacci Sequence generator");
        System.out.print("Enter number of terms:");
        int n=sc.nextInt();
        fibonacci.fibonacci(n);

        //factorial
        factorial calculateFactorial = new factorial();
        System.out.println("\n\n            factorial");
        System.out.print("Enter a non-negative integer: ");
        int na =sc.nextInt();
        System.out.println("The factorial of "+na+" is "+calculateFactorial.calculateFactorial(na)); 
        
        //prime
        System.out.println("\n\n               Prime Numbers or not");
        System.out.print("Enter a non-negative integer: ");
        int N = sc.nextInt();
        if (prime.isPrime(N) == true)
        System.out.println(N + " is a prime number");
        else
        System.out.println(N + " is not a prime number");

        //sum of digits
        System.out.println("ENter the digit you want sumof");
        int sdd=sc.nextInt();
        sumofdigit obj2=new sumofdigit();
        System.out.println("Sum of digits in the entered number is :"+obj2.calculateSumOfDigits(sdd));
        
        sc.close();
    }

}
