package behavior.observer.impl;

import java.util.Random;

import design.core.sys.Print;

import behavior.observer.intf.IObserver;

public class Starter
{
	public static void main(String[] args)
	{
		WeatherDataSubject suject = new WeatherDataSubject();
		IObserver currentDisplay = new CurrentDisplay(suject);
		IObserver staticIObserver = new StatisticDispaly(suject);
		IObserver forecastDisplay = new ForecastDisplay(suject);
		
		update(suject);
		
	}

	private static void update(WeatherDataSubject suject)
	{
		Random rand = new Random();
		while (true)
		{
			int irand = rand.nextInt(100);
			int hash = irand % 3;
			switch(hash)
			{
			case 0 :
				suject.setTemp(irand);break;
			case 1 :
				suject.setHumidity(irand);break;
			case 2 :
				suject.setPressure(irand);break;
			}
			
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				Print.print(e);
			}
		}
	}
}
