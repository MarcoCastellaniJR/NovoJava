package Sets;

import java.util.HashSet;
import java.util.Set;

public class TesteAluno {

	public static void main(String[] args) {
		
		// SEMPRE QUE FOR FAZER ALGUM TESTE DE .equals
		// O MÉTODO eQUALS PRECISA SER SOBRESCRITO E O TAMBÉM O MÉTODO HASH CODE
		// ESSE MÉTODO AJUDA A SEPARAR PARA FICAR MAIS FÁCIL OCOMPARAR E ENCONTRAR O RESULTADO
		
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Marco Castellani");
		alunos.add("Beatriz Nardini");
		alunos.add("Silvia Helena");
		alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        
        for (String aluno : alunos) {
        	System.out.println(aluno);
        }
		
		System.out.println(alunos);
		}
}
