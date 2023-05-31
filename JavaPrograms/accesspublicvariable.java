

class ClassA {
    protected int x = 10;
}

public class accesspublicvariable {
    public static void main(String[] args) {
        // Create an instance of ClassA
        ClassA a = new ClassA();

        // Access the variable x from ClassA
        int y = a.x;

        // Print the value of y
        System.out.println(y);
    }
}
