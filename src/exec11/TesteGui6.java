package exec11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGui6 {
	
	private JFrame janela;	
	private JPanel painelDaTela;
	private JComboBox cbox;
	private String[] equipamentos = {"Monitor","Teclado","Mouse","Scanner","Moldem"};
	
	
	
	
	public void iniciaGui6() {
		
		//instanciar
		janela = new JFrame();
		painelDaTela = (JPanel) janela.getContentPane();
		cbox=new JComboBox(equipamentos);
		
		
		//configuração do combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		
		
		//configurações do painel da tela
		painelDaTela.setLayout(null);
		painelDaTela.add(cbox);
		
		//configurações
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400, 300);
		janela.setVisible(true);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TesteGui6().iniciaGui6();
	}

}
