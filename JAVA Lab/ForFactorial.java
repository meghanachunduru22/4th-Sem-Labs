import java.util.Scanner;

public class ForFactorial {
    public static void main(String[] args) {
        int i = 0,fact = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            fact *= i;

        }
        System.out.println("Factorial "+n+" : "+fact);
    }
    
}
