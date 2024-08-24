package br.com.fiap.bean;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.fiap.main.Carro;

public class TesteArrayList {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j)
				);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Carro> listaCarros = new ArrayList<Carro>();
		
		Carro objCarro = null;
		
		do {
			objCarro = new Carro();
			objCarro.setCodigo(inteiro("Informe o codigo: "));
			objCarro.setMarca(texto("Digite a marca: "));
			objCarro.setModelo(texto("Digite o modelo: "));
			objCarro.setValor(real("Digite o valor do carro: "));
			
			listaCarros.add(objCarro);
			
		} while (JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais carros? ", 
				"Cadastro de carros!", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (Carro carro : listaCarros) {
			System.out.println(
					"\n\nCódigo: " + carro.getCodigo() +
					"\nMarca: " + carro.getMarca() +
					"\nModelo: " + carro.getModelo() + 
					"\nValor: " + carro.getValor()
					);
			
		}
			
	}

}
