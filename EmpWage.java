class Hello
{
	void Welcome()
	{
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	}
}
class Attendence{
	
	
	public void attend() 
	{
	double p=Math.floor(Math.random()*10)%2;
	if(p == 1) 
	{
		System.out.println("Present");
	}
	else
	{
		System.out.println("Absent");
	}
	
	}
	
}

class EmpWage
{
	public static void main(String[] args)
	{
		Hello A1 = new Hello();
		A1.Welcome();
		Attendence A=new Attendence();
		A.attend();
	}
}
