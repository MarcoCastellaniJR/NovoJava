
public class Calcular {

	public static void main(String[] args) {
		
		Dados calc = new Dados();
		System.out.println(calc.calcular(10, '+', 10));
		System.out.println(calc.calcular(150, '-', 1110));
		System.out.println(calc.calcular(150, '/', 10));
		System.out.println(calc.calcular(150, '*', 10));
		System.out.println(calc.calcular(150, 'f', 10));
		
		FiltroOperacao calcular = new FiltroOperacao();
		String teste = "5000+10";
		String teste2 = "5000-10";
		String teste3 = "5000*10";
		String teste4 = "5000/10";
		String teste5 = "500010";
		
		System.out.println(calcular.filtro(teste));
		System.out.println(calcular.filtro(teste2));
		System.out.println(calcular.filtro(teste3));
		System.out.println(calcular.filtro(teste4));
		System.out.println(calcular.filtro(teste5));

	}

}
