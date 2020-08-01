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
	int Emp_Wage_per_Hr=20;
	int full_day=8,EmpWage,hrs;
	double p=Math.floor(Math.random()*10)%2;
	if(p == 1) 
	{
		System.out.println("Present");
		hrs=full_day;
	}
	else
	{
		System.out.println("Absent");
		hrs=0;
	}
	EmpWage=Emp_Wage_per_Hr*hrs;
	System.out.print("Employee Wage: "+EmpWage);
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
