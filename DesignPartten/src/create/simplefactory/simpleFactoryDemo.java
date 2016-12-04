package create.simplefactory;

import create.simplefactory.product.fruit;

public class simpleFactoryDemo
{
	public static void main(String[] args)
	{
		fruit f = FruitFactory.getInstance();
		f.eaten();
		f.havest();
		f.grow();
	}
}
