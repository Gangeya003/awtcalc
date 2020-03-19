import java.awt.Frame;
import java.applet.Applet;
import java.io.Console;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.ArithmeticException;
import java.awt.FlowLayout;
import java.lang.*;
import java.awt.*;

class Awt extends Applet implements ActionListener,WindowListener
{
	private Frame f;
	private Button ad,sub,p,d,rem,logab,
	sqrt,fac,per,com,sq,pow,log,ln,sin,cos,
	tan,cosec,sec,cot,atan,acosec,asec,acot,asin,acos,sinh,cosh,
	tanh,cosech,sech,coth,asinh,acosh,atanh,acosech,asech,acoth,sigmaab,piab,dtob,
	exit;
	private Label a,b,res,tang;
	private TextField ta,tb,tr;
	//public double mul = 1;
	//public double sum = 0;
	public Awt()
	{
		Frame f = new Frame("Calculator");
		f.setLayout(new FlowLayout());
		ad = new Button("+");
		sub = new Button("-");
		p = new Button("*");
		d = new Button("/");
		rem = new Button("%");
		fac = new Button("!");
		per = new Button("aPb");
		com = new Button("aCb");
		sq = new Button("a\u00b2");
		pow = new Button("a^b");
		sqrt = new Button("\u221A");
		ln = new Button("lna");
		log = new Button("loga");
		logab = new Button("logab");
		sin = new Button("sina");
		cos = new Button("cosa");
		tan = new Button("tana");
		sec = new Button("seca");
		cosec = new Button("coseca");
		cot = new Button("cota");
		asin = new Button("sin^1a");
		acos = new Button("cos^1a");
		atan = new Button("tan^1a");
		asec = new Button("sec^1a");
		acosec = new Button("cosec^1a");
		acot = new Button("cot^1a");
		sinh = new Button("sinha");
		cosh = new Button("cosha");
		tanh = new Button("tanha");
		sech = new Button("secha");
		cosech = new Button("cosecha");
		coth = new Button("cotha");
		asinh = new Button("sinh^1a");
		acosh = new Button("cosh^1a");
		atanh = new Button("tanh^1a");
		asech = new Button("sech^1a");
		acosech = new Button("cosech^1a");
		acoth = new Button("coth^1a");
		String str = "\u03C3";
		sigmaab = new Button(str.toUpperCase()+"a,b");
		String fff = "\u03C0";
		piab = new Button(fff.toUpperCase()+"a,b");
		dtob = new Button("Dec to Bin");
		exit = new Button("exit");
		
		f.setSize(550,500);
		f.setVisible(true);
		
		a = new Label("a:");
		b = new Label("b:");
		res = new Label("Result:");
		tang = new Label("TRIGNOMETRIC",FlowLayout.CENTER);
		
		ta = new TextField(15);
		tb = new TextField(15);
		tr = new TextField(15);
		
		f.add(a);		f.add(ta);
		f.add(b);		f.add(tb);
		f.add(res);		f.add(tr);
		f.add(ad); f.add(sub); f.add(p); 
		f.add(d); f.add(rem); f.add(fac); 
		f.add(per); f.add(com); f.add(sq); f.add(pow);
		f.add(sqrt); f.add(ln); f.add(log); f.add(logab);f.add(sigmaab); f.add(piab);
		f.add(tang);f.add(sin); f.add(cos); f.add(tan); f.add(cosec);
		f.add(sec); f.add(cot);f.add(asin); f.add(acos); 
		f.add(atan); f.add(acosec); f.add(asec); f.add(acot);
		f.add(sinh); f.add(cosh); f.add(tanh); f.add(cosech);
		f.add(sech); f.add(coth); f.add(asinh); f.add(acosh); 
		f.add(atanh); f.add(acosech);f.add(asech); f.add(acoth); //f.add(dtob);
		f.add(exit);
		
		ad.addActionListener(this);
		sub.addActionListener(this);
		p.addActionListener(this);
		d.addActionListener(this);
		rem.addActionListener(this);
		fac.addActionListener(this);
		per.addActionListener(this);
		com.addActionListener(this);
		sq.addActionListener(this);
		pow.addActionListener(this);
		sqrt.addActionListener(this);
		ln.addActionListener(this);
		log.addActionListener(this);
		logab.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		tan.addActionListener(this);
		cosec.addActionListener(this);
		sec.addActionListener(this);
		cot.addActionListener(this);
		asin.addActionListener(this);
		acos.addActionListener(this);
		atan.addActionListener(this);
		acosec.addActionListener(this);
		asec.addActionListener(this);
		acot.addActionListener(this);
		sinh.addActionListener(this);
		cosh.addActionListener(this);
		tanh.addActionListener(this);
		cosech.addActionListener(this);
		sech.addActionListener(this);
		coth.addActionListener(this);
		asinh.addActionListener(this);
		acosh.addActionListener(this);
		atanh.addActionListener(this);
		acosech.addActionListener(this);
		asech.addActionListener(this);
		acoth.addActionListener(this);
		sigmaab.addActionListener(this);
		piab.addActionListener(this);
		dtob.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public static double factorial(double x)
	{
		double c = 1;
		if(x == 0)
		{
			c = 1;
			//break;
		}
		else
		{
			for(double i = 1;i <= x;i++)
			{
				c = c*i;
			}
		}
		return c;
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public void windowClosed(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowIconified(WindowEvent we){}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == ad)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = a+b;
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == sub)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = a-b;
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == p)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = a*b;
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == d)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = a/b;
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == rem)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = a%b;
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == fac)
		{
			double c = 1;
			if(ta.getText() == null)
			{
				double b = Double.parseDouble(tb.getText());
				c = factorial(b);
			}
			else
			{
				double a = Double.parseDouble(ta.getText());
				c = factorial(a);
			}
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == per)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double f = factorial(a);
			double d = a - b;
			b = factorial(d);
			double c = f/b;
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == com)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double f = factorial(a);
			double d = factorial(b);
			double e = a - b;
			b = factorial(e);
			double c = f/(b*d);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == sq)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.pow(a,2);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == pow)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = Math.pow(a,b);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == sqrt)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.sqrt(a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == ln)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.log(a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == log)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.log10(a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == logab)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double c = Math.log10(a);
			double d = Math.log10(b);
			double e = a/b;
			tr.setText(Double.toString(e));
		}
		else if(ae.getSource() == sin)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.sin(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == cos)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Math.toDegrees(a);
			double c = Math.cos(b);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == tan)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.tan(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == cosec)
		{
			double a = Double.parseDouble(ta.getText());
			double c = 1/Math.sin(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == sec)
		{
			double a = Double.parseDouble(ta.getText());
			double c = 1/Math.cos(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == cot)
		{
			double a = Double.parseDouble(ta.getText());
			double c = 1/Math.tan(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == asin)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.asin(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == acos)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.acos(a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == atan)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.atan(a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == acosec)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.asin(1/a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == asec)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.acos(1/a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == acot)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.atan(1/a);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == sinh)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.sinh(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == cosh)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Math.toDegrees(a);
			double c = Math.cosh(b);
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == tanh)
		{
			double a = Double.parseDouble(ta.getText());
			double c = Math.tanh(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == cosech)
		{
			double a = Double.parseDouble(ta.getText());
			double c = 1/Math.sinh(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == sech)
		{
			double a = Double.parseDouble(ta.getText());
			double c = 1/Math.cosh(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == coth)
		{
			double a = Double.parseDouble(ta.getText());
			double c = 1/Math.tanh(Math.toDegrees(a));
			
			tr.setText(Double.toString(c));
		}
		else if(ae.getSource() == sigmaab)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double sum = 0;
			for(double i = a;i <= b;i++)
			{
				sum = sum+i;
			}
			tr.setText(Double.toString(sum));
		}
		else if(ae.getSource() == piab)
		{
			double a = Double.parseDouble(ta.getText());
			double b = Double.parseDouble(tb.getText());
			double mul = 1;
			for(double i = a;i <= b;i++)
			{
				mul = mul*i;
			}
			tr.setText(Double.toString(mul));
		}
		else if(ae.getSource() == dtob)
		{
			double a = Double.parseDouble(ta.getText());
			//double c = Math.pow(a,2);
			/*double n;
			double x = 0;
			if(a == 0)
			{
				x = 0;
			}
			else if(a == 1)
			{
				x = 1;
			}
			else
			{
				while(a > 1)
				{
					n = a % 2;
					if(x == 0)
					{
						
					}
					x = x+n;
					x = x*10;
					a = a / 2;
				}
			}*/
			tr.setText(Double.toHexString(a));
		}
		else if(ae.getSource() == exit)
		{
			System.exit(0);
		}
	}
}

class Calculator
{
	public static void main(String[] args)
	{
		Awt ob = new Awt();
		
		/*ob.setSize(300,500);
		ob.setVisible(true);*/
	}
}