import java.util.*;
class Student2Details{
    String sname,sec;
    int rollno,internal_marks,external_marks,project_marks;
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name");
        sname=sc.next();
        System.out.println("Enter sec");
        sec=sc.next();
        System.out.println("Enter rollno");
        rollno=sc.nextInt();
        System.out.println("Enter InternalMarks");
        internal_marks=sc.nextInt();
        System.out.println("Enter ExternalMarks");
        external_marks=sc.nextInt();
        System.out.println("Enter ProjectMarks");
        project_marks=sc.nextInt();
    }
    void display(){
        System.out.println(sname+" "+sec+" "+rollno+" "+internal_marks+" "+external_marks+" "+project_marks);
    }
    void grade(){
        float total,p;
        total=internal_marks+external_marks+project_marks;
        p=(total/300)*100;
        System.out.println(p);
        if(p<=90 && p>=80){
            System.out.println("GRADE - A");
        }
        else if(p<80 && p>=70){
            System.out.println("GRADE - B");
        }
        else if(p<70 && p>=60){
            System.out.println("GRADE - C");
        }
        else {
            System.out.println("FAIL");
        }
    }
}
class ExampleOops{
    public static void main(String[] args){
        Student2Details s1=new Student2Details();
        s1.input();
        s1.display();
        s1.grade();
        
        Student2Details s2=new Student2Details();
        s2.input();
        s2.display();
        s2.grade();
    }
}