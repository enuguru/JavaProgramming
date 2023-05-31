
class Animal {
  public String name;
  protected void display() {
    System.out.println("I am an animal.");
  } 

}


class Dog extends Animal {
  public void getInfo() {
    name = "Tommy";
    System.out.println("My name is " + name);
  } 

}


public class protectedoneerror {

    name = "Rocky";
  public static void main(String[] args) {
    Dog labrador = new Dog();
    //labrador.name = "Rocky";
    //labrador.display();
    labrador.getInfo();
  } 

}
