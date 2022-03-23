class DogDetails{
    String name;
    String color;
    String breed;
    String eyecolor;
    
    void bark(){
        System.out.println("BARKING");
    }
    void eat() {
        System.out.println("EATING");
    }
}
class Dog{
    public static void main(String args[]){
        DogDetails d1=new DogDetails();
        d1.name="Snoopy";
        d1.color="Gold";
        d1.breed="Goldenretreiver";
        d1.eyecolor="Black";
        
        System.out.println(d1.name+" "+"  DOG color: "+d1.color+"   Breed: "+d1.breed+"   Eye Color: "+d1.eyecolor);
        d1.bark();
        d1.eat();
        
        DogDetails d2=new DogDetails();
        d2.name="Rocky";
        d2.color="Black";
        d2.breed="Rottweiler";
        d2.eyecolor="Black";
        
        System.out.println(d2.name+" "+"   DOG color: "+d2.color+"   Breed: "+d2.breed+"   Eye Color: "+d2.eyecolor);
        d2.bark();
        d2.eat();
        
    }
}