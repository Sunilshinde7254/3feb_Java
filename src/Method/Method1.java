package Method;

public class Method1 
{
	int num1=10 ,num2=20;
	void add()
	{

		int res =num1 + num2;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
      Method1 m1 = new Method1();
      m1.add();
	}
}
