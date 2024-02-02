package method.function;
import java.util.Scanner;
public class odd_even {
    public static void oddOrEven(int a){
        if(a%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter");
        int a= sc.nextInt();
        oddOrEven(a);
    }
}
