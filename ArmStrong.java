import java.util.*;
class ArmStrong{
    public static void main(String args[]){
        int sum=0,temp,n,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number"); //153
        n=sc.nextInt();
        temp=n;
        while (temp!=0){
            rem=temp%10;  
            temp=temp/10;  
            sum=sum+rem*rem*rem;
        }
        System.out.println("Sum"+sum);
if(n==sum){
    System.out.println("ARMSTRONG: "+sum);
}
else{
    System.out.println("NOT ARMSTRONG: "+sum);
}
}
}