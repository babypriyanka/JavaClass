import java.util.*;
class Ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        char ch = sc.next().charAt(0);
        int v=ch;// type conversion 
        System.out.println(v);
    }
}