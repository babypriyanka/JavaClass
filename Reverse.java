import java.util.*;
class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int rem=0,rev=0;
        while(num!=0) //12345
        {
            rem = num%10; //5
            rev = rev*10+rem; // 4*10+3.....43
            num=num/10;
        }
        System.out.println(rev);
    }
}