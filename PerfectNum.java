import java.util.*; //6=1+2+3 =6 //sum of factors excluding the number itself
class PerfectNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int i,fact=0;
        for(i=1;i<=n-1;i++){
            if(n%i==0){
                fact=fact+i;
            }
        }
        System.out.println(fact);
        if(n==fact){
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Perfect number"); 
        }
    }
}