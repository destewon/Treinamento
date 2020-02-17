/**
 * locadora de carros
 * @author amendes
 * @since 14/02/2020
 * @version 0.1
 */
package exec7;

import javax.swing.JOptionPane;

public class Carro {
	
	String modeloDoCarro;
	String placaDoCarro;
	int velocidadeMaxima;
	String combustivel;
	double valor;
	String cor;
	boolean vendido;
	boolean vetorDisponivel=true;
	
	public Carro() {
		}

	public Carro(String modeloDoCarro, String placaDoCarro, int velocidadeMaxima, String combustivel, double valor,String cor,boolean vendido,boolean vetorDisponivel) {		
		this.modeloDoCarro = modeloDoCarro;
		this.placaDoCarro = placaDoCarro;
		this.velocidadeMaxima = velocidadeMaxima;
		this.combustivel = combustivel;
		this.valor = valor;
		this.cor = cor;
		this.vendido=vendido;
		this.vetorDisponivel=vetorDisponivel;
	}
	
	/*
	 * public void exibirTudo() { System.out.println(modeloDoCarro);
	 * System.out.println(placaDoCarro); System.out.println(velocidadeMaxima);
	 * System.out.println(combustivel); System.out.println(valor);
	 * 
	 * 
	 * }
	 */
	
	
	
	
	
	
	}


//-----------------------------------------------------------------------------------------------------------------------------------------
