package cajero;

import javax.swing.JOptionPane;

public class Cajero {

	public static void main(String[] args) {
		
		int saldoIni = 1000, dinero = 0 ;
		char letra;
		
		
		
	
		do  {
			
			letra=JOptionPane.showInputDialog("Digita '+' para ingresar  '-' para restar y 's' para salir").charAt(0);
			
			
			
			if (letra =='s'|| letra== 'S'){
				JOptionPane.showConfirmDialog(null, "Haz salido del sistema");
			}
			else if(letra=='+') {
				dinero=Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad"));
				saldoIni += dinero; JOptionPane.showConfirmDialog(null, "Tu saldo actual es: "+saldoIni);
			}
			else if(letra=='-') {
				dinero=Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad"));
				
					if(saldoIni>=dinero) {
						saldoIni -= dinero; JOptionPane.showConfirmDialog(null, "Tu saldo actual es: "+saldoIni);
					}
					else {JOptionPane.showConfirmDialog(null, "Digita una cantidad válida");
					}
			}
			
						
			
		}while(letra =='+' || letra =='-');
	
		
		

}}
