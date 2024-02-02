package method.function;
import java.lang.Math;
import java.util.Scanner;
public class pytriples {
    public static void checktriples(int a, int b,int c){
        //(a+b>c && a+c>b && b+c>a) 
        a=(int) Math.pow(a,2);
        b=(int) Math.pow(b,2);
        c=(int) Math.pow(c,2);
        if (a+b>=c)
        System.out.println("The given numbers are Pythagorean triplets");
        else 
        System.out.println("The given numbers are not Pythagorean triplets");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        checktriples(a,b,c);
}
}
