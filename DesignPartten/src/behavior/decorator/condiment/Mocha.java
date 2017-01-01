package behavior.decorator.condiment;

import behavior.decorator.beverage.Beverage;

/**
 * Ħ������
 * @author Administrator
 *
 */
public class Mocha extends CondimentDecorator
{
	private Beverage beverage;
	
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription()
	{
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost()
	{
		return beverage.cost() + 1;
	}

}
