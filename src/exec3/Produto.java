package exec3;

/**
 * Programa para fazer exibi��o de atributos
 * @author amendes
 * @since 11/02/2020
 * @version 0.1
 */


public class Produto {

	
	//public static void main(String[] args) {
		
		String nome="Gamer";
		int qtde=3;
		double valor=82.0;
		int qtdeVendido=5;
		double percentLucro=18.9;
		
		//Exibi��o do nome
		public void exibirNome(){
			if (nome!=null) {
				System.out.println("Nome: "+nome);
			}else{
				System.out.println("Valor do nome � nulo, n�o foi possivel tratar");
			}
			
			
		}
		//Exibi��o do Valor
		public void exibirValor(){
			if (valor>=0) {
				System.out.println("Valor: "+(valor+(valor*percentLucro/100)));
			}else{
				System.out.println("O valor � invalido, n�o foi possivel tratar");
			}
			
			
			
		}
		//Exibir lucro
		public void exibirLucro(){
			if ((percentLucro>0)&&(valor>0)) {
				System.out.println("Percentual do Lucro: "+(valor*percentLucro/100));
			}else{
				System.out.println("Valor do Lucro � invalido, n�o foi possivel tratar");
			}
			
			
			
		}
		
		//Exibir todas as informa��es
		public void exibirTudo(){
			
			exibirNome();
			exibirValor();
			exibirLucro();
			
		}
		
		
		

	//}
		
		

}
