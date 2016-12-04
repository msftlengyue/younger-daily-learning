package constructor.adapter;

public class Starter
{
	public static void main(String[] args)
	{
		TargetTable target = new Adapter();
		target.method1();
		target.method2();
		TargetTable wrapper = new Wrapper(new Source());
		wrapper.method1();
		wrapper.method2();
	}
}
