interface Shape{
    int s=1; // JVM takes as public static final int s=1
    void draw(); // (or)abstract void draw()
}
class Circle implements Shape{
    public void draw(){
        System.out.println("CIRCLE");
    }
}
class ShapeInterface{
    public static void main(String args[]){
        Circle c = new Circle();
        c.draw();
    }
}