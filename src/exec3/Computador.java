package exec3;

/**
 * Classe para armazenar atributos do Computador
 * @author amendes
 * @since 11/02/2020
 * @version 0.1
 */

public class Computador extends Produto {
	String  processador="I9";
	String	memoria="Kingston";
	String	tela="LCD";
	String  hd="kingston";
	String	placaDeVideo="RTX 3080 TI";
	
	public void exibirComputador(){
		
		if (processador!=null) {
			System.out.println("Processador: "+processador);
		}else {
			System.out.println("Campo processador nulo");
		}
		
		if (memoria!=null) {
			System.out.println("memoria: "+memoria);
		}else {
			System.out.println("Campo memoria nulo");
		}
		
		if (tela!=null) {
			System.out.println("tela: "+tela);
		}else {
			System.out.println("Campo tela nulo");
		}
		
		if (hd!=null) {
			System.out.println("hd: "+hd);
		}else {
			System.out.println("Campo hd nulo");
		}
		
		if (placaDeVideo!=null) {
			System.out.println("placaDeVideo: "+placaDeVideo);
		}else {
			System.out.println("Campo placaDeVideo nulo");
		}
		
		
		
		exibirTudo();
	}

}
