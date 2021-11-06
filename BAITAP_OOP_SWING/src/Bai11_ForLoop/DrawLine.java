package Bai11_ForLoop;

import java.awt.Graphics2D;

public class DrawLine {
	public Graphics2D getGr() {
		return gr;
	}

	public void setGr(Graphics2D gr) {
		this.gr = gr;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	Graphics2D gr;
	Line line;
	
	public DrawLine() {
		super();
	}

	public DrawLine(Graphics2D gr, Line line) {
		super();
		this.gr = gr;
		this.line = line;
	}
	
	public void veDuongThang() {
		gr.drawLine(line.getBeginX(), line.getBeginY(), line.getEndX(), line.getEndY());
		
	}
}
