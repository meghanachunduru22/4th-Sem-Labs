import java.util.Scanner;

public class NaturalnumbersSum {
    public static int Nsum(int a){

        return a*(a+1)/2;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Sum of n natural numbers is : "+Nsum(n));
        sc.close();

    }   
}
