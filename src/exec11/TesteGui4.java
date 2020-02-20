package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class TesteGui4 {
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDesquitado;
	private JButton btnVerificar;
	private JPanel painelDaTela;
	private ButtonGroup grpRadio;
	
	public void iniciaGui(){
		
		//criar as instancias
		janela = new JFrame("Exemplo de Radio Buttom");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDesquitado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaTela = (JPanel) janela.getContentPane();
		
		//cria o objeto do grupod e botoes
		grpRadio = new ButtonGroup();
		
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDesquitado);
		
		
		//Configurações da label
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil:");
		lblEscolha.setBounds(82,18,230,18);
		
		//configuração do botão solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80,50,100,24);
		
		//configuração do botão solteiro
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80,75,100,24);
		
		//configuração do botão solteiro
		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(80,100,100,24);
		
		//configuração do botão solteiro
		rbtDesquitado.setText("Desquitado");
		rbtDesquitado.setBounds(80,125,150,24);
		
		//configurações do botão
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126,176,83,28);
		
		//adicionar ação do botão
		btnVerificar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				//Verificar qual radio button foi selecionada
				opcaoSelecionada();
				
			}//fecha action listener
		});//termina configuração do botão
		
		
		
		//configurações do painel da tela
		painelDaTela.setLayout(null);
		painelDaTela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaTela.add(lblEscolha);
		painelDaTela.add(rbtSolteiro);
		painelDaTela.add(rbtCasado);
		painelDaTela.add(rbtViuvo);
		painelDaTela.add(rbtDesquitado);
		painelDaTela.add(btnVerificar);
	
		
		
		//configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340,273);
		janela.setVisible(true);
		
		
	}//fim do metodo IniciaGui
		
		
	public void opcaoSelecionada() {
		String resposta = "";
		
		if(rbtSolteiro.isSelected()) {
			resposta+=rbtSolteiro.getText();
		}
		if(rbtCasado.isSelected()) {
			resposta+=rbtCasado.getText();
		}
		if(rbtViuvo.isSelected()) {
			resposta+=rbtViuvo.getText();
		}
		if(rbtDesquitado.isSelected()) {
			resposta+=rbtDesquitado.getText();
		}
		//troca a cor da fonte para vermelhor
		
		
		if (!resposta.equals("")) {
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText(resposta);
		}//fim tratamento nenhuma radio button ticada
		resposta="";
	}
		
		
		
		
		
		
		
	
	
	
	public static void main(String[] args) {
		
		new TesteGui4().iniciaGui();
		
		

	}//fim do main

}//fim da classe
