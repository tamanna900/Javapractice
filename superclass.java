

class Anime{
    String color="white";
}
class Dog extends Anime{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
class superclass{

    public static void main(String []args){
        Dog d=new Dog();
        d.printColor();
    }}
