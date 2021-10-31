package cronometro_Hilo;

import javax.swing.JLabel;

public class Cronometro extends Thread {

	JLabel eti;
	
	public Cronometro(JLabel cronometro) {
		this.eti=cronometro;
	}
	
	public void run() {
		try {
			int x=0;
			
			while(VentanaCronometro.iniciaHilo) {
				Thread.sleep(1000);
				System.out.println(x);
				ejecutarHiloCronometro(x);
				x++;
			}
			
		} catch (Exception e) {
			System.out.println("Exception en el hilo: "+ e.getMessage());
		}
	}

	private void ejecutarHiloCronometro(int x) {
		System.out.println(x+" - "+ Thread.currentThread().getName());
		VentanaCronometro.segundo++;
		
		if(VentanaCronometro.segundo>59) {
			VentanaCronometro.segundo=0;
			VentanaCronometro.minutos++;
		}
		
		String textSeg="",textMin="", textHora="";
		textSeg+=VentanaCronometro.segundo;
		
		String reloj= textHora+":"+textMin+":"+textSeg;
		eti.setText(reloj);
		
	}
	
}
