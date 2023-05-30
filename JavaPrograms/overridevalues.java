
public class overridevalues {
  final int x = 10;
  //int x = 10;

  public static void main(String[] args) {
    overridevalues myObj = new overridevalues();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
