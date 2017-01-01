package behavior.observer.impl;

import behavior.observer.intf.IObserver;
import behavior.observer.intf.ISubject;
import design.core.sys.Print;

public class CurrentDisplay implements IObserver
{
	private String data;
	
	private ISubject suject;
	
	public CurrentDisplay(ISubject subject)
	{
		this.suject = subject;
		suject.registerObserver(this);
	}
	
	@Override
	public void update(int temp, int humidity, int pressure)
	{
		buildData(temp, humidity, pressure);
		Print.print("CurrentDisplay update.");
		Print.print(data);
	}
	
	@Override
	public void buildData(int temp, int humidity, int pressure)
	{
		data = "[temp:" + temp + "," + "humidity:" + humidity + "," + "pressure:" + pressure + "]";
	}
}
