//Write a JAVAprogram to count total number of notes in given amount.
import java.util.Scanner;
class AmtNote {
    public static void main(String args[]){
        int amt,notes=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Amount");
        amt=sc.nextInt();
        if(amt>0){
            notes=amt/500;
        }
        System.out.println("500 notes:"+notes);
    }
}