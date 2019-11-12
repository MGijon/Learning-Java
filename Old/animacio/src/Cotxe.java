import java.awt.Color;
import java.awt.Graphics;


public class Cotxe {
	int x,y,v;
	int AMPLE=40,ALT=20;
	Finestra f;
	Cotxe(Finestra f,int x,int y){
		this.x=x;this.y=y;v=1;this.f=f;
	}
	Cotxe(Finestra f,int x,int y,int v){
		this.x=x;this.y=y;this.v=v;this.f=f;
	}
	void pinta(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(x, y, AMPLE, ALT);
		g.drawLine(x+AMPLE*3/4, y, x+AMPLE*3/4, y+ALT);
		
	}
	void moviment() {
		x+=v;
		if(x>f.AMPLE-AMPLE-10) x=f.AMPLE-AMPLE-10;
	}
}
