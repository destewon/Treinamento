package exec11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import sun.net.www.content.audio.x_aiff;

public class TesteGui9 {

	private JFrame janela;
	private JPanel painelDaTela;
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;

	public void iniciaGui() {

		janela = new JFrame();
		painelDaTela = (JPanel) janela.getContentPane();
		painel1 = new JPanel();
		painel2 = new JPanel();
		painel3 = new JPanel();
		painel4 = new JPanel();

		// configuração do jpanel 1
		painel1.setBounds(4, 6, 200, 100);
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		painel1.setBorder(BorderFactory.createEtchedBorder());

		// configuração do jpanel 2
		painel2.setBounds(200, 6, 200, 100);
		painel2.setLayout(new BorderLayout(0, 0));
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());

		// configuração do jpanel 3
		painel3.setBounds(3, 109, 200, 100);
		painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
		painel3.setBorder(BorderFactory.createLoweredBevelBorder());

		// configuração do jpanel 3
		painel4.setBounds(208, 110, 200, 100);
		painel4.setLayout(new GridLayout(1, 0, 0, 0));
		painel4.setBorder(new TitledBorder("Promoção!!!"));

		// configurações od painel da janela
		painelDaTela.setLayout(null);
		painelDaTela.add(painel2);
		painelDaTela.add(painel1);
		painelDaTela.add(painel3);
		painelDaTela.add(painel4);

		// configurações da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(new Dimension(422, 246));
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TesteGui9().iniciaGui();
	}

}
