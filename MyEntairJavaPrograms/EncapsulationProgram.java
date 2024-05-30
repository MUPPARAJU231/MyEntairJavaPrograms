package assignments;
class Amazon
{
	private String un="Care@amazon.com";

	public String getun()
	{
		return un;
	}
	public void setun(String un)
	{
		this.un=un;
	}
}
public class EncapsulationProgram
{
	public static void main(String[] args)
	{
		Amazon a=new Amazon();
		a.setun("Javaby@mkt.com");
		System.out.println(a.getun());
	}
}
