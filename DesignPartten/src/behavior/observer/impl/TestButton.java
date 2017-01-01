package behavior.observer.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestButton
{
	static JFrame frame;
	static JButton button;
	static boolean flag = true;
	public static void main(String[] args)
	{
		frame = new JFrame();
		button = new JButton();
		frame.add(button);
		frame.setSize(50, 80);
		frame.setVisible(true);
		button.setText("点我");
		button.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(flag)
				{
					flag = !flag;
					frame.setSize(400, 600);
				}
				else
				{
					flag = !flag;
					frame.setSize(100, 150);
				}
			}
		});
		button.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//frame.add(new JLabel("我是杨亚刚"));
				System.out.println("BBBB");
			}
		});
	}
}
