class test_1
{
	void display()
	{
		System.out.println("Test 1 is running....");
	}
}
class test_2 extends test_1
{
	void display()
	{
		super.display();
		System.out.println("Test 2 is running....");
	}
}
public class program44_overriding_methods {

	public static void main(String[] args) 
	{
		test_2 obj = new test_2();
		obj.display();

	}

}
