package ListOrdenaList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoEConta {
	
	public static void main(String[] args) {
		
		Banco bancodoBrasil = new Banco(1,150);
		
		bancodoBrasil.adicionaConta(new Conta("Marco Catellani", 22));
		bancodoBrasil.adicionaConta(new Conta("Beatriz", 33));
		bancodoBrasil.adicionaConta(new Conta("Pedro", 44));
		bancodoBrasil.adicionaConta(new Conta("Felipe", 55));
		bancodoBrasil.adicionaConta(new Conta("Mateus", 66));
		
		//bancodoBrasil.getContas();
		System.out.println(bancodoBrasil.getContas());
		
		
		List<Conta> contaImutavel = bancodoBrasil.getContas();
		System.out.println(contaImutavel);
		
		List<Conta> contasOrdenadas = new ArrayList<>(contaImutavel);
		System.out.println(contasOrdenadas);
		
		Collections.sort(contasOrdenadas);
		System.out.println(contasOrdenadas);

		
		
		//System.out.println(bancodoBrasil.toString());
}
}
