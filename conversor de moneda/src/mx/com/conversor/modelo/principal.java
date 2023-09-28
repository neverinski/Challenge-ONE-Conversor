package mx.com.conversor.modelo;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		while(flag) {
			
			try {
				String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion","Menu", JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
			
				switch (opciones) {
				
				case "Conversor de Moneda":
					String inputMoneda = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir");
					
					//Verificar validez del input
					if (verificar(inputMoneda)) {
						
						double cantidad = Double.parseDouble(inputMoneda);
						
						//Seleccion de moneda
						String tipo = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero","Monedas", JOptionPane.QUESTION_MESSAGE,null,new Object[] {"De Pesos a Dólares", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sul-coreano"}, "Seleccion")).toString();
						conversorMoneda cm = new conversorMoneda();
						
						switch(tipo) {
						case "De Pesos a Dólares":
							cm.convertirPesosDolares(cantidad);
							break;
						case "De Pesos a Euros":
							cm.convertirPesosEuros(cantidad);
							break;
						case "De Pesos a Libras Esterlinas":
							cm.convertirPesosLibras(cantidad);
							break;
						case "De Pesos a Yen Japonés":
							cm.convertirPesosYen(cantidad);
							break;
						case "De Pesos a Won sul-coreano":
							cm.convertirWonPesos(cantidad);
							break;
						}
					}
					break;
				case "Conversor de Temperatura":
					String inputTemperatura = JOptionPane.showInputDialog("Ingrese la temperatura que deseas convertir");
					
					//Verificar validez del input
					if (verificar(inputTemperatura)) {
						
						double cantidad = Double.parseDouble(inputTemperatura);
						
						//Seleccion de escala temperatura
						String tipo = (JOptionPane.showInputDialog(null, "Elije la escala de temperatura a la que deseas convertir","Temperatura", JOptionPane.QUESTION_MESSAGE,null,new Object[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Kelvin a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit"}, "Selección")).toString();
						conversorTemperatura ct = new conversorTemperatura();
						
						switch(tipo) {
						case "De Celsius a Fahrenheit":
							ct.convertirCelsiusFarenheit(cantidad);
							break;
						case "De Celsius a Kelvin":
							ct.convertirCelsiusKelvin(cantidad);
							break;
						case "De Fahrenheit a Celsius":
							ct.convertirFarenheitCelsius(cantidad);
							break;
						case "De Kelvin a Celsius":
							ct.convertirKelvinCelsius(cantidad);
							break;
						case "De Fahrenheit a Kelvin":
							ct.convertirFarenheitKelvin(cantidad);
							break;
						case "De Kelvin a Fahrenheit":
							ct.convertirKelvinFarenheit(cantidad);
							break;
						}
					}
					break;
				} //End of all switchs
			
			
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Operación cancelada");
				break;
			}
			
			//Continuar convirtiendo?
			String[] continuar = {"Yes", "No", "Cancel"};
			int seleccion = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Advertencia",
			        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, continuar, continuar[0]);
		
			if (seleccion == JOptionPane.YES_OPTION) {
				flag = true;
			} else if (seleccion == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				flag = false;
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				flag = false;
			}
			
		} //End while
	} //End main

	
	//Funcion para validar input
	private static boolean verificar (String cantidad) {
		try {
			double numero = Double.parseDouble(cantidad);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
			return false;
		}
	}
	
}//End class
