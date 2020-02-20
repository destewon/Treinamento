package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class TesteGui8 {
	
	private JFrame janela;	
	private JPanel painelDaTela;
	private JLabel jtfSenha;
	private JPasswordField jpwSenha;
	
	public void iniciaGui() {
		janela = new JFrame("Exemplo de Senha");
		jtfSenha = new JLabel();
		jpwSenha = new JPasswordField();
		painelDaTela = (JPanel) janela.getContentPane();
		
		jtfSenha.setText("Senha");
		jtfSenha.setBounds(10, 40, 40, 20);
		
		jpwSenha.setBounds(60, 40, 100, 20);
		
		painelDaTela.setLayout(null);
		painelDaTela.add(jtfSenha);
		painelDaTela.add(jpwSenha);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(300, 300);
		janela.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new TesteGui8().iniciaGui();
		
		

	}

}
