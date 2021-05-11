package br.com.heranca;

public class TestaTodoMundo {
	public static void main(String[] args) {
		
		Professor prof = new Professor();
		Aluno alune = new Aluno();
		funcAdm func1 = new funcAdm();
		
		prof.setNome("Jeff");
		prof.setSalario(2);
		prof.setDisciplina("Java fanclub");
		
		System.out.println("Dados do professor");
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Salário: " + prof.getSalario());
		System.out.println("Disciplina: " + prof.getDisciplina());	
		
		
		alune.setNome("Antônio");
		alune.setCurso("Desespero");
		
		System.out.println("\nDados do aluno");
		System.out.println("Nome: " + alune.getNome());
		System.out.println("Curso: " + alune.getCurso());
		
		func1.setNome("Tatiana");
		func1.setSalario(2000);
		func1.setFuncao("Psicologo");
		
		System.out.println("\nDados do Funcionário");
		System.out.println("Nome: " + func1.getNome());
		System.out.println("Salário: " + func1.getSalario());
		System.out.println("Função: " + func1.getFuncao());
		
	}

}
