package exec5;

import javax.swing.JOptionPane;
/**
 * Classe criada para fazer verificações no ato de alugar-se um filme em uma locadora
 * @author amendes
 * @since 12/02/2020
 * @version 0.1
 */

import java.text.DecimalFormat;





public class AlugaFilme {
	
	
	
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");

	double aluguelDiario = 5.50;
	double valorPago = 0;
	int qtdeDiasAlugados = 7;
	String disponibilidade = "";
	String filmes = "";
	boolean filmeInceptionDisponivel = true;
	boolean filmeStolenDisponivel = false;
	//double totalAluguel=0;
	
	public AlugaFilme(){
		
		verificarDisponibilidade(recebeFilme());
		exibeTudo();
		
	}
	
	public int recebeFilme() {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("1 - Inception\n2 - Stolen"));
		if (escolha==1) {
			return 1;
		}else{
			return 2;
		}
		
	}

	public void verificarDisponibilidade(int dado) {
		int filme = recebeFilme();
		switch (filme) {
			case 1:
				if (filmeInceptionDisponivel) {
					JOptionPane.showMessageDialog(null, "Disponivel");
				} else {
					JOptionPane.showMessageDialog(null, "Indisponivel");
			}
			break;
			case 2:
				if (filmeStolenDisponivel) {
					JOptionPane.showMessageDialog(null, "Disponivel");
				} else {
					JOptionPane.showMessageDialog(null, "Indisponivel");
				}
			break;
		    default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
			

		}

	}

	// this.valorPago = Double.parseDouble(JOptionPane.showInputDialog("insira um
	// filme"));

	// JOptionPane.showMessageDialog(null, (aluguelDiario*qtdeDiasAlugados));

	double totalAluguel = (aluguelDiario * qtdeDiasAlugados);

	public void exibeTudo() {
		System.out.println("o total é: " + df.format(totalAluguel).replace('.', ','));
		JOptionPane.showMessageDialog(null, "o total é: " + df.format(totalAluguel).replace('.', ','));

	}

	public static void main(String[] args) {

		new AlugaFilme();
		
		

	}

}
