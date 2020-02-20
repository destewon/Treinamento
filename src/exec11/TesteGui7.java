package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TesteGui7 {
	
	
	private JFrame janela;	
	private JPanel painelDaTela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu;
	private JMenuItem itemMenu2;
	
	public void iniciaGui() {
		
		//criar instancias
		janela = new JFrame("Exemplo de menu");		
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Menu 1");
		menu02 = new JMenu("Menu 2");
		itemMenu = new JMenuItem("Item menu 1");
		itemMenu2 = new JMenuItem("Item menu 2");
		painelDaTela = (JPanel) janela.getContentPane();
		
		//apresentar menus na barra de menu
		barraMenu.add(menu01);
		barraMenu.add(menu02);
		
		
		//colocar item menu no menu
		menu01.add(itemMenu);
		menu02.add(itemMenu2);
		
		
				
				
		
		
		itemMenu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TesteGui4().iniciaGui();
				
				
			}
		});
		
		itemMenu2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new TesteGui05().iniciaGui();
				janela.dispose();
				
			}
		});
		
		
		//painel 
		painelDaTela.setLayout(null);
		//painelDaTela.add(barraMenu);
		
		
		
		
		//config tela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(300, 300);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TesteGui7().iniciaGui();
	}

}
