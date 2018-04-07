import java.awt.Color;
import java.awt.Graphics;

class Joc {
	Finestra f;
	//int y;
	Cotxe c1[];
	Joc(Finestra f){
		this.f=f;
	}
	void playing() {
		initicalitzaJoc();
		do {
			moviments();
			detectaColisions();
			pintarPantalla(f.g);
			
			f.repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}while(true);
	}
	private void detectaColisions() {
		// TODO Auto-generated method stub
		
	}
	private void moviments() {
		// TODO Auto-generated method stub
		/*y++;
		if (y>=600) y=50;*/
		for(int i=0;i<c1.length;i++)
			c1[i].moviment();
		
	}
	private void initicalitzaJoc() {
		c1=new Cotxe[3];
		c1[0]=new Cotxe(f,100,100);
		c1[1]=new Cotxe(f,100,200,3);
		c1[2]=new Cotxe(f,100,300,6);
		// TODO Auto-generated method stub
		
	}
	void pintarPantalla(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 600,500);
		/*g.setColor(Color.BLUE);
		g.drawLine(50, 50, 200, y);*/
		for(int i=0;i<c1.length;i++)
			c1[i].pinta(g);
	}
	
}