

class Employee{
	float salary=40000;
}

public class SimpleInheritanceOne extends Employee{
	int bonus=10000;
	
public static void main(String args[]){
	SimpleInheritanceOne p = new SimpleInheritanceOne();
	System.out.println("Programmersalaryis:"+p.salary);
	System.out.println("BonusofProgrammeris:"+p.bonus);
    }
}

