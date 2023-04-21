import java.util.Scanner;
public class question_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The value of first number is ");
        int a=sc.nextInt();
        System.out.print("The value of second number is ");
        int b=sc.nextInt();
        int t;
        t=a;
        a=b;
        b=t;
        System.out.print("the swap of the two number is "+a+" "+b);
    }
    
}
