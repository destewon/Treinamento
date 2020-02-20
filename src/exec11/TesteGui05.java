package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui05 {
	
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;	
	private JButton btnResposta;
	private JPanel painelDaTela;
	
	public void iniciaGui() {
		
		//criar as instancias
		janela = new JFrame("Exemplo de JBox");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnResposta = new JButton();
		painelDaTela = (JPanel) janela.getContentPane();
		
		//configurações da label escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento");
		lblEscolha.setBounds(42, 15, 200, 20);
		
		//configurações da label escolha
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42, 230, 300, 20);
		
		//configurar check box1
		cbCC.setText("Cartão de Crédito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);
		
		//configurar check box2
		cbDB.setText("Deposito Bancario");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);
				
		//configurar check box3
		cbBB.setText("Boleto Bancario");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);
		
		//configurar o botão
		btnResposta.setText("Resposta:");
		btnResposta.setBounds(146, 196, 130, 28);
		
		//configuração da ação do botão
		btnResposta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				opcaoSelecionada();
			}
		});
		
		
		
		//adicionar components no painel
		painelDaTela.setLayout(null);
		painelDaTela.add(lblEscolha);
		painelDaTela.add(cbCC);
		painelDaTela.add(cbDB);
		painelDaTela.add(cbBB);
		painelDaTela.add(btnResposta);
		painelDaTela.add(lblResposta);
		
		
		//configurações de tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);
		
		
		
	}//fim iniciaGui
	
	public void opcaoSelecionada() {
		String resposta = "";
		
		if(cbBB.isSelected()) {
			resposta+=cbBB.getText();
		}
		if(cbCC.isSelected()) {
			resposta+=cbCC.getText();
		}
		if(cbDB.isSelected()) {
			resposta+=cbDB.getText();
		}
		
		//troca a cor da fonte para vermelhor
		
		
		if (!resposta.equals("")) {
		
		lblResposta.setText(resposta);
		}else{
			
			lblResposta.setText("Resposta:");
			
		}//fim tratamento nenhuma radio button ticada
		resposta="";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TesteGui05().iniciaGui();
	}//fim do main

}//fim da classe
