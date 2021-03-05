import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ortokhon extends JPanel implements MouseListener {
	
	int matriz [][];
	
	public Ortokhon() {
		
		matriz = new int[4][4];
		
		for(int lin = 0; lin <4; lin++) {
			
			for(int col = 0; col<4; col++) {
				System.out.println(matriz[lin][col]);
			}
			System.out.println();
		}
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 800, 800);
		
		g.setColor(Color.black);
		
		g.drawLine(0,000,800,000);
		g.drawLine(0,200,800,200);
		g.drawLine(0,400,800,400);
		g.drawLine(0,600,800,600);
		g.drawLine(0,800,800,800);
		
		
		
		g.drawLine(000, 0, 000, 800);
		g.drawLine(200, 0, 200, 800);
		g.drawLine(400, 0, 400, 800);
		g.drawLine(600, 0, 600, 800);
		g.drawLine(800, 0, 800, 800);
		
		
		
		g.fillOval(50, 50, 100, 100);
		g.fillOval(250, 50, 100, 100);
		g.fillOval(450, 50, 100, 100);
		g.fillOval(650, 50, 100, 100);
		
		
		g.setColor(Color.YELLOW);	
		g.fillOval(50,650,100,100);
		g.fillOval(250,650,100,100);
		g.fillOval(450,650,100,100);
		g.fillOval(650,650,100,100);
		
	for(int lin = 0; lin <4; lin++) {
			
			for(int col = 0; col<4; col++) {
				if(matriz[lin][col]==1) {
					g.drawString("o",75 + col*200, 125 + lin*200);
				}
				else if(matriz[lin][col]==2) {
					
					g.drawString("x",75 + col*200,125 + lin*200);
					
				}
			
			}
			
		}
		
		
	
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	int linha = e.getY();
	int coluna = e.getX();
	  System.out.println("Clicou na linha:" + linha);
	  System.out.println("Clicou na coluna:" + coluna);
	  
	 
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
