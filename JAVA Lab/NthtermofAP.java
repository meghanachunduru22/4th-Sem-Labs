import java.util.Scanner;



class NthtermofAP{

    public static int Nth_of_AP(int a,int d,int n){

        return ( a + (n - 1) * d );
}
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("The "+ n +"th term of the series is : " + Nth_of_AP(a, d, n));
        sc.close();
    }
}