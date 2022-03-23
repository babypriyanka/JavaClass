//Write a JAVAprogram to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class NaturalLoop
{
    public static void main(String[] args) {
        int i,sum=0,n;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++) 
		{
		    sum=i+sum;	
		
		}
		System.out.print(sum);
	}
}