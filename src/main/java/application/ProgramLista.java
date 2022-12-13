package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ProgramLista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>(); //declara e instancia lista
        
		//Preenche lista
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Ana");
		lista.add(2,"Marco"); //Adiciona elemento na posição 2
		
		//Imprime tamanho lista original
		System.out.println(lista.size());
		
		//Imprime lista original
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("-------------------");		
		
		System.out.println("Removendo elementos da lista que começam com M");		
		lista.removeIf(x -> x.charAt(0) == 'M');//Removendo todos os elementos que começam com M
		for (String x : lista) {			
		    System.out.println(x);
		}
		
		lista.remove(2);//Removendo elemento da posição 1
		System.out.println("---------------------");
		System.out.println("Removendo elemento da posicao 2");
		for (String x : lista) {			
		    System.out.println(x);
		}		
		
		//Descobrindo quem ocupa determinada posição na lista
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		System.out.println("Index of Marco: " + lista.indexOf("Marco"));
		System.out.println("---------------------");
		
		//Deixar só os elementos que começam com A
		//Devolver os elementos da lista
		lista.add("Maria");
		lista.add("Ana");
		lista.add(2,"Marco"); //Adiciona elemento na posição 2
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Elementos da lista que comecam com a letra A");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
		    System.out.println(x);
		}
		System.out.println("---------------------");
		
		//Encontrar o primeiro elemento que começa com a letra 'A'
		//Devolver os elementos da lista
		lista.add("Maria");
		lista.add("Ana");
		lista.add(2,"Marco"); //Adiciona elemento na posição 2
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Primeiro elemento da lista que comecam com a letra A");
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		//Quando não acha o elemento
		System.out.println("Primeiro elemento da lista que comecam com a letra J");
	    name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
	    System.out.println(name);
		}
		
	}
