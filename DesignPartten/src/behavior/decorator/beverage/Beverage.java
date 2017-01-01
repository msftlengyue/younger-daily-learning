package behavior.decorator.beverage;

/**
 * 饮料抽象类
 * 也是被装饰者抽象类
 * @author Administrator
 *
 */
public abstract class Beverage
{
	String description = "unknown beverage";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();
	
}
