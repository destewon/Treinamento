package teste;

import javax.swing.*;

/**
 * Classe responsável por efetuar o controle de locação de filme
 * @author dmunhoz
 * @since 12/02/2020
 * @version 0.1
 */
public class AlugaFilme {
	
	double valorAluguelDiario;
	double valorPago;
	int qtdeDiasAlugado;
	String filmeAlugado;
	boolean filmeInceptionDisponivel = true;
	boolean filmeStolenDisponivel = true;
	
	public AlugaFilme() {
		processar();
	}
	
	public void processar() {
		int filmeEscolhido = escolhaFilme();
		if (verificaDisponibilidade(filmeEscolhido)) {
			System.out.println("Filme Disponivel");
			calculaValor(quantidadeDias(),retornaValor(filmeEscolhido),valorPago());
		}else {
			System.out.println("Filme Indisponivel");			
		}
	}

	public int escolhaFilme() {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe o filme desejado: "));
		if (escolha == 1) {
			return 1;
		}else {
			return 2;
		}
	}
	
	public int quantidadeDias() {
		return qtdeDiasAlugado = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias: "));
	}
	
	public double valorPago() {
		return valorPago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
	}
	
	public double retornaValor(int filme) {
		if (filme == 1) {
			return valorAluguelDiario = 5;
		}else {
			return valorAluguelDiario = 3;			
		}
	}
	
	public void calculaValor(int dias, double valorFilme, double valorCliente) {
		double total = dias * valorFilme;
		if (total == valorCliente) {
			System.out.println("Filme alugado com sucesso!");
		}else if (total > valorCliente) {
			System.out.println("Valor pago insuficiente");
		}else {
			double troco = valorCliente - total;
			System.out.println("Filme alugado com sucesso! Troco: " + troco);
		}
	}


	public boolean verificaDisponibilidade(int escolha) {
		
		if (escolha == 1) {
			if (filmeInceptionDisponivel) {
				return true;
			}else{
				return false;
			}
		}else{
			if (filmeStolenDisponivel) {
				return true;
			}else{
				return false;
			}			
		}
	}
		
	
	public static void main(String[] args) {
		new AlugaFilme();
		
	}

}
