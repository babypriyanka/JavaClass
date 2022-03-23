import java.util.Scanner;
class Max3num {
    public static void main(String args[]) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        n1=sc.nextInt(); 
        System.out.println("Enter number 2: ");
        n2=sc.nextInt();
        System.out.println("Enter number 3: ");
        n3=sc.nextInt();
        if(n1>n2 && n1>n3) {
            System.out.println("Maximum number is: "+n1);
        }
        else if (n2>n1 && n2>n3) {
            System.out.println("Maximum number is:"+n2);
        }
        else if (n3>n1 && n3>n2) {
            System.out.println("Maximum number is:"+n3);
        }
        else {
            System.out.println("Not valid,Please check the entered values");
        }
        
    }
}