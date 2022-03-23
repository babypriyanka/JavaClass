interface Animal{
    void eat();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("DOG");
    }
}
class Cat implements Animal{
    public void eat(){
        System.out.println("CAT");
    }
}
class AnimalInterface{
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
    }
}