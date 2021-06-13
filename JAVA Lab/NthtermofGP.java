import java.util.Scanner;

class NthtermofGP{

    public static int nth(int a,int r,int n) {
        int x = a*(int)(Math.pow(r, n-1));
        return x;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
       
        System.out.println("Nth term of GP is :"+nth(a,r,n));
        sc.close();
    }    
}
