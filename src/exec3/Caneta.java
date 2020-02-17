package exec3;

/**
 * Classe para armazenar atributos da caneta
 * @author amendes
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneta extends Produto{
	String cor="Azul";
	String formato="Esferografica";
	String marca="bic";
	
	public void exibirCaneta(){
		
		if (cor!=null) {
			System.out.println("Cor: "+cor);
		}else {
			System.out.println("Campo cor nulo");
		}
		
		if (formato!=null) {
			System.out.println("formato: "+formato);
		}else {
			System.out.println("Campo formato nulo");
		}
		
		if (marca!=null) {
			System.out.println("marca: "+marca);
		}else {
			System.out.println("Campo marca nulo");
		}
		
		exibirTudo();
		
	}
	

}
