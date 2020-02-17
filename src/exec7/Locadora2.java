

package exec7;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Locadora2 {

	
	boolean validador = false;

	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	static Carro vetorCarro[];
	int resposta=0;
	int vetor[];
	int controlador=0;
	public Locadora2() {
		while (resposta!=9) {
			decisao();
			controlador++;
		}
		
		
		
		// pesquisaModelo();

	}

	
	public int decisao() {
		resposta = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Modelo\n2 - Velocidade\n3 - Combustivel\n4 - Mostrar por preço maior para o menor\n5 - Modelo e cor\n 9 - Encerrar")
				.toUpperCase());

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
		case 9:
			System.out.println("Encerrando...");
			break;
		default:
			System.out.println("Opção Invalida");
			validador = true;
			
		}
		return resposta;
	}

	public void pesquisaModelo() {

		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro").toUpperCase();
		boolean teste = false;
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modeloDoCarro.equals(modelo)) {
				System.out.println("Modelo: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\nVelocidade Maxima" + vetorCarro[i].velocidadeMaxima
						+ "\nCombustivel: " + vetorCarro[i].combustivel + "\nPreço: " + df.format(vetorCarro[i].valor));
				System.out.println();
				teste = true;

			}

		}

		if (teste == false) {
			System.out.println("não encontrado");
			// validador=true;
		}

	}

	public void pesquisaVelocidade() {

		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do carro"));
		boolean teste = false;
		for (int j = 0; j < vetorCarro.length; j++) {

			if (vetorCarro[j].velocidadeMaxima == velocidade) {
				System.out.println("Modelo: " + vetorCarro[j].modeloDoCarro + "\n" + "Placa: "
						+ vetorCarro[j].placaDoCarro + "\nVelocidade Maxima" + vetorCarro[j].velocidadeMaxima
						+ "\nCombustivel: " + vetorCarro[j].combustivel + "\nPreço: " + df.format(vetorCarro[j].valor));
				teste = true;

			}

		}

		if (teste == false) {
			System.out.println("não encontrado");
			validador = true;
		}

	}

	public void pesquisaCombustivel() {

		String combustivel = JOptionPane.showInputDialog("Digite o combustivel do carro").toUpperCase();
		boolean teste = false;
		for (int k = 0; k < vetorCarro.length; k++) {

			if (vetorCarro[k].combustivel.equals(combustivel)) {
				System.out.println("Modelo: " + vetorCarro[k].modeloDoCarro + "\n" + "Placa: "
						+ vetorCarro[k].placaDoCarro + "\nVelocidade Maxima: " + vetorCarro[k].velocidadeMaxima
						+ "\nCombustivel: " + vetorCarro[k].combustivel + "\nPreço: " + df.format(vetorCarro[k].valor));
				teste = true;
			}

		}

		if (teste == false) {
			System.out.println("não encontrado");
			validador = true;
		}

	}

	public void ordenar() {
		double aux;
		boolean controle;

		for (int i = 0; i < vetorCarro.length; i++) {
			controle = true;
			for (int j = 0; j < (vetorCarro.length - 1); j++) {

// CASO QUEIRA IMPRIMIR DE FORMA DECRESCENTE, É PRECISO SOMENTE MUDAR O SINAL (>) DENTRO DA CONDIÇÃO.

				if (vetorCarro[j].valor < vetorCarro[j + 1].valor) {
					aux = vetorCarro[j].valor;
					vetorCarro[j].valor = vetorCarro[j + 1].valor;
					vetorCarro[j + 1].valor = aux;
					controle = false;
				}
			}

			if (controle) {
				break;
			}

		}
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido) {
				
			}else {
			System.out.println("Modelo: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro
					+ "\nVelocidade Maxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
					+ vetorCarro[i].combustivel + "\nPreço: " + df.format(vetorCarro[i].valor));
			System.out.println("");
			}
		}

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
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro").toUpperCase();
		String cor = JOptionPane.showInputDialog("Digite a cor do carro").toUpperCase();
		boolean teste = false;
		//ordenarCompra();
		int j=1;
		for (int i = 0; i < vetorCarro.length; i++) {

			if ((vetorCarro[i].modeloDoCarro.equals(modelo)) && (vetorCarro[i].cor.equals(cor))) {
				
				vetor = new int[20];
				
				
				vetor[i] = i;
				
				JOptionPane.showMessageDialog(null,(i+" - "+"Modelo: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "+ vetorCarro[i].placaDoCarro + "\nVelocidade Maxima" + vetorCarro[i].velocidadeMaxima+ "\nCombustivel: " + vetorCarro[i].combustivel + "\nPreço: " + df.format(vetorCarro[i].valor)));
				//System.out.println();
				teste = true;
				j++;
				
				
			}
			//JOptionPane.showMessageDialog(null,(j+" - "+"Modelo: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "+ vetorCarro[i].placaDoCarro + "\nVelocidade Maxima" + vetorCarro[i].velocidadeMaxima+ "\nCombustivel: " + vetorCarro[i].combustivel + "\nPreço: " + df.format(vetorCarro[i].valor)));
			
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do carro que deseja comprar\nCaso desejar fazer uma nova consulta digite sair"));
		
		//if (vetorCarro[i].placaDoCarro.equals(placa))  {
		
		//}else {
	//}
	
	
		//for (int k = 0; k < vetor.length; k++) {		
			
				double compra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor entregue:"));
				
				double total = (compra-/*vetor[escolha-1].valor*/vetorCarro[escolha].valor);
				
				if (total>=0) {
					JOptionPane.showMessageDialog(null, "Troco: "+df.format(total));
					//break;
					vetorCarro[escolha].vendido=true;
		
				}else {
					JOptionPane.showMessageDialog(null, "Valor Insuficiente, Retornando a tela inicial");
					//System.out.println("Inicio");
					//break;
				}				
			//}
		
		
		if (teste == false) {
			System.out.println("não encontrado");
			
		}
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido) {
				
			}else {
			System.out.println("Modelo: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro
					+ "\nVelocidade Maxima: " + vetorCarro[i].velocidadeMaxima + "\nCombustivel: "
					+ vetorCarro[i].combustivel + "\nPreço: " + df.format(vetorCarro[i].valor));
			System.out.println("");
			}
		}
	}
	
	
	public static void main(String[] args) {

		vetorCarro = new Carro[10];

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

		Carro2 carro1 = new Carro2("UNO", "AHT-8900", 240, "GASOLINA", 50000.00, "AZUL",false);
		vetorCarro[0] = carro1;
		Carro carro2 = new Carro("FUSCA", "UVJ-9090", 160, "ALCOOL", 3040000.00, "AZUL",false);
		vetorCarro[1] = carro2;
		Carro carro3 = new Carro("FUSCA", "JVE-5489", 240, "DIESEL", 1000000.00, "AZUL",false);
		vetorCarro[2] = carro3;
		Carro carro4 = new Carro("BUGATI", "AWB-0666", 400, "FLEX", 500000.00, "VERMELHO",false);
		vetorCarro[3] = carro4;
		Carro carro5 = new Carro("COROLA", "UFC-5934", 135, "GASOLINA", 139043.00, "LARANJA",false);
		vetorCarro[4] = carro5;
		Carro carro6 = new Carro("OPALA", "JDK-1888", 209, "ALCOOL", 90356.00, "PRETO",false);
		vetorCarro[5] = carro6;
		Carro carro7 = new Carro("MONZA", "ABC-5631", 170, "Flex", 209182.00, "CINZA",false);
		vetorCarro[6] = carro7;
		Carro carro8 = new Carro("STRADA", "TUO-2937", 260, "GASOLINA", 73723823.00, "PRATA",false);
		vetorCarro[7] = carro8;
		Carro carro9 = new Carro("HB-20", "IOP-7457", 180, "Flex", 30031233.00, "MARROM",false);
		vetorCarro[8] = carro9;
		Carro carro10 = new Carro("BRAZILIA", "TUO-9284", 590, "DIESEL", 2134545.00, "BRANCO",false);
		vetorCarro[9] = carro10;

		/*
		 * vetorCarro[0] =new Carro("UNO", "AHT-8900", 240, "Gasolina", 50000.00);
		 * 
		 * vetorCarro[1] =new Carro("Fusca", "UVJ-9090", 160, "Alcool", 1000000.00);
		 * 
		 * vetorCarro[2] =new Carro("Ferrari", "JVE-5489", 80, "Diesel", 3040000.00);
		 * 
		 * vetorCarro[3]=new Carro("Bugati", "AWB-0666", 400, "Flex", 2700000.00);
		 * 
		 * vetorCarro[4] =new Carro("Corola", "UFC-5934", 135, "Gasolina", 300333.00);
		 * 
		 * vetorCarro[5] =new Carro("Corola", "UFC-5934", 135, "Flex", 300333.00);
		 * 
		 * Carro carro7 =new Carro("Corola", "UFC-5934", 135, "Flex", 300333.00);
		 * vetorCarro[6]=carro7; Carro carro8 =new Carro("Corola", "UFC-5934", 135,
		 * "Flex", 300333.00); vetorCarro[7]=carro8; Carro carro9 =new Carro("Corola",
		 * "UFC-5934", 135, "Flex", 300333.00); vetorCarro[8]=carro9; Carro carro10 =new
		 * Carro("Corola", "UFC-5934", 135, "Flex", 300333.00); vetorCarro[9]=carro10;
		 */

		Locadora2 locadora = new Locadora2();
		// locadora.decisao();
		// locadora.pesquisaModelo();

	}
}

