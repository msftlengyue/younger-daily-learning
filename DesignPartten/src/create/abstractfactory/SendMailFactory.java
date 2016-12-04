package create.abstractfactory;

public class SendMailFactory implements AbstractFactory
{

	@Override
	public Sender produce()
	{
		return new SendMail();
	}

}
