package method.function;
import java.util.Scanner;
public class max_min {
    public static void max(int a, int b, int c){
        int max= Math.max(Math.max(a,b),c);
        System.out.println("Max is:"+max);
    }
    public static void min(int a, int b, int c){
        int min= Math.min(Math.min(a,b),c);
        System.out.println("Min is:"+min);
    }
    public static void main(String[] args) {
       System.out.println("enter 3 number:");
       Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();
       int b= sc.nextInt();
       int c= sc.nextInt();
       max(a, b, c);
       min(a, b, c);
    }
}