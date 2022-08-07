import java.applet.Applet;
import java.awt.Graphics;

public class practicel_5 extends Applet{
	
	public void paint(Graphics g){
		
		int x=0;
		int y=0;
		String msg = "";
		
		x = Integer.parseInt(getParameter("xPosition"));
		y = Integer.parseInt(getParameter("yPosition"));
		msg = getParameter("msg");
		
		g.drawString(msg,x,y);
	}
}