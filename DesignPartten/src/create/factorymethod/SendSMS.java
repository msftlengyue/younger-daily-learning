package create.factorymethod;

public class SendSMS implements Sender
{

	@Override
	public void send()
	{
		System.out.println("sending sms");
	}

}
