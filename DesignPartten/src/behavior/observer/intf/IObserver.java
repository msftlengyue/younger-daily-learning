package behavior.observer.intf;

public interface IObserver
{
	
	public void update(int temp, int humidity, int pressure);
	
	public void buildData(int temp, int humidity, int pressure);
	
//	public void resgisterSub(ISubject subject);
//	
//	public void removeSub();
}
