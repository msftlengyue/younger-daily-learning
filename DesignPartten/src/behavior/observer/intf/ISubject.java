package behavior.observer.intf;

public interface ISubject
{
	public void registerObserver(IObserver observer);
	
	public void removeObserver(IObserver observer);
	
	public void notifyObserver();
}
