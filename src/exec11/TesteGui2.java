package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {
	
	

	public static void main(String[] args) {
		
		//definir a tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Tela da Globo");
		janela.setSize(300, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		
		//definir o componente JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		
		botao.setBounds(10, 10, 100, 20);
		
		//definir o componente de rotulo
		JLabel lblnome = new JLabel();
		lblnome.setText("Nome:");
		lblnome.setBounds(10, 40, 40, 20);
		
		//definir o campo de texto
		JTextField txtnome = new JTextField();
		
		
		
		
		//adicionar os componentes
		
		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblnome);
		janela.getContentPane().add(txtnome);
		
		
		//habilitar a visibilidade da tela
		janela.setVisible(true);
		

	}

}
