import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class practicel_4 extends Applet{
	public void init(){
		//Here we chenge the default grey color background of an 
		//applet to yellow background.
		setBackground(Color.RED);
		resize(500,500);
	}
	public void paint (Graphics g){
		g.drawString("Applet background example",0,50);
	}
}