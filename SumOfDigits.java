import java.util.*;
class SumOfDigits{
    public static void main(String args[]){
       int sum=0,rem,a;
       Scanner sc = new Scanner(System.in);
       a=sc.nextInt();
        while (a>0){
            rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println(sum);
    }
}