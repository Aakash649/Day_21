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
	int Emp_Wage_per_Hr=20,day=0,Total_Hrs=0;
	int full_day=8,part_day=4,EmpWage,hrs,Total_Wage=0;
	
	while(Total_Hrs < 200 && day < 20)
	{
		int p=(int)Math.floor(Math.random()*10)%3;
		switch(p) 
		{
		case 1:
		System.out.println("Present");
		hrs=full_day;
		day=day+1;
		Total_Hrs=Total_Hrs+hrs;
		break;
		case 2:
		System.out.println("Part Day");
		hrs=part_day;
		day=day+(1/2);
		Total_Hrs=Total_Hrs+hrs;
		break;
		default:
		System.out.println("Absent");
		hrs=0;
		day=day+0;
		Total_Hrs=Total_Hrs+hrs;
		break;
		}
		EmpWage=Emp_Wage_per_Hr*hrs;
		System.out.println("Employee Wage: "+EmpWage+" Total Hrs: "+Total_Hrs+" On Day: " +day);
		Total_Wage=Total_Wage+EmpWage;
		
	}
	System.out.println("Total Wage: "+Total_Wage);
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
