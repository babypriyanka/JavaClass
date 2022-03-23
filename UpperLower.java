//Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;
class UpperLower{
    public static void main(String args[]){
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character:");
        ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Number or Special charcter");
        }
    }
}