package create.abstractfactory;

public class SendSMSFactory implements AbstractFactory
{

	@Override
	public Sender produce()
	{
		return new SendSms();
	}

}
