package create.abstractfactory;

public class Starter
{
	public static void main(String[] args)
	{
		AbstractFactory factory = new SendMailFactory();
		send(factory);
	}

	private static void send(AbstractFactory factory)
	{
		Sender sender = factory.produce();
		sender.send();
	}
}
