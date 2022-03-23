import java.util.*;
class StrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int i,fact=1,sum=0,rem,temp;
        rem=n%10;
        while(i<=rem){
            fact=fact*i;
            i++;
            sum=sum+fact;
            n=n/10;
        }
        System.out.println(fact);
        System.out.println(sum);
    }
}