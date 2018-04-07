import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;


public class Finestra extends Frame {
	Image im;
	Graphics g;
	int AMPLE=600,ALT=500;
	Joc j;
	public static void main(String[] args) {
		//System.out.println("hola");
		new Finestra();
	}
	Finestra(){
		super("Finestra");
		setVisible(true);
		setSize(AMPLE,ALT);
		im=this.createImage(AMPLE, ALT);
		g=im.getGraphics();
		j=new Joc(this);
		j.playing();
		/*for(y=100;y<=600;y++) {
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}
	public void update(Graphics g) {
		paint(g);
	}
	public void paint(Graphics g) {
		g.drawImage(im, 0,0, null);
		/*g.setColor(Color.WHITE);
		g.fillRect(0, 0, 600,500);
		g.setColor(Color.BLUE);
		g.drawLine(50, 50, 200, y);*/
	}

}


/*
 * for(int i=100;i<=1000;i++) {
			y=i;
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
