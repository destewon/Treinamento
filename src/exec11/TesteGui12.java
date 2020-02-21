package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteGui12 {
	
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JList list;
	private JLabel label;
	private JScrollPane scroll;
	private String[] diaSemana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado"};
	
	
	public void iniciaGui() {
		janela = new JFrame();
		list = new JList(diaSemana);
		painelDaJanela = (JPanel) janela.getContentPane();
		label = new JLabel("CTRL para multi seleções",JLabel.CENTER);
		scroll = new JScrollPane(list);
		
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				label.setText((String) list.getSelectedValue());
			}
		});
		
		scroll.setBounds(10, 60, 300, 90);
		
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.BLACK);
		label.setBounds(10, 10, 300, 30);
		
		painelDaJanela.setLayout(null);
		painelDaJanela.add(label);
		painelDaJanela.add(scroll);
		
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);
		janela.setResizable(false);
		
		
	}
	
	

	public static void main(String[] args) {
		new TesteGui12().iniciaGui();

	}

}
