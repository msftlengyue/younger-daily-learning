package create.abstractfactory;

public class SendSms implements Sender
{

	@Override
	public void send()
	{
		System.out.println("Sending SMS...");
	}

}
