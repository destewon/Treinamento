package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class TesteGui3 {
	
	//declarar os componentes de tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;
	
	public TesteGui3() {
		iniciaGui();
	}
	
	
	public void iniciaGui() {
		//cria a janela (instancia)
		janela = new JFrame();
		//cria a area de textos
		area = new JTextArea();
		area.setEditable(false);
		//cria o botão 1
		botao1 = new JButton("Clique Aqui");
		//adicionar o metodo desenvolvido na classe texto 
		botao1.addActionListener(new textoListener());
		
		//cria o segundo botão
		botao2 = new JButton("Troca cor");
		//adicionar o metodo desenvolvido na classe cor 
		botao2.addActionListener(new corListener());
		
		
		//campo para digitar texto
		campo = new JTextField();
		
		//adicionar o metodo desenvolvido na classe texto 
		campo.addActionListener(new textoListener());
		
		//adicionar o botão2 ao painel da janela
		
		janela.getContentPane().add(BorderLayout.EAST,botao2);
		//adicionar o botão1 ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH,botao1);
		
		//adicionar a area ao painel
		janela.getContentPane().add(BorderLayout.CENTER,area);
		
		//Adicionar JTextFiel
		janela.getContentPane().add(BorderLayout.NORTH,campo);
		
		//configurar o tamanho da tela
		janela.setSize(300, 300);
		
		//configurar a visibilidade da tela
		janela.setVisible(true);
		
		
	}
	
	public class textoListener implements ActionListener{
		//@Override
		public void actionPerformed(ActionEvent e) {
			if (campo.getText()!=null) {
				
			
			area.append(campo.getText()+"\n");
			campo.setText("");
			}
		}
		
		
		
		
	}
	
	public class corListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//se o fundo da JTextArea for neutro troca para preto
			if(area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);
			}else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TesteGui3();
	}

}
