
public class Subtracao extends Dados{

	public String subtrair(int n1, int n2) {
		int resultado = n1 - n2;
		String volta = "Subtração de " + n1 + " - " + n2 + " = "+ resultado;
		return volta;
	}
}
