class Animal {
public void eat() {
    System.out.println("I can eat");
  } }
class Dog extends Animal {
  // overriding the eat() method
  @Override
  public void eat() {
    System.out.println("I eat dog food");
  }
public void bark() {
    System.out.println("I can bark");
  } }
public class MethodOverriding {
  public static void main(String[] args) {
   Dog labrador = new Dog();
    labrador.eat();
    labrador.bark();   } }
