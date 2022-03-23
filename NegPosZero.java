import java.util.Scanner;
class NegPosZero{
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n>0){
            System.out.println("Number is positive");
        }
        else if(n<0){
            System.out.println("Number is Negetive");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}