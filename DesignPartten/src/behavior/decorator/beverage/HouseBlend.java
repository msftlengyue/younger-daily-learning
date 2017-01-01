package behavior.decorator.beverage;

/**
 * HouseBlend����
 * @author Administrator
 *
 */
public class HouseBlend extends Beverage
{
	public HouseBlend()
	{
		description = "House Blend";
	}
	@Override
	public double cost()
	{
		return 6;
	}

}
