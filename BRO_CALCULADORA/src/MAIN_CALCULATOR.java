import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MAIN_CALCULATOR {
	public static void main(String[] args) {
		
		
		JLabel label= new JLabel();
		JFrame frame = new JFrame();
		ImageIcon imagen= new ImageIcon("logoKali.png");
		Border border= BorderFactory.createLineBorder(Color.MAGENTA,3);
		
		label.setText("Bro do u even code?");
		
		label.setIcon(imagen);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(255,255,255));
		label.setFont(new Font("MV Boli", Font.PLAIN,20));
		label.setIconTextGap(20);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.BOTTOM); //Set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100,30,100,100);
		
		frame.setTitle("Calculadora KALI");
		//frame.setSize(600,680);
		//frame.setLayout(null);
		
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setIconImage(imagen.getImage());
		frame.getContentPane().setBackground(new Color(0x123456));
		
		frame.add(label);
		frame.pack();
		
	
	}
	
}
