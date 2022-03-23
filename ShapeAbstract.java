abstract class Shape{
    abstract void draw();
    
}
class circle extends Shape{
    void draw(){
        System.out.println("CIRCLE");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("REC");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("SQ");
    }
}
class ShapeAbstract{
    public static void main(String args[]){
        circle c = new circle();
        c.draw();
        //Shape s = new circle();
        //s.draw();
    }
}