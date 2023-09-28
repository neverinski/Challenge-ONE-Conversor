package mx.com.conversor.modelo;

import javax.swing.JOptionPane;

public class conversorTemperatura {
	
	private double resultado;

	public void convertirCelsiusFarenheit(double cantidad) {
		this.resultado = Math.round(((cantidad*9)/5) + 32);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " °F");
	}

	public void convertirCelsiusKelvin(double cantidad) {
		this.resultado  = Math.round(cantidad + 273.15);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " K");
	}
	
	public void convertirFarenheitCelsius(double cantidad) {
		this.resultado = Math.round(((cantidad - 32)*5)/9);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " °C");
	}
	
	public void convertirKelvinCelsius(double cantidad) {
		this.resultado = Math.round(cantidad - 273.15);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " °C");
	}
	
	public void convertirFarenheitKelvin(double cantidad) {
		this.resultado = Math.round(((cantidad - 32)*5)/9 + 273.15);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " K");
	}
	
	public void convertirKelvinFarenheit(double cantidad) {
		this.resultado = Math.round(((cantidad - 273.15)*9)/5 + 32);
		JOptionPane.showMessageDialog(null, "Tienes " + this.resultado + " °F");
	}
	
}

