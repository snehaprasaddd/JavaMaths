public class fibo {
    public void fibonacci(int n) {
    int a=0, b=1;
    System.out.print(a+" "+b+" " );
    for(int i=0; i<n;i++){
        int c = a+b;
        System.out.print(c + " ");
        a=b;
        b=c;
    }
}
}
