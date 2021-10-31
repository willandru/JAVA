package cronometro_Hilo;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCronometro extends JFrame implements ActionListener{

	private JLabel label;
	private JButton btnIniciar;
	private JButton btnDetener;
	
	static int hora=0, minutos=0, segundo=0;
	static boolean iniciaHilo=true;
	boolean corriendo= false;
	
	
	public VentanaCronometro() {
		initialize();
		setSize(228,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		}
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label= new JLabel("00:00:00");
		label.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
		label.setBounds(47,11,137,45);
		getContentPane().add(label);
		
		btnIniciar= new JButton("Inicia");
		btnIniciar.setBounds(119,54,89,23);
		btnIniciar.addActionListener(this);
		getContentPane().add(btnIniciar);
		
		btnDetener= new JButton("Para");
		btnDetener.setBounds(10,54,89,23);
		btnDetener.addActionListener(this);
		getContentPane().add(btnDetener);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnIniciar) {
			if(corriendo== false) {
				iniciaHilo=true;
				corriendo=true;
				iniciarHiloCronometro();
			}
		}
		if (e.getSource()== btnDetener) {
			corriendo=false;
			iniciaHilo=false;
		}
	}
	private void iniciarHiloCronometro() {
		
		if(iniciaHilo==true) {
			System.out.println("Inicia el hilo");
			Cronometro miCronometro= new Cronometro(label);
			miCronometro.run();
		}
		
	}
	
}
