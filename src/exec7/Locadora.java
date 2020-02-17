
/**
 * locadora de carros
 * @author amendes
 * @since 14/02/2020
 * @version 0.1
 */
package exec7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.UIManager;



public class Locadora {

	
	boolean exit = false;
	boolean verificar;
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	static Carro vetorCarro[];
	int resposta=0;
	int vetor[];
	int controlador=0;
	JTextArea textArea[];
	JScrollPane scrollPane[];
	
	public Locadora() {
		processamento();
		}
	public void processamento() {
		personalizarInterface();
		while (!exit) {
			decisao();
			controlador++;
	}
		
	
		
		

	}

	
	
	
	
	public void decisao() {
		
		try {
		resposta = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Modelo\n2 - Velocidade\n3 - Combustivel\n4 - Mostrar por preço maior para o menor\n5 - Compra\n6 - Cor\n7 - ADD\n8 - Excluir \n9 - Encerrar")
				.toUpperCase().replace(" ", ""));
		
		switch (resposta) {

		case 1:
			pesquisaModelo();
			break;
		case 2:
			pesquisaVelocidade();
			break;
		case 3:
			pesquisaCombustivel();
			break;
		case 4:
			ordenar();
			break;
		case 5:
			pesquisaModeloCor();
			break;
		case 6:
			pesquisaCor();
			break;
		case 7:			
			adicionarCarro();
			break;
		
		case 8:
			excluir();
			break;
			
		case 9:
			JOptionPane meuJOPane = new JOptionPane("Encerrando...");//instanciando o JOptionPane
	        final JDialog dialog = meuJOPane.createDialog(null, "Wait");//aqui uso um JDialog para manipular
	                                                                    //meu JOptionPane
	        dialog.setModal(true);  
	        //Usando o javax.swing.Timer para poder gerar um evento em um tempo determinado
	        //Veja o construtor da classe Timer para mais explicações
	        Timer timer = new Timer(1 * 1500, new ActionListener() {  
	            public void actionPerformed(ActionEvent ev) {  
	                dialog.dispose();  //o evento(no caso fechar o meu JDialog)
	            }  
	        });  
	        timer.start();
	        dialog.setVisible(true);
	        timer.stop();
			
			exit = true;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Invalida");
			
			
		}
		
		}catch(NumberFormatException e) {
			JOptionPane meuJOPane = new JOptionPane("Opção Invalida!!!!");//instanciando o JOptionPane
	        final JDialog dialog = meuJOPane.createDialog(null, "WARNING");//aqui uso um JDialog para manipular
	                                                                    //meu JOptionPane
	        dialog.setModal(true);  
	        //Usando o javax.swing.Timer para poder gerar um evento em um tempo determinado
	        //Veja o construtor da classe Timer para mais explicações
	        Timer timer = new Timer(2 * 1000, new ActionListener() {  
	            public void actionPerformed(ActionEvent ev) {  
	                dialog.dispose();  //o evento(no caso fechar o meu JDialog)
	            }  
	        });  
	        timer.start();
	        dialog.setVisible(true);
	        timer.stop();
			
			processamento();
			
		}
	}
	public void personalizarInterface() {
		 
		UIManager.getDefaults().put("OptionPane.background",new Color(217,232,238));
		UIManager.put ("Panel.background", new Color(217,232,238));
		
		
	}
	public void adicionarCarro() {
		for (int i = 0; i < vetorCarro.length; i++) {
			if ((vetorCarro[i]!=null)||(vetorCarro[i].vetorDisponivel)) {
				//carro="carro"+i;
				Carro carro = new Carro(JOptionPane.showInputDialog("insira o modelo").toUpperCase(), JOptionPane.showInputDialog("insira a placa\nEX: ABC-1234").toUpperCase().replace(" ", ""),
						Integer.parseInt(JOptionPane.showInputDialog("insira a velocidade").replace(" ", "")), JOptionPane.showInputDialog("insira o tipo de combustivel\nGasolina\nAlcool\nDiesel\nFlex").toUpperCase().replace(" ", ""),
						Double.parseDouble(JOptionPane.showInputDialog("insira o preço").replace(" ", "")), JOptionPane.showInputDialog("insira a cor").toUpperCase().replace(" ", ""),false,false);
				vetorCarro[i]=carro;
				//cont++;
			}
			
			String decisao=JOptionPane.showInputDialog("Deseja Inserir mais um carro?").toUpperCase().replace(" ", "");
				if(decisao.equals("SIM")) {
						
				}else {
					break;
		
				
		}
			
		}
	}
	
	public void pesquisaModelo() {
		String message="";
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro").toUpperCase();
		boolean teste = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if ((vetorCarro[i]==null)) {
				
			}else {
				if (vetorCarro[i].vendido||(vetorCarro[i].vetorDisponivel)) {
					
				}else {
				if (vetorCarro[i].modeloDoCarro.equals(modelo)) {
					message=message+"\n--------------------------------------------------------"+"\n\nModelo................... " + vetorCarro[i].modeloDoCarro + "\n" + "Placa.................... " 
							+ vetorCarro[i].placaDoCarro
							+ "\nVelocidade Maxima........ " + vetorCarro[i].velocidadeMaxima +"\nCor...................... "+vetorCarro[i].cor+ "\nCombustivel.............. "
							+ vetorCarro[i].combustivel + "\nPreço.................... " + df.format(vetorCarro[i].valor);
					
					teste = true;
	
				}
				}
		}
		}
			
		if (teste == false) {
			mensagemErro();
			//JOptionPane.showMessageDialog(null, "não encontrado");
			
		}else {
			message=message+"\n--------------------------------------------------------";
			mensagem(message);
		}
			
	}
	
	public void mensagemErro() {
		JOptionPane meuJOPane = new JOptionPane("não encontrado");//instanciando o JOptionPane
        final JDialog dialog = meuJOPane.createDialog(null, "WARNING");//aqui uso um JDialog para manipular
                                                                    //meu JOptionPane
        dialog.setModal(true);  
        //Usando o javax.swing.Timer para poder gerar um evento em um tempo determinado
        //Veja o construtor da classe Timer para mais explicações
        Timer timer = new Timer(1 * 1000, new ActionListener() {  
            public void actionPerformed(ActionEvent ev) {  
                dialog.dispose();  //o evento(no caso fechar o meu JDialog)
            }  
        });  
        timer.start();
        dialog.setVisible(true);
        timer.stop();
	}

	public void pesquisaVelocidade() {
		String message="";
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do carro").replace(" ", ""));
		boolean teste = false;
		for (int j = 0; j < vetorCarro.length; j++) {
			if (vetorCarro[j].vendido||(!vetorCarro[j].vetorDisponivel)) {
			if (vetorCarro[j].velocidadeMaxima == velocidade) {
				message=message+"\n--------------------------------------------------------"+"\n\nModelo................... " + vetorCarro[j].modeloDoCarro + "\n" + "Placa.................... " 
						+ vetorCarro[j].placaDoCarro
						+ "\nVelocidade Maxima........ " + vetorCarro[j].velocidadeMaxima +"\nCor...................... "+vetorCarro[j].cor+ "\nCombustivel.............. "
						+ vetorCarro[j].combustivel + "\nPreço.................... " + df.format(vetorCarro[j].valor);
				teste = true;

			}
			}
		}

		if (teste == false) {
			mensagemErro();
			
			
		}else {
			message=message+"\n--------------------------------------------------------";
			mensagem(message);
		}

	}

	public void pesquisaCombustivel() {
		String message="";
		String combustivel = JOptionPane.showInputDialog("Digite o combustivel do carro\nGasolina\nAlcool\nDiesel\nFlex").toUpperCase().replace(" ", "");
		boolean teste = false;
		
			if(combustivel.equals("GASOLINA")||combustivel.equals("ALCOOL")||combustivel.equals("DIESEL")||combustivel.equals("FLEX")) {
				
			
		
		for (int k = 0; k < vetorCarro.length; k++) {
			if (vetorCarro[k].vendido||(!vetorCarro[k].vetorDisponivel)) {
			if (vetorCarro[k].combustivel.equals(combustivel)) {
				message=message+"\n--------------------------------------------------------"+"\n\nModelo................... " + vetorCarro[k].modeloDoCarro + "\n" + "Placa.................... " 
						+ vetorCarro[k].placaDoCarro
						+ "\nVelocidade Maxima........ " + vetorCarro[k].velocidadeMaxima +"\nCor...................... "+vetorCarro[k].cor+ "\nCombustivel.............. "
						+ vetorCarro[k].combustivel + "\nPreço.................... " + df.format(vetorCarro[k].valor);
				teste = true;
			}
			}
		}

		if (teste == false) {
			mensagemErro();
			
			
		}else {
			message=message+"\n--------------------------------------------------------";
			mensagem(message);
		}
			}else {
				JOptionPane.showMessageDialog(null,"Combustivel incorreto", "0.1",JOptionPane.YES_NO_OPTION);
			}

	}
		
	
	public void ordenar() {
		Carro aux;
		boolean controle;
		String message="";

		for (int i = 0; i < vetorCarro.length; i++) {
			controle = true;
			for (int j = 0; j < (vetorCarro.length - 1); j++) {

// CASO QUEIRA IMPRIMIR DE FORMA DECRESCENTE, É PRECISO SOMENTE MUDAR O SINAL (>) DENTRO DA CONDIÇÃO.
				
				
					if (vetorCarro[j].valor < vetorCarro[j + 1].valor) {
						aux = vetorCarro[j];
						vetorCarro[j] = vetorCarro[j + 1];
						vetorCarro[j + 1] = aux;
						controle = false;
					}
			}
			
			if (controle) {
				break;
			}

		}
		for (int i = 0; i < vetorCarro.length; i++) {
			if ((vetorCarro[i]==null)&&(vetorCarro[i].vetorDisponivel)) {
				
			}else {
				if (vetorCarro[i].vendido||(vetorCarro[i].vetorDisponivel)) {
				
				}else {
				
					message=message+"\n--------------------------------------------------------"+"\n\nModelo................... " + vetorCarro[i].modeloDoCarro + "\n" + "Placa.................... " 
					+ vetorCarro[i].placaDoCarro
					+ "\nVelocidade Maxima........ " + vetorCarro[i].velocidadeMaxima +"\nCor...................... "+vetorCarro[i].cor+ "\nCombustivel.............. "
					+ vetorCarro[i].combustivel + "\nPreço.................... " + df.format(vetorCarro[i].valor);
			
			}
		}
		}
		message=message+"\n--------------------------------------------------------";
			mensagem(message);
		}
	

	public void ordenarCompra() {
		
		boolean controle;

		for (int i = 0; i < vetorCarro.length; i++) {
			controle = true;
			for (int j = 0; j < (vetorCarro.length - 1); j++) {

// CASO QUEIRA IMPRIMIR DE FORMA DECRESCENTE, É PRECISO SOMENTE MUDAR O SINAL (>) DENTRO DA CONDIÇÃO.

				if (vetorCarro[j].valor > vetorCarro[j + 1].valor) {
					Carro aux = vetorCarro[j];
					vetorCarro[j] = vetorCarro[j + 1];
					vetorCarro[j + 1] = aux;
					controle = false;
				}
			}

			if (controle) {
				break;
			}

		}

	}

	public void pesquisaModeloCor() {
		ordenarCompra();
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro").toUpperCase().replace(" ", "");
		String cor = JOptionPane.showInputDialog("Digite a cor do carro").toUpperCase();
		boolean teste = false;
		//ordenarCompra();
		
		String message="\nDigite o numero da opção do carro que deseja comprar\nCaso desejar fazer uma nova consulta digite sair";
		
		for (int i = 0; i < vetorCarro.length; i++) {
			
			if ((vetorCarro[i].modeloDoCarro.equals(modelo)) && (vetorCarro[i].cor.equals(cor))&&(!vetorCarro[i].vendido)) {
				
				
				
				message=message+"\n\n--------------------------------------------------------\n"+"\n\nOpção "+i
						+ "\n\nModelo................... " + vetorCarro[i].modeloDoCarro + "\n" + "Placa.................... " 
						+ vetorCarro[i].placaDoCarro
						+ "\nVelocidade Maxima........ " + vetorCarro[i].velocidadeMaxima +"\nCor...................... "+vetorCarro[i].cor+ "\nCombustivel.............. "
						+ vetorCarro[i].combustivel + "\nPreço.................... " + (df.format(vetorCarro[i].valor));
				teste = true;
				
				
			}
			
			
			//JOptionPane.showMessageDialog(null,(j+" - "+"Modelo: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "+ vetorCarro[i].placaDoCarro + "\nVelocidade Maxima" + vetorCarro[i].velocidadeMaxima+ "\nCombustivel: " + vetorCarro[i].combustivel + "\nPreço: " + df.format(vetorCarro[i].valor)));
			
		}
		message=message+"\n\n--------------------------------------------------------";
		if (teste == false) {
			mensagemErro();
			
		}else {
			
			JTextArea textArea = new JTextArea(message); 
			JScrollPane scrollPane = new JScrollPane(textArea); 		
			textArea.setLineWrap(false);
			scrollPane.setWheelScrollingEnabled(true);
			textArea.setEditable(false);
			//scrollPane.setBackground(Color.BLACK);
			//textArea.setEnabled(false);
			//textArea.setBackground(Color.black);
			//textArea.setSelectedTextColor(Color.WHITE);
			textArea.setFont(new Font("Consolas", Font.BOLD, 16));
			textArea.setForeground(Color.BLACK);
			
			
			//textArea.setPreferredSize(new Dimension(500,500));
			scrollPane.setPreferredSize(new Dimension(500,500));
			int escolha = Integer.parseInt( JOptionPane.showInputDialog(null,scrollPane, "0.1",JOptionPane.YES_NO_OPTION).replace(" ", ""));
			
		//int escolha = Integer.parseInt(JOptionPane.showInputDialog(message+"\nDigite o numero do carro que deseja comprar\nCaso desejar fazer uma nova consulta digite sair"));
		
				double compra = Double.parseDouble(JOptionPane.showInputDialog("Valor do "+vetorCarro[escolha].modeloDoCarro+" "+df.format(vetorCarro[escolha].valor).replace(" ", "")+"\nDigite o valor entregue:"));
				
				double total = (compra-vetorCarro[escolha].valor);
				
				if (total>=0) {
					JOptionPane.showMessageDialog(null, "Venda Concluida!!!!\nTroco: "+df.format(total));
					//break;
					vetorCarro[escolha].vendido=true;
		
					
					//JOptionPane.ShowIn
				}else {
					JOptionPane.showMessageDialog(null, "Valor Insuficiente, Retornando a tela inicial");
					
				}				
			
		message="";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido || (vetorCarro[i].vetorDisponivel)) {
				
			}else {
				message=message+"\n--------------------------------------------------------"+"\n\nModelo................... " + vetorCarro[i].modeloDoCarro + "\n" + "Placa.................... " 
						+ vetorCarro[i].placaDoCarro
						+ "\nVelocidade Maxima........ " + vetorCarro[i].velocidadeMaxima +"\nCor...................... "+vetorCarro[i].cor+ "\nCombustivel.............. "
						+ vetorCarro[i].combustivel + "\nPreço.................... " + df.format(vetorCarro[i].valor);
				}
			
			
		}
		message=message+"\n--------------------------------------------------------";
		mensagem(message);
	}
		
	
	
	}
	public void mensagem(String message) {
		JTextArea textArea = new JTextArea(message); 
		JScrollPane scrollPane = new JScrollPane(textArea); 		
		textArea.setLineWrap(false);
		scrollPane.setWheelScrollingEnabled(true);
		textArea.setEditable(false);
		//scrollPane.setBackground(Color.BLACK);
		//textArea.setEnabled(false);
		//textArea.setBackground(Color.black);
		//textArea.setSelectedTextColor(Color.WHITE);
		textArea.setFont(new Font("Consolas", Font.BOLD, 16));
		textArea.setForeground(Color.BLACK);
		
		
		//textArea.setPreferredSize(new Dimension(500,500));
		scrollPane.setPreferredSize(new Dimension(500,500));
		JOptionPane.showMessageDialog(null,scrollPane, "0.1",JOptionPane.YES_NO_OPTION);
		
		
	}
	public void pesquisaCor() {
		String message="";
		String cor = JOptionPane.showInputDialog("Digite a cor do carro").toUpperCase().replace(" ", "");
		boolean teste = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			
				if (vetorCarro[i].vendido||(!vetorCarro[i].vetorDisponivel)) {
				if (vetorCarro[i].cor.equals(cor)) {
					message=message+"\n--------------------------------------------------------"+"\n\nModelo................... " + vetorCarro[i].modeloDoCarro + "\n" + "Placa.................... " 
							+ vetorCarro[i].placaDoCarro
							+ "\nVelocidade Maxima........ " + vetorCarro[i].velocidadeMaxima +"\nCor...................... "+vetorCarro[i].cor+ "\nCombustivel.............. "
							+ vetorCarro[i].combustivel + "\nPreço.................... " + df.format(vetorCarro[i].valor);
					teste = true;
	
				}

		}
		}
		if (teste == false) {
			
			mensagemErro();
			
		}else {
			message=message+"\n--------------------------------------------------------";
			mensagem(message);
		}
		
	}	
	public void excluir() {
		String placa = JOptionPane.showInputDialog("Digite a placa do carro").toUpperCase().replace(" ", "").replace(" ", "");
		boolean teste = false;
		//ordenarCompra();
		int numeroEscolha[];
		numeroEscolha = new int[20];
		String message="";
		
		for (int i = 0; i < vetorCarro.length; i++) {
			
			if ((vetorCarro[i]==null)) {
				
			}else {
				if (vetorCarro[i].vendido||(vetorCarro[i].vetorDisponivel)) {
					
				}else {
			if (vetorCarro[i].placaDoCarro.equals(placa)&&(!vetorCarro[i].vendido)) {
				
				
				
				message=message+"\n--------------------------------------------------------"+"\nCarro N° "+i+"\n\nModelo................... " + vetorCarro[i].modeloDoCarro + "\n" + "Placa.................... " 
						+ vetorCarro[i].placaDoCarro
						+ "\nVelocidade Maxima........ " + vetorCarro[i].velocidadeMaxima +"\nCor...................... "+vetorCarro[i].cor+ "\nCombustivel.............. "
						+ vetorCarro[i].combustivel + "\nPreço.................... " + df.format(vetorCarro[i].valor);
				teste = true;
				
				
			}
				}
			}
			//JOptionPane.showMessageDialog(null,(j+" - "+"Modelo: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "+ vetorCarro[i].placaDoCarro + "\nVelocidade Maxima" + vetorCarro[i].velocidadeMaxima+ "\nCombustivel: " + vetorCarro[i].combustivel + "\nPreço: " + df.format(vetorCarro[i].valor)));
			
		
		
		}

		if (teste == false) {
			mensagemErro();
			
		}else {
			
			message=message+"\n--------------------------------------------------------\n";
			mensagem(message);
			int escolha = Integer.parseInt(JOptionPane.showInputDialog("\nQual dos carros deseja excluir?").replace(" ", ""));
			if (vetorCarro[escolha].placaDoCarro.equals(placa)) {
			vetorCarro[escolha].vetorDisponivel=true;
			JOptionPane.showMessageDialog(null, "Carro excluido com sucesso");
			}else {
				JOptionPane.showMessageDialog(null, "Carro escolhido e placa não condizem");
			}
		}
				
	}
	public static void main(String[] args) {
		
		
		
		vetorCarro = new Carro[20];

		/*
		 * Carro carro1 = new Carro("UNO", "AHT-8900", 240, "GASOLINA",
		 * 50000.00,"AZUL"); vetorCarro[0] = carro1; Carro carro2 = new Carro("FUSCA",
		 * "UVJ-9090", 160, "ALCOOL", 3040000.00,"AZUL"); vetorCarro[1] = carro2; Carro
		 * carro3 = new Carro("FUSCA", "JVE-5489", 80, "DIESEL", 1000000.00,"AZUL");
		 * vetorCarro[2] = carro3; Carro carro4 = new Carro("FUSCA", "AWB-0666", 400,
		 * "FLEX", 500000.00,"AZUL"); vetorCarro[3] = carro4; Carro carro5 = new
		 * Carro("FUSCA", "UFC-5934", 135, "GASOLINA", 139043.00,"AZUL"); vetorCarro[4]
		 * = carro5; Carro carro6 = new Carro("OPALA", "JDK-1888", 209, "ALCOOL",
		 * 90356.00,"PRETO"); vetorCarro[5] = carro6; Carro carro7 = new Carro("MONZA",
		 * "ABC-5631", 170, "Flex", 209182.00,"CINZA"); vetorCarro[6] = carro7; Carro
		 * carro8 = new Carro("STRADA", "TUO-2937", 260, "GASOLINA",
		 * 73723823.00,"PRATA"); vetorCarro[7] = carro8; Carro carro9 = new
		 * Carro("HB-20", "IOP-7457", 180, "Flex", 30031233.00,"MARROM"); vetorCarro[8]
		 * = carro9; Carro carro10 = new Carro("BRAZILIA", "TUO-9284", 590, "DIESEL",
		 * 2134545.00,"BRANCO"); vetorCarro[9] = carro10;
		 */

		Carro carro1 = new Carro("UNO", "AHT-8900", 240, "GASOLINA", 50000.00, "AZUL",false,false);
		vetorCarro[0] = carro1;
		Carro carro2 = new Carro("FUSCA", "UVJ-9090", 160, "ALCOOL", 3040000.00, "AZUL",false,false);
		vetorCarro[1] = carro2;
		Carro carro3 = new Carro("FUSCA", "JVE-5489", 240, "DIESEL", 1000000.00, "AZUL",false,false);
		vetorCarro[2] = carro3;
		Carro carro4 = new Carro("BUGATI", "AWB-0666", 400, "FLEX", 500000.00, "VERMELHO",false,false);
		vetorCarro[3] = carro4;
		Carro carro5 = new Carro("COROLA", "UFC-5934", 135, "GASOLINA", 139043.00, "LARANJA",false,false);
		vetorCarro[4] = carro5;
		Carro carro6 = new Carro("OPALA", "JDK-1888", 209, "ALCOOL", 90356.00, "PRETO",false,false);
		vetorCarro[5] = carro6;
		Carro carro7 = new Carro("MONZA", "ABC-5631", 170, "Flex", 209182.00, "CINZA",false,false);
		vetorCarro[6] = carro7;
		Carro carro8 = new Carro("STRADA", "TUO-2937", 260, "GASOLINA", 73723823.00, "PRATA",false,false);
		vetorCarro[7] = carro8;
		Carro carro9 = new Carro("HB-20", "IOP-7457", 180, "Flex", 30031233.00, "MARROM",false,false);
		vetorCarro[8] = carro9;
		Carro carro10 = new Carro("BRAZILIA", "TUO-9284", 590, "DIESEL", 2134545.00, "BRANCO",false,false);
		vetorCarro[9] = carro10;
		
		for(int i=10;i<20;i++) {
			//String carro="";
			if (vetorCarro[i]==null) {
				//carro="carro"+i;
				Carro carro = new Carro("", "",
						0, "",
						0, "",false,true);
				vetorCarro[i]=carro;
				vetorCarro[i].vetorDisponivel=true;
	}
}
		
	

		new Locadora();
		

	}
}

