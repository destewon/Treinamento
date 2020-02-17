package exec3;

/**
 * Classe para atributos do carro
 * @author amendes
 * @since 11/02/2020
 * @version 0.1
 */


public class Carro extends Produto{
	
	String marca="Chevrolet";
	String modelo="Chevetão";
	int ano=1998;
	String cor="preto";
	String motor="1.6";
	
	public void exibirCarro() {
		
		if (marca!=null) {
			System.out.println("Marca: "+marca);
		}else {
			System.out.println("Campo Marca nula");
		}
		
		if (modelo!=null) {
			System.out.println("Modelo: "+modelo);
		}else {
			System.out.println("Campo modelo nulo");
		}
		
		if (ano>0) {
			System.out.println("ano: "+ano);
		}else {
			System.out.println("Campo ano invalido");
		}
		
		if (cor!=null) {
			System.out.println("cor: "+cor);
		}else {
			System.out.println("Campo cor nulo");
		}
		
		if (motor!=null) {
			System.out.println("motor: "+motor);
		}else {
			System.out.println("Campo motor nulo");
		}
		
		exibirTudo();
		
	}

}
