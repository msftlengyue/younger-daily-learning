package create.factorymethod;

public class SendMail implements Sender
{

	@Override
	public void send()
	{
		System.out.println("sending mail");
	}
	
}
