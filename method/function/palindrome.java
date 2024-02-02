package method.function;

public class palindrome {
    public static void pali(int a){
        int dummy=a;
        int rev =0;
        while (dummy>0) {
            int digit=dummy%10;
            System.out.println(digit);
        }
    }
    public static void main(String[] args) {
        int a=234;
        pali(a);
    }
}
