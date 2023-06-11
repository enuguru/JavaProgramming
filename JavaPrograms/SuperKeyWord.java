
class Animal {
public void eat() {
    System.out.println("I can eat");
  } 
}


class Dog extends Animal {
  // overriding the eat() method
  @Override
  public void eat() {
    // call method of superclass
    System.out.println("I eat dog food");
    super.eat();
  }
public void bark() {
    System.out.println("I can bark");
  }
}


class SuperKeyWord {
  public static void main(String[] args) {
   Dog labrador = new Dog();

    // call the eat() method
    labrador.eat();
    labrador.bark();
  }
}
