// Write a JAVAprogram to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class OddLoop
{
    public static void main(String[] args) {
        int i,sum=0,n;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+2) 
		{
		    sum=i+sum;	
		
		}
		System.out.print(sum);
	}
}