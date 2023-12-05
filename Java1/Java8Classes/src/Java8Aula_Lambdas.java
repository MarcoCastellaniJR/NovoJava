import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8Aula_Lambdas {
	public static void main(String[] args) {
		// --- ESSE CASO É UMA CLASSE ANONIMA, ONDE VOCÊ JA JOGA O CONSTRUTOR E TUDO QUE
		// USARIA
		// PARA CRIAR UMA NOVA CLASSE, DENTRO DO ARGUMENTO
		// --- É INDICADO PARA QUANDO NÃO VAI TER NECESSIDADE DE REUTILIZAR O CÓDIGO
		List<String> palavras = new ArrayList<String>();
		palavras.add("Marco");
		palavras.add("Carlosi");
		palavras.add("Bea");
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);

			}

		}); // o codigo acima pode ser evitado usando apenas o lambda

		//ja é metodo lambda
		palavras.forEach((String s) -> {
			System.out.println(s);
		});
		
		// lambda mais resumido ainda, caso só tenha um argumento e só tenha uma linha de retorno
		palavras.forEach(s -> System.out.println(s));

		
		// metodo lambda criado a partir ca classe criada anteriormente, que vai ser reduzido
		palavras.sort((String s1, String s2) -> {
			if(s1.length() < s2.length()) {
				return -1;
			} if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});
		// lambda bem resumido do mesmo metodo acima, onde se usa o metodo compare de integer
		//que ja retorna os valores escolhidos acima, para assim simplificar o codigo
		palavras.sort((s1,s2)-> Integer.compare(s1.length(), s2.length()));
		
		
		
		
		
	}
}
