class Animals {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Cat extends Animals {
    void meow() {
        System.out.println(name + " is meowing");
    }
}

public class inheritanceeg{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Kitty";
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
