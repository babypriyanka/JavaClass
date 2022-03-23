// Write a JAVAprogram to input week number and print week day.-
import java.util.Scanner;
class WeekDay{
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dAY");
        n=sc.nextInt();
        if(n==1){
            System.out.println("MONDAY");
        }
        else if(n==2){
            System.out.println("TUEDAY");
        }
        else if(n==3){
            System.out.println("WEDNESDAY");
        }
        else if(n==4){
            System.out.println("THURSDAY");
        }
        else if(n==5){
            System.out.println("FRIDAY");
        }
        else if(n==6){
            System.out.println("SATURDAY");
        }
        else if(n==7){
            System.out.println("SUNDAY");
        }
        else {
            System.out.println("Invalid Day");
        }
    }
}