package create.simplefactory.product;

public class Banana extends fruit
{

	@Override
	public void eaten()
	{
		System.out.println(getClass().getSimpleName() + " is eaten!");
	}

	@Override
	public void grow()
	{
		System.out.println(getClass().getSimpleName() + " is grown!");
	}

	@Override
	public void havest()
	{
		System.out.println(getClass().getSimpleName() + " is havest!");
	}

}
