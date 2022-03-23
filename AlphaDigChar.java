//Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.
import java.util.Scanner;
class AlphaDigChar{
    public static void main(String args[]){
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character:");
        ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') ){
            System.out.println("Alphabet");
        }
        else if((ch>='0' && ch<='9')){
            System.out.println("Number");
        }
        else {
            System.out.println("Special Charcter"); 
        }
    }
}