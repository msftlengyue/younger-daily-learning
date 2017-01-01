package behavior.observer.impl;

import java.util.ArrayList;
import java.util.List;

import design.core.sys.Print;

import behavior.observer.intf.IObserver;
import behavior.observer.intf.ISubject;

public class WeatherDataSubject implements ISubject
{
	/** ÎÂ¶È */
	private int temp; 
	
	/** Êª¶È */
	private int humidity;
	
	/** ÆøÑ¹ */
	private int pressure;
	
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	@Override
	public void notifyObserver()
	{
		for (IObserver observer : observers)
		{
			observer.update(temp, humidity, pressure);
		}
	}

	@Override
	public void registerObserver(IObserver observer)
	{
		if (observers.contains(observer))
		{
			Print.print("The observer has been registered.");
			return;
		}
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer)
	{
		if (!observers.contains(observer))
		{
			Print.print("The observer is not exits in the WeatherDataSubject.");
			return;
		}
		observers.remove(observer);
	}

	public void setTemp(int temp)
	{
		this.temp = temp;
		notifyObserver();
	}

	public void setHumidity(int humidity)
	{
		this.humidity = humidity;
		notifyObserver();
	}

	public void setPressure(int pressure)
	{
		this.pressure = pressure;
		notifyObserver();
	}
}
