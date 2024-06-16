package assignments;
interface Interface2
{
	void login();
	void logout();
}
interface Interface1 extends Interface2
{
	void search();
	void payment();
}
public class ClassWithInterface  implements Interface1
{
	void order_page()
	{
		
	}
	static void address_page()
	{
		
	}
	public static void main(String[] args) 
	{
		ClassWithInterface a1=new ClassWithInterface();
		a1.payment();
		a1.login();
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}
}
