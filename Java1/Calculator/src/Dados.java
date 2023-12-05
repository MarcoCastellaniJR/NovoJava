public class Dados {
	public int n1,n2;
	char value;
	public String calcular(int n1,char value, int n2) {
		if(value == '+') {
			Soma som = new Soma();
			String p = som.somatoria(n1, n2);
			return p;
		}else if( value == '-') {
			Subtracao sub = new Subtracao();
			String p = sub.subtrair(n1, n2);
			return p;
		}else if (value == '/') {
			Divisao div = new Divisao();
			String p = div.dividir(n1, n2);
			return p;
		}else if(value == '*') {
			Multiplicacao mult = new Multiplicacao();
			String p = mult.multi(n1, n2);
			return p;
		}else {
			String n = "Operação não encontrada";
			return n;
		}
	}
}
