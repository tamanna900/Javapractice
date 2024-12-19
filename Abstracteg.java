abstract class mammal{
    abstract void sound();
    void sleep(){
        System.out.println("sleeps");
    }
}
class Dogs extends mammal{
    void sound(){
        System.out.println("barks");
    }
}
public class Abstracteg{
mammal dog=new Dogs();
dog.sound();
dog.sleep();
}