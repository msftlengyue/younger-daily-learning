package create.simplefactory;

import java.io.IOException;
import java.util.Properties;

import create.simplefactory.product.fruit;


public class FruitFactory
{
	private static Properties prop = new Properties();
	static{
		try
		{
			prop.load(FruitFactory.class.getResourceAsStream("/simplefactory/product/env.properties"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static fruit getInstance()
	{
		try
		{
			return (fruit)Class.forName(prop.getProperty("fruitName")).newInstance();
		} catch (InstantiationException e)
		{
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
