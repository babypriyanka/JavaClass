/*14. Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.Scanner;
class Sal{
    public static void main(String args[]){
        int sal,HRA,DA;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        sal=sc.nextInt();
        if(sal<=10000){
            HRA=(sal*20)/100;
            DA=(sal*80)/100;
            System.out.println("HRA"+HRA);
            System.out.println("DA"+DA);
        }
        else if(sal<=20000){
            HRA=(sal*25)/100;
            DA=(sal*90)/100;
            System.out.println("HRA"+HRA);
            System.out.println("DA"+DA);
        }
        else if(sal>20000){
            HRA=(sal*30)/100;
            DA=(sal*95)/100;
            System.out.println("HRA"+HRA);
            System.out.println("DA"+DA);
        }
        else{
            System.out.println("INVALID SALARY");
        }
    }
}