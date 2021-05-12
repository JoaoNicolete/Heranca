package br.com.exercicio;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo calavo = new Cavalo();
		Preguiça eu = new Preguiça();
		
		dog.setNome("Preguiça");
		dog.setIdade(99);
		System.out.println("====================================");
		dog.som("\nAu au");
		
		System.out.println("Nome do cachorro: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade() + " anos");
		dog.acao();
		
		
		
		calavo.setNome("Cachorro");
		calavo.setIdade(130);
		System.out.println("====================================");
		calavo.som("\nHinn in in");
		
		
		
		System.out.println("Nome do cavalo: " + calavo.getNome());
		System.out.println("Idade: " + calavo.getIdade() + " anos");
		calavo.acao();
		
		eu.setNome("Cavalo");
		eu.setIdade(2);
		System.out.println("====================================");
		eu.som("\nZzzZzzzZzzzZ");
		
		
		System.out.println("Nome da preguiça: " + eu.getNome());
		System.out.println("Idade: " + eu.getIdade() + " anos");
		eu.acao();
		
		

	}

}
