package behavior.observer.impl;

import behavior.observer.intf.IObserver;
import behavior.observer.intf.ISubject;

public abstract class AbstractDisplay implements IObserver
{
	private ISubject subject;
	
	public void resgisterSub(ISubject subject)
	{
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void removeSub()
	{
		this.subject.removeObserver(this);
		this.subject = null;
	}
}
