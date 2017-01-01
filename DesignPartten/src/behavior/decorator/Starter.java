package behavior.decorator;

import behavior.decorator.beverage.Beverage;
import behavior.decorator.beverage.Espresso;
import behavior.decorator.beverage.HouseBlend;
import behavior.decorator.condiment.Mocha;
import behavior.decorator.condiment.Whip;

public class Starter
{
	public static void main(String[] args)
	{
		/** 1.����Ũ�����ȣ���Ҫ���� **/
		Beverage beverage1 = new Espresso();
		print(beverage1);
		
		/** 2.����houseBlend,������Ħ����һ��Whip **/
		Beverage beverage2 = new HouseBlend();//6 1 1 3
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		print(beverage2);
		
	}
	
	public static void print(Beverage beverage)
	{
		System.out.println(beverage.getDescription() + "  - - -  " + beverage.cost());
	}
}
