package behavior.decorator.condiment;

import behavior.decorator.beverage.Beverage;

/**
 * 调料抽象类
 * 装饰者
 * @author Administrator
 *
 */
public abstract class CondimentDecorator extends Beverage
{
	public abstract String getDescription();
}
