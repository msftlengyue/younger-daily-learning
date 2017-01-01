package behavior.observer.impl;

import java.util.ArrayList;
import java.util.List;

import behavior.observer.intf.IObserver;
import behavior.observer.intf.ISubject;

import design.core.sys.Print;

public class StatisticDispaly implements IObserver
{
	private List<String> historyData = new ArrayList<String>();
	
	private ISubject suject;
	
	public StatisticDispaly(ISubject subject)
	{
		this.suject = subject;
		suject.registerObserver(this);
	}
	
	@Override
	public void buildData(int temp, int humidity, int pressure)
	{
		String data = "[temp:" + temp + "," + "humidity:" + humidity + "," + "pressure:" + pressure + "]";
		historyData.add(data);
	}

	@Override
	public void update(int temp, int humidity, int pressure)
	{
		buildData(temp, humidity, pressure);
		Print.print("StatisticDispaly update.");
		Print.print(historyData);
	}

}
