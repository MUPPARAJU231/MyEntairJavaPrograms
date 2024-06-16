package assignments;
abstract class Amazon_auth
{
	abstract void un();
	abstract void un_mob();
	void login_button()
	{
		System.out.println("Logic");
	}
}
abstract class Amazon_login extends Amazon_auth
{
	abstract void un_as_email();
	abstract void un_as_mob();
	void registration_button()
	{
		System.out.println("Logic1");
	}
}

public class Abstract_C_CA_CA extends Amazon_login
{
	public static void main(String[] args) 
	{
		Abstract_C_CA_CA a1=new Abstract_C_CA_CA();
		a1.login_button();
		a1.registration_button();
	}
	@Override
	void un_as_email() {
		// TODO Auto-generated method stub
	}
	@Override
	void un_as_mob() {
		// TODO Auto-generated method stub
	}
	@Override
	void un() {
		// TODO Auto-generated method stub
	}
	@Override
	void un_mob() {
		// TODO Auto-generated method stub
	}
}
