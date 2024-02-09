package array;
import java.util.*;
public class simpleInputArray{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of elments");
    int n =sc.nextInt();
    int [] array= new int[n];
    for (int i=0; i<n;i++){
        System.out.println("Enter element "+(i+1));
        array[i]=sc.nextInt();
    }
    for (int i=0; i<n;i++){
    System.out.print(array[i]);
    }
    }
}