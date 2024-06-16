package assignments;
interface Youtube
{
	void watch_later();
	void play();
}
interface Gmail
{
	void compose();
	void schedule_send();
}
public class MultipleLevelInheritance implements Gmail,Youtube
{
	public static void main(String[] args) 
	{
		
	}

	@Override
	public void watch_later() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void schedule_send() {
		// TODO Auto-generated method stub
		
	}
}
