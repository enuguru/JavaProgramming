
abstract class Language {
  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}

class newabstractclass extends Language {

  public static void main(String[] args) {
        // create an object of Main
    newabstractclass obj = new newabstractclass();

    // access method of abstract class
    // using object of newabstractclass class
    obj.display();
  }
}
