import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if (max%min == 0){
            System.out.println("GCD of two numbers is "+min);
            return;
        }
        for(int i = min;i>0;i--){
            if(min%i==0 && max%i==0){
                System.out.println("GCD of two numbers is "+i);
                break;
            }
        }
    }
}
