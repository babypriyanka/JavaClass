import java.util.*;
class Palendrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int rem=0,rev=0,temp;
        temp=num;
        while(num!=0) //12345
        {
            rem = num%10; //5
            rev = rev*10+rem; // 4*10+3.....43
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("Palendrome");
        }
        else {
            System.out.println("Not Palendrome");
        }
        
    }
}