package assignments;

public class DownCasting extends Parent_One
{
	public static void main(String[] args)
	{
		Parent_One p1=new DownCasting();
		DownCasting p2=(DownCasting) p1;
		System.out.println(p2.getClass());
	}
}
class Parent_One
{

}