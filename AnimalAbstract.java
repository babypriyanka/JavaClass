abstract class Animal{
    abstract void eat();
    void print(){
        System.out.println("PRINT");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is Eating fruit");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("CAT is Eating fruit");
    }
}
class AnimalAbstract{
    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        /*
        Animal d=new Dog();
        Animal c=new Cat();
        d.eat();
        c.eat();
        */
    }
}