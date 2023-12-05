import java.util.ArrayList;

public class TesteEmArrays {
	public static void main(String[] args) {
		
		String aula1 = "Teste aula 01";
		String aula2 = "Teste aula 02";
		String aula3 = "Teste aula 03";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
		//for each especia para escolher como mostrar cada aula de tdas as aulas
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String selecionarAula = aulas.get(1);
		System.out.println(selecionarAula);
		
		//PARA PERCORRER A LISTA E IMPRIMIR COM A FORMATAÇÃO DESEJADA
		for (int i = 0; i < aulas.size(); i++) {
		    System.out.println("aula : " + aulas.get(i));
		}
		
		
		//FORMA MAIS NOVA PARA PERCORRER O JAVA USANDO LAMBDAS
		aulas.forEach(aula -> {
		    System.out.println("Percorrendo:");
		    System.out.println("Aula " + aula);
		});
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa("Marco","Castellani");
		Pessoa pessoa2 = new Pessoa("Pedro","Fuin");
		pessoas.add(pessoa2);
		pessoas.add(pessoa);
		System.out.println(pessoas);
		
		
	}
}
