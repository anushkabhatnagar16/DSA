import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        int or = a|b;
        int and = a&b;

        System.out.println("sum = "+ sum);
        System.out.println("sub = "+ sub);
        System.out.println("div = "+ div);
        System.out.println("rem = "+ rem);
        System.out.println("or = "+ or);
        System.out.println("and = "+ and);
    }
}