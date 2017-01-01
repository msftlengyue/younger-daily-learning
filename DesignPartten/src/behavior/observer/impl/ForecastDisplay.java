package behavior.observer.impl;

import java.util.HashMap;
import java.util.Map;

import behavior.observer.intf.IObserver;
import behavior.observer.intf.ISubject;

import design.core.sys.Print;

public class ForecastDisplay implements IObserver
{
	private Map<String, Integer> historyData = new HashMap<String, Integer>();
	
	private ISubject suject;
	
	public ForecastDisplay(ISubject subject)
	{
		historyData.put("temp", 0);
		historyData.put("humidity", 0);
		historyData.put("pressure", 0);
		this.suject = subject;
		suject.registerObserver(this);
	}
		
	@Override
	public void buildData(int temp, int humidity, int pressure)
	{
		historyData.put("temp", (historyData.get("temp") + temp)/2);
		historyData.put("humidity", (historyData.get("humidity") + humidity)/2);
		historyData.put("pressure", (historyData.get("pressure") + pressure)/2);
	}

	@Override
	public void update(int temp, int humidity, int pressure)
	{
		buildData(temp, humidity, pressure);
		Print.print("ForecastDisplay update.");
		Print.print(historyData);		
	}

}
