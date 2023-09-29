class Animal {
    void makeSound() {
        System.out.println("Animal is making sound");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bhow");
    }
}
public class meoverride {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        a.makeSound();
        b.makeSound();
    }   
}


