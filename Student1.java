class Student1Details{
    String sname,sec;
    int rollno,internal_marks,external_marks,project_marks;
    
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
class Student1{
    public static void main(String[] args){
        Student1Details s1=new Student1Details();
        s1.sname="Priyanka";
        s1.sec="A";
        s1.rollno=123;
        s1.internal_marks=63;
        s1.external_marks=75;
        s1.project_marks=90;
        
        System.out.println(s1.sname+" "+s1.sec+" "+s1.rollno+" "+s1.internal_marks+" "+s1.external_marks+" "+s1.project_marks);
        s1.grade();
        
        Student1Details s2=new Student1Details();
        s2.sname="Sankeerth";
        s2.sec="B";
        s2.rollno=153;
        s2.internal_marks=83;
        s2.external_marks=95;
        s2.project_marks=70;
        
        System.out.println(s2.sname+" "+s2.sec+" "+s2.rollno+" "+s2.internal_marks+" "+s2.external_marks+" "+s2.project_marks);
        s2.grade();
    }
}