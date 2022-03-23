import java.util.*;
class MaxArray {
    public static void main(String argss[]){
        int n,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        n=sc.nextInt();
        int a[]= new int[n];
        // print array elements
        System.out.println("Array Elememnts");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum value:"+max);
    }
}