/**
 * Classe para contar notas de saque
 * @author amendes
 * @since 17/02/2020
 * @version 0.1
 */

package exec8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class CaixaEletronico {
	// TODO Auto-generated method stub
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	int dinheiro = 0;
	int notas[] = { 2, 5, 10, 20, 50 };
	// int notas[]= {50,20,10,5,2};
	int contNotas = 0;
	String message = "";
	int qtdeNotas[];
	String resposta = "SIM";
	boolean sim = false;

	public CaixaEletronico() {

		processamento();

	}

	public void processamento() {
		
			while (resposta.equals("SIM") || dinheiro != 0) {
				sacar();
			}
		
	}

	public void mensagemErro() {
		JOptionPane meuJOPane = new JOptionPane("Valor Invalido!!!!");// instanciando o JOptionPane
		final JDialog dialog = meuJOPane.createDialog(null, "WARNING");// aqui uso um JDialog para manipular
																		// meu JOptionPane
		dialog.setModal(true);
		Timer timer = new Timer(2 * 1000, new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				dialog.dispose(); // o evento(no caso fechar o meu JDialog)
			}
		});
		timer.start();
		dialog.setVisible(true);
		timer.stop();
	}

	public void sacar() {

		qtdeNotas = new int[5];

		try {
			dinheiro = Integer.parseInt(
					JOptionPane.showInputDialog("Insira a quantia desejada").replace(" ", "").replace(",", "."));

			if (dinheiro == 1 || dinheiro == 3 || dinheiro < 0) {
				mensagemErro();
			} else {
				message = "Dinheiro requisitado: " + dinheiro + " Reais\n\n" + "Quantidade de notas a retirar: \n";

				boolean count = false;
				if (dinheiro % 50 == 0) {
					qtdeNotas[4] = dinheiro / 50;
					dinheiro = 0;
					/*
					 * if (dinheiro == 1||dinheiro == 3) { qtdeNotas[4] -= 1;
					 * 
					 * }
					 */

				} else {
					while (dinheiro != 0 && dinheiro != 1 && dinheiro != 3) {

						for (int i = 0; i < notas.length; i++) {
							if (dinheiro > 50 && dinheiro % 50 != 1 && dinheiro % 50 != 3) {
								qtdeNotas[4] = dinheiro / 50;
								dinheiro = dinheiro % 50;
							} else {
								if (i == 0) {
									dinheiro = dinheiro - notas[i];
									qtdeNotas[i]++;

								} else {
									if ((dinheiro > 0 && qtdeNotas[i] < qtdeNotas[i - 1]
											&& (dinheiro - notas[i]) > 0)) {
										dinheiro = dinheiro - notas[i];
										qtdeNotas[i]++;

									} else {

										count = true;
										break;

									}
								}

							}

						}
					}
					if (dinheiro == 1) {
						qtdeNotas[1] -= 1;
						qtdeNotas[0] += 3;
					}
					if (dinheiro == 3) {
						qtdeNotas[1] += 1;
						qtdeNotas[0] -= 1;
					}
				}
				if (qtdeNotas[1] > qtdeNotas[2] && qtdeNotas[1] - 2 >= 0) {
					qtdeNotas[1] = qtdeNotas[1] - 2;
					qtdeNotas[2] += 1;
				}
				if (qtdeNotas[2] > qtdeNotas[3] && qtdeNotas[2] - 2 >= 0) {
					qtdeNotas[2] = qtdeNotas[2] - 2;
					qtdeNotas[3] += 1;
				}
				if (qtdeNotas[0] >= 5 && qtdeNotas[0] - 5 >= 0) {
					qtdeNotas[0] = qtdeNotas[0] - 5;
					qtdeNotas[2] += 1;
				}
				for (int i = 0; i < notas.length; i++) {
					message = message + "\n" + qtdeNotas[i] + " Notas de " + notas[i] + " Reais";
					message = message + "\n";
				}

				message = message + "\n\nDeseja sacar mais algum valor?";
				System.out.println(message);
				JTextArea textArea = new JTextArea(message);
				JScrollPane scrollPane = new JScrollPane(textArea);
				textArea.setLineWrap(true);
				scrollPane.setWheelScrollingEnabled(true);
				textArea.setEditable(false);
				// scrollPane.setBackground(Color.BLACK);
				// textArea.setEnabled(false);
				// textArea.setBackground(Color.black);
				// textArea.setSelectedTextColor(Color.WHITE);
				textArea.setFont(new Font("Consolas", Font.BOLD, 16));
				textArea.setForeground(Color.BLACK);

				// textArea.setPreferredSize(new Dimension(500,500));
				scrollPane.setPreferredSize(new Dimension(300, 330));
				int resposta = Integer.parseInt(JOptionPane.showInputDialog(null, scrollPane, "Extrato", JOptionPane.YES_NO_OPTION));
				boolean i = false;
				while (!i) {
				switch (resposta) {
				case 1:
					processamento();
					i=true;
					this.resposta="SIM";
					
					break;
				case 2:
					//resposta = Integer.parseInt(JOptionPane.showInputDialog("Deseja dijitar outro valor\n1 - sim\n2 - não"));
					i=true;
					this.resposta="NÃO";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida");
					dinheiro = 0;
					i=false;
				}
				}
				dinheiro = 0;
			}
		} catch (NumberFormatException e) {
			mensagemErro();
			processamento();
		}

	}

	public static void main(String[] args) {
		new CaixaEletronico();

	}

}
