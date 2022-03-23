class Add{
    static void Add(int a,int b){
        System.out.println(a+b);
    }
    static void Add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void Add(double a,double b){
        System.out.println(a+b);
    }
    static void Add(char a,double b){
        System.out.println(a+" "+b);
    }
}
class AddOverLoading{
    public static void main(String args[]){
        Add.Add(1,2);
        Add.Add('a',23.5);
    }
}