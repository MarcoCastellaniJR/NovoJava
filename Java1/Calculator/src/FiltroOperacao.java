
public class FiltroOperacao {

	
	public String filtro(String n) {
		int soma = n.indexOf('+');
		int sub = n.indexOf('-');
		int mult = n.indexOf('*');
		int div = n.indexOf('/');
		int totalDigitos = n.length();
		Dados calcular = new Dados();
	
		if (soma != -1) {
			String n1 = n.substring(0, soma);
			String n2 = n.substring(soma +1, totalDigitos);
			//System.out.println(n1);
			//System.out.println(n2);
			int p1 = Integer.parseInt(n1);
			int p2 = Integer.parseInt(n2);
			String l = calcular.calcular(p1, '+', p2);
			return l;
			
		}else if(sub != -1) {
			String n1 = n.substring(0, sub);
			String n2 = n.substring(sub +1, totalDigitos);
			//System.out.println(n1);
			//System.out.println(n2);
			int p1 = Integer.parseInt(n1);
			int p2 = Integer.parseInt(n2);
			String l = calcular.calcular(p1, '-', p2);
			return l;
		}else if(mult != -1) {
			String n1 = n.substring(0, mult);
			String n2 = n.substring(mult +1, totalDigitos);
			//System.out.println(n1);
			//System.out.println(n2);
			int p1 = Integer.parseInt(n1);
			int p2 = Integer.parseInt(n2);
			String l = calcular.calcular(p1, '*', p2);
			return l;
		}else if(div != -1) {
			String n1 = n.substring(0, div);
			String n2 = n.substring(div +1, totalDigitos);
			//System.out.println(n1);
			//System.out.println(n2);
			int p1 = Integer.parseInt(n1);
			int p2 = Integer.parseInt(n2);
			String l = calcular.calcular(p1, '/', p2);
			return l;
		}else {
			String l = "ERRO, NÃO ENCONTRADO OPERAÇÃO";
			return l;
		}
		
		
	}
}
