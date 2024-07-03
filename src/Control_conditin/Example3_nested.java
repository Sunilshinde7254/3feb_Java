package Control_conditin;

public class Example3_nested 
{
public static void main(String[] args) 
{
	 int marks = 120;
	 if(marks>=100)
	 {
		System.out.println(" Conguraction you eligible to next process" );	
		
		int mains_marks = 180;
		if(mains_marks>=200)
		{
			System.out.println(" Conguraction you finally selected " );	
		}
		else
		{
			System.out.println(" Sorry best luck for next time  ");	
		}
	 }
	 else
	 {
		 System.out.println(" Sorry try to next time  ");
	 }
	 
	 
}
}
