package create.factorymethod;

public class Starter
{
	public static void main(String[] args)
	{
		Sender sender = SendFactory.getMailSend();
		sender.send();
		
		Sender senderSms = SendFactory.getSmsSend();
		senderSms.send();
	}
}
