package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {

	//declarar as variaveis de referencia
	
	private static JFrame janela;
	private static JButton botao;
	
	
	public static void main(String[] args) {
		//criar uma nova tela(instancia)
		janela = new JFrame("Tela");
		//criar um novo bot�o(instancia)
		botao = new JButton("Aperte o bot�o");
		//adicionar bot�o ao painel da janela
		janela.getContentPane().add(botao);
		//configurar o tamanho da tela
		janela.setSize(300, 300);
		
		//configurar a visibilidade da tela
		janela.setVisible(true);
		//informar que a tela n�o tem layout pr� definido
		janela.getContentPane().setLayout(null);
		
		
		
		
	}

}
