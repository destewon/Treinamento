package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import sun.nio.cs.ext.ISCII91;

public class TesteGui10 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private String[] colunas = new String[] { "UF", "Estado" };
	private String[][] dados = new String[] []{ { "SP", "São Paulo" }, { "RJ", "Rio de Janeiro" },
			{ "RN", "Rio grande do sul" }, { "PR", "Parana" } };
	
	private JLabel lblIncluirUf;
	private JLabel lblIncluirEstado;
	private JTextField jtfIncluirEstado;
	private JTextField jtfIncluirUf;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;
	
	public void iniciaGui() {
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		tabela = new JTable();
		lblIncluirUf = new JLabel("Informe UF");
		lblIncluirEstado = new JLabel("Informe Estado");
		jtfIncluirEstado = new JTextField();
		jtfIncluirUf = new JTextField();
		botaoExcluir = new JButton("Excluir");
		botaoIncluir = new JButton("Incluir");
		//painelDeScroll = (JScrollPane) janela.getContentPane();
		
		//criar a tabela, ao invés de passar os atributos direto
		//iremos colocar em um modelo de dados
		DefaultTableModel modelo = new DefaultTableModel(dados,colunas);
		tabela = new JTable(modelo);
		
		tabela.setEnabled(true);
		
		//instanciando e inserindo a tabela do stroll
		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		painelDeScroll.setBounds(10, 100, 360, 95);
		tabela.setBounds(10, 30, 300, 95);
		botaoIncluir.setBounds(75, 200, 100, 50);
		botaoExcluir.setBounds(195, 200, 100, 50);
		lblIncluirUf.setBounds(15, 20, 70, 25);
		lblIncluirEstado.setBounds(15, 55, 90, 25);
		jtfIncluirEstado.setBounds(110, 20, 50, 25);
		jtfIncluirUf.setBounds(110, 55, 260, 25);
		
		
		botaoIncluir.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent arg0) {
				adicionaLinha();
				
			}

			
		});
		
		botaoExcluir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				excluirLinha();
			}

			
		});
		
		
		//configuração do painel
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblIncluirUf);
		painelDaJanela.add(lblIncluirEstado);
		painelDaJanela.add(jtfIncluirEstado);
		painelDaJanela.add(jtfIncluirUf);
		painelDaJanela.add(botaoExcluir);
		painelDaJanela.add(botaoIncluir);
		painelDaJanela.add(painelDeScroll);
		
		
		//configurações da janela
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.setResizable(false);
				
				
		
		
	}//fim do metodo iniciaBui
	
	public void adicionaLinha() {
		// TODO Auto-generated method stub
		if (jtfIncluirUf.getText().equals("")||jtfIncluirEstado.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo UF ou Estado Invalido","Erro",0);
		}else {
			//obter modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			//adicionar nova linha com os dados
			modelo.addRow(new String[] {jtfIncluirUf.getText(),jtfIncluirEstado.getText()});
			jtfIncluirEstado.setText("");
			jtfIncluirUf.setText("");
			JOptionPane.showMessageDialog(null, "Dados Incluidos com sucesso");
			
		}
		
		
	}
	public void excluirLinha() {
		// TODO Auto-generated method stub
		
		if (tabela.getSelectedRow()==-1) {
			JOptionPane.showMessageDialog(null, "Selecione uma linha","Erro",0);
		}else if (tabela.getSelectedRowCount()>1) {			
			JOptionPane.showMessageDialog(null, "Selecione apenas uma linha","Erro",0);			
		}else {
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Dados Excluidos com sucesso");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TesteGui10().iniciaGui();
	}

}
