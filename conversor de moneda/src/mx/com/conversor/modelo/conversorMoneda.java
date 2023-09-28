package mx.com.conversor.modelo;

import javax.swing.JOptionPane;

public class conversorMoneda {
	
	private double resultado;

	public void convertirPesosDolares(double cantidad) {
		this.resultado = Math.round(cantidad/17.08);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " Dólares");
	}
	
	public void convertirPesosEuros(double cantidad) {
		this.resultado = Math.round(cantidad/18.77);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " Euros");
	}

	public void convertirPesosLibras(double cantidad) {
		this.resultado = Math.round(cantidad/21.74);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " Libras Esterlinas");
	}

	public void convertirPesosYen(double cantidad) {
		this.resultado = Math.round(cantidad/0.12);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " Yens");
	}

	public void convertirWonPesos(double cantidad) {
		this.resultado = Math.round(cantidad/0.013);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " Wons");
	}
	
}
