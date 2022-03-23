import java.util.Scanner;
class Max2num {
    public static void main(String args[]) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        n1=sc.nextInt(); 
        System.out.println("Enter number 2: ");
        n2=sc.nextInt();
        if(n1>n2) {
            System.out.println("Maximum number is: "+n1);
        }
        else if (n1<n2) {
            System.out.println("Maximum number is:"+n2);
        }
        else {
            System.out.println("n2 is equal to n1");
        }
        
    }
}