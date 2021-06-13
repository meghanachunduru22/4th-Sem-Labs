import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int lcm,gcd;
        if (max%min == 0){
            gcd = min;
            lcm = (a*b)/gcd;
            //System.out.println("GCD of two numbers is "+gcd);
            System.out.println("LCM of two numbers is "+lcm);
            return;
        }
        for(int i = min;i>0;i--){
            if(min%i==0 && max%i==0){
                gcd = i;
                lcm = (a*b)/gcd;
                //System.out.println("GCD of two numbers is "+gcd);
                System.out.println("LCM of two numbers is "+lcm);

                break;
            }
        }
    }
}
