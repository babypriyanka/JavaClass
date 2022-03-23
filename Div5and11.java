//Write a JAVAprogram to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class Div5and11{
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println(n+" Number is divisible by 5 and 11");
        }
        else if(n%5==0){
            System.out.println(n+" Number is divisible by 5 only");
        }
        else if(n%11==0){
            System.out.println(n+" Number is divisible by 11 only");
        }
        else {
            System.out.println(n+" Number is not divisible by 5 and 11");
        }
    }
}