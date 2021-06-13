import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Positive Even , Positive Odd , Negative Even, Negative Odd, Zero
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n>0){
            System.out.print("Positive ");
            if(n%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        else if(n<0){
            System.out.print("Negative ");
            Math.abs(n);
            if(n%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        else{
            System.out.println("Zero");
        }
    }    
}
