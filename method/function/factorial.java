package method.function;

public class factorial {
   public static void fact(int a){
    int result=1;
    if (a<0)
    System.out.println("No factorial");
    if (a==0 || a==1)
    System.out.println("1");
    else
    for(int i=1; i<a;i++){
        result*=i;
    }
    System.out.println(result);
   } 
   public static void main(String[] args) {
    int a=5;
    fact(a);
   }
}
