class Animal {

    String name;


    public Animal(String name) {
        this.name = name;
    }


    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " barks.");
    }

    public String getName() {
        return this.name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " meows.");
    }

    public String getName() {
        return this.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Rex");
        Cat myCat = new Cat("Whiskers");

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
