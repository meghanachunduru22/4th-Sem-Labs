import java.util.Scanner;

public class whileCountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        while(n>0){
            a++;
            n/=10;
        }
        System.out.println("Number of digits : "+a);
    }
}
