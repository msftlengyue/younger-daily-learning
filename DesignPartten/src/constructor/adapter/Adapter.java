package constructor.adapter;

public class Adapter extends Source implements TargetTable
{

	@Override
	public void method2()
	{
		System.out.println("TargetTable method2...");
	}

}
