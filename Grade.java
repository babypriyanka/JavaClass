//13. Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. 
//Calculate percentage and grade according to following:
//Percentage >= 90% : 
//Grade A Percentage >= 80% :
//Grade B Percentage >= 70% : 
//Grade C Percentage >= 60% :
//Grade D Percentage >= 40% : 
//Grade E Percentage < 40% :
//Grade F 
import java.util.Scanner;
class Grade{
    public static void main(String args[]){
        float m1,m2,m3,m4,m5,sum,p;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter m1");
        m1=sc.nextInt();
        System.out.println("Enter m2");
        m2=sc.nextInt();
        System.out.println("Enter m3");
        m3=sc.nextInt();
        System.out.println("Enter m4");
        m4=sc.nextInt();
        System.out.println("Enter m5");
        m5=sc.nextInt();
        sum=m1+m2+m3+m4+m5;
        p=(sum/5)*100;
        if(p>=90){
                System.out.println("Grade A");
            }
            else if(p>=80){
                System.out.println("Grade B");
            }
            else if(p>=70){
                System.out.println("Grade C");
            }
            else if(p>=60){
                System.out.println("Grade D");
            }
            else if(p<40){
                System.out.println("Grade E");
            }
        
    }
}