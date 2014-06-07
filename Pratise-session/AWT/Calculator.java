import java.awt.event.*;
import java.applet.*;
import java.awt.*;
/*
<applet code="Calculator" width=300 height=500>
</applet>
*/
public class Calculator extends Applet implements ActionListener
{
	double firstnum,secondnum,answer;
	String sanswer;
	int operation=0;
	Button zero,one,two,three,four,five,six,seven,eight,nine,equal,multiply,decimal,minus,plus,divide;
	TextField screen;
	public void init()
	{
		setLayout(new GridLayout(5,5));
		screen=new TextField(20);
		add(screen);
		one=new Button("1");
		add(one);
		two=new Button("2");
		add(two);
		three=new Button("3");
		add(three);
		four=new Button("4");
		add(four);
		five=new Button("5");
		add(five);
		six=new Button("6");
		add(six);
		seven=new Button("7");
		add(seven);
		eight=new Button("8");
		add(eight);
		nine=new Button("9");
		add(nine);
		zero=new Button("0");
		add(zero);
		plus=new Button("+");
		add(plus);
		minus=new Button("-");
		add(minus);
		multiply=new Button("*");
		add(multiply);
		divide=new Button("/");
		add(divide);
		decimal=new Button(".");
		add(decimal);
		equal=new Button("=");
		add(equal);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		equal.addActionListener(this);
		decimal.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if("1".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'1');
		}
		if("2".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'2');
		}
		if("3".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'3');
		}
		if("4".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'4');
		}
		if("5".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'5');
		}
		if("6".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'6');
		}
		if("7".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'7');
		}
		if("8".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'8');
		}
		if("9".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'9');
		}
		if("0".equals(e.getActionCommand()))
		{
			String pnum=screen.getText();
			screen.setText(pnum+'0');
		}
		if(".".equals(e.getActionCommand()))
			{
				String pnum=screen.getText();
				screen.setText(pnum+'.');
			}
		if("+".equals(e.getActionCommand()))
		{
			firstnum=(Double.parseDouble(screen.getText()));
			operation=1;
			screen.setText("");
		}
		if("-".equals(e.getActionCommand()))
		{
			firstnum=(Double.parseDouble(screen.getText()));
			operation=2;
			screen.setText("");
		}
		if("*".equals(e.getActionCommand()))
		{
			firstnum=(Double.parseDouble(screen.getText()));
			operation=3;
			screen.setText("");
		}
		if("/".equals(e.getActionCommand()))
		{
			firstnum=(Double.parseDouble(screen.getText()));
			operation=4;
			screen.setText("");
		}
		if("=".equals(e.getActionCommand()))
		{
			secondnum=(Double.parseDouble(screen.getText()));
			if(operation==1)
			{
				screen.setText("");
				answer=firstnum+secondnum;
				sanswer=Double.toString(answer);
				screen.setText(sanswer);
			}
			if(operation==2)
			{
				screen.setText("");
				answer=firstnum-secondnum;
				sanswer=Double.toString(answer);
				screen.setText(sanswer);
			}
			if(operation==3)
			{
				screen.setText("");
				answer=firstnum*secondnum;
				sanswer=Double.toString(answer);
				screen.setText(sanswer);
			}
			if(operation==4)
			{
				screen.setText("");
				answer=firstnum/secondnum;
				sanswer=Double.toString(answer);
				screen.setText(sanswer);
			}
			if(".".equals(e.getActionCommand()))
			{
				String pnum=screen.getText();
				screen.setText(pnum+'.');
			}
		}
	}
}
/*
E:\JAVAPrograms\AWT>javac Calculator.java

E:\JAVAPrograms\AWT>appletviewer Calculator.java

E:\JAVAPrograms\AWT>*/
