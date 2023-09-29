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
        Animal a = new Animal();
        a.makeSound();
        Cat c = new Cat();
        c.makeSound();
        Dog d = new Dog();
        d.makeSound();
    }
    
}
