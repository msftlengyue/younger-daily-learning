package behavior.decorator.beverage;

/**
 * Å¨Ëõ¿§·È
 * @author Administrator
 *
 */
public class Espresso extends Beverage
{
	public Espresso()
	{
		description = "Espresso";
	}
	@Override
	public double cost()
	{
		return 5;
	}

}
