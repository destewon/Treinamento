package exec3;

/**
 * Classe para armazenar atributos da caneca
 * @author amendes
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneca extends Produto{
	
	boolean estampa=true;
	String material="Latão";
	int medida=18;
			
	public void exibirCaneca(){
		if (estampa) {
			System.out.println("Possui estampa");
		}
		if (material!=null) {
			System.out.println("Material: "+material);
		}else {
			System.out.println("Campo material nulo");
		}
		
		if (medida>0) {
			System.out.println("Tamanho: "+medida);
		}else {
			System.out.println("Campo medida invalido");
		}
			
		exibirTudo();
		
	}

}
