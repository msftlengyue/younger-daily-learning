package create.factorymethod;

public class SendFactory
{
	public static SendMail getMailSend()
	{
		return new SendMail();
	}
	
	public static SendSMS getSmsSend()
	{
		return new SendSMS();
	}
}
