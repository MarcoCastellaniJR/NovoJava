import java.util.List;
import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		int [] idades = new int[5];
		idades[0] = 14;
		idades[1] = 15;
		idades[2] = 16;
		idades[3] = 17;
		idades[4] = 18;
		int n = idades[3];
		System.out.println(n);
		
		List<Conta> teste = new ArrayList<>();
		Conta conta1 = new Conta(10,25);
		Conta conta2 = new Conta(10,26);
		
		teste.add(conta1);
		teste.add(conta2);
		
		Conta ref = teste.get(1);
		
		System.out.println(ref.getConta());
		
		// NESSE CASO NÃO ERA PARA FUNCIONAR, NÃO SE PODE ADICIONAR UM PRIMITIVO DENTRO DE UMA LIST
		// MAS O JAVA POR BAIXO DOS PANOS TRANSFORMA O INT EM INTEGER
		List numeros = new ArrayList();
		int num = 15;
		numeros.add(num);
		
		
		
		
	}
}
