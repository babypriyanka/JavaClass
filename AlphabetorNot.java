//Write a JAVAprogram to check whether a character is alphabet or not.
import java.util.Scanner;
class AlphabetorNot{
    public static void main(String args[]){
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character:");
        ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') ){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Number or Special charcter");
        }
    }
}