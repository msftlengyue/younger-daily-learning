package create.abstractfactory;

public class SendMail implements Sender
{

	@Override
	public void send()
	{
		System.out.println("Sending Mail...");
	}

}
