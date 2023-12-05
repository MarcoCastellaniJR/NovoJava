import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Java8Aula_forEach {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Marco");
		palavras.add("Carlosi");
		palavras.add("Bea");
		Comparator comparador = new ComparadorPorTamanho();
		System.out.println(palavras);
		//Collections.sort(palavras,comparador);
		// ---- AGORA NO JAVA 8 NAO PRECISA CHAMAR O COLLECTIONS, 
		// ---- O PRIPRIO LIST TEM O SORT
		palavras.sort(comparador);
		System.out.println(palavras);
		//------------------------------------------------------
		for (String p : palavras) {
			System.out.println(p);
		}
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
		
		
		
		
		
		
		
	}
}


class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String arg0) {
		System.out.println(arg0);
		
	}
	
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) {
			return -1;
		} if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
	
}