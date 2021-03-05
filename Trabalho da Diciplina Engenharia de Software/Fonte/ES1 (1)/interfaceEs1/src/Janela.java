import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


	public class Janela{
		
		public static void main(String[] args) {
			
			JFrame frame = new JFrame("orthokon");
			frame.setSize(850,850);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
			Ortokhon ortokhon = new Ortokhon();
			ortokhon.setBounds(0,0,800,800);
			frame.add(ortokhon);
			
			frame.addMouseListener(ortokhon);
			
		}
		
	
		
		
	}
	
	
	
