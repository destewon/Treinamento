package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ExemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// criar objeto array list
		List<String> array = new ArrayList<String>();

		array.add("Elemento numero 1");
		array.add("Elemento Numero 2");
		array.add("Elemento Numero 3");

		System.out.println("Posição 1 contém " + array.get(0));
		System.out.println("Posição 2 contém " + array.get(1));
		System.out.println("Posição 3 contém " + array.get(2));

		for (String s : array) {
			System.out.println(s);
		}

		array.add(1, "Elemento numero 1,5");
		System.out.println("\napos adicionar o elemento 1,5 " + array.get(1));

		for (String s : array) {
			System.out.println(s);
		}

		// obeter o tamanho da lista
		System.out.println("\no tamanho da lista é: " + array.size());

		if (array.contains("Elemento numero 1,5")) {
			System.out.println("Elemento numero 1,5 existe");

		} else {
			System.out.println("não existe Elemento numero 1,5");
		}

		int indice = array.indexOf("Elemento numero 1,5");
		System.out.println("\no indice do elemento 1,5 é: " + indice);

		System.out.println("Removendo elemento 1,5: " + array.remove("Elemento numero 1,5"));
		System.out.println("Lista atualizada:\n");

		for (String s : array) {
			System.out.println(s);
		}

		System.out.println("\n rmovendo o ultimo elemento");
		array.remove(array.size() - 1);

		System.out.println("Lista atualizada:\n");

		for (String s : array) {
			System.out.println(s);
		}
		
		//adicionando elementos na lista
		System.out.println("\nadicionando elementos na lista");
		array.add("Elemento numero 5");
		array.add("Elemento Numero 4");
		array.add("Elemento Numero 9");
		array.add("Elemento Numero 0");
		array.add("Elemento Numero 8");
		
		System.out.println("Lista com elementos adicionados:\n");

		for (String s : array) {
			System.out.println(s);
		}
		
		Collections.sort(array);
		
		System.out.println("Lista com ordenada:\n");

		for (String s : array) {
			System.out.println(s);
		}
		
		//criando uma lista de objeto
		List<Filme> arrayListFilm = new ArrayList<Filme>();
		
		//criando 3 filmes
		
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("Codigo Conduta");
		
		Filme filme2 = new Filme();
		filme1.setCodigo(2);
		filme1.setNome("Era do Gelo");
		
		Filme filme3 = new Filme();
		filme1.setCodigo(3);
		filme1.setNome("Matrix");
		
		if (filme1.equals(filme2)) {
			System.out.println("\nFilmes iguais");
		}else {
			System.out.println("\nFilmes diferentes");
		}
		
		//adicionar na lista os filmes instanciados
		arrayListFilm.add(filme1);
		arrayListFilm.add(filme2);
		arrayListFilm.add(filme3);
		
		//exibindo a lista de filme
		for (Filme f: arrayListFilm) {
			
			System.out.println(f);
			
			}
		
		
		
		
	}

}
