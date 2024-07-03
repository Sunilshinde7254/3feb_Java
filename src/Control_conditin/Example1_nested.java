package Control_conditin;

public class Example1_nested {

	public static void main(String[] args) {

		int marks = 60;
		int mainsMarks = 75;
		if (marks >= 60) 
		{
			System.out.println("Congratulations! You are eligible for the mains exam.");

			if (mainsMarks >= 70) 
			{
				System.out.println("Congratulations! You are eligible for the final selection.");
			} 
			else
			{
				System.out.println("Sorry, you did not qualify for the final selection.");
			}

		}
		else 
		{
			System.out.println("Sorry, you are not eligible for the mains exam.");
		}

	
	}

}






