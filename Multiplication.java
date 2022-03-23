import java.util.Scanner;
class Multiplication
{
    public static void main(String[] args) {
        int i,sum=0,n;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		n=sc.nextInt();
		for(i=0;i<=10;i++) 
		{
		     System.out.println(n+"X"+i+"="+(n*i));  
		}
	}
}