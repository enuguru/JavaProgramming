
class A
{
    public void perform()
    {
        System.out.println("Hello.. from Super Class");
    }
}

class B extends A {  

}

public class simpleinheritance {
	public static void main(String[] args) 
	{
        B obj = new B(); // creating object of class B
        obj.perform(); // method gets inherited from class A
	}
}

