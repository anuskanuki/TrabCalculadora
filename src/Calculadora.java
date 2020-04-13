//Fazer a interface
//Fazer exceptions quando não há operandos suficientes para realizar a soma (1 2 + -)
//Quando faltou algum operador para usar todos os elementos da expressão ( 1 2 3 /)



class Calculadora {

	public static int Vetor(String exp) throws Exception {

		char[] tokens = exp.toCharArray();

		// Cria uma pilha vetor vazia
		Pilha<Integer> pilha = new PilhaVetor<>(exp.length());
		// Pilha<Integer> stack = new PilhaLista<>(exp.length());

		for (int i = 0; i < tokens.length; i++) {

			if (tokens[i] == ' ')
				continue;

			// Se for um número, adiciona na pilhaVetor
			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sbuf = new StringBuffer();
				// Se for um número com mais de uma casa
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				pilha.push(Integer.parseInt(sbuf.toString()));
			}

			// Se for um operador
			else {

				// Tirar dois valores
				int x = pilha.pop();
				int y = pilha.pop();

				// Faz a operação, e adiciona na pilhaVetor
				if (exp.charAt(i) == '+') {
					pilha.push(y + x);
				} else if (exp.charAt(i) == '-') {
					pilha.push(y - x);
				} else if (exp.charAt(i) == '*') {
					pilha.push(y * x);
				} else if (exp.charAt(i) == '/') {
					pilha.push(y / x);
				}
			}
		}

		// resultado da expressão
		return pilha.pop();
	}
	
	public static int Lista(String exp) throws Exception {

		char[] tokens = exp.toCharArray();

		// Cria uma pilha vetor vazia
		Pilha<Integer> stack = new PilhaLista<>();
		// Pilha<Integer> stack = new PilhaLista<>(exp.length());

		for (int i = 0; i < tokens.length; i++) {

			if (tokens[i] == ' ')
				continue;

			// Se for um número, adiciona na pilhaVetor
			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sbuf = new StringBuffer();
				// Se for um número com mais de uma casa
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				stack.push(Integer.parseInt(sbuf.toString()));
			}

			// Se for um operador
			else {

				// Tirar dois valores
				int x = stack.pop();
				int y = stack.pop();

				// Faz a operação, e adiciona na pilhaVetor
				if (exp.charAt(i) == '+') {
					stack.push(y + x);
				} else if (exp.charAt(i) == '-') {
					stack.push(y - x);
				} else if (exp.charAt(i) == '*') {
					stack.push(y * x);
				} else if (exp.charAt(i) == '/') {
					stack.push(y / x);
				}
			}
		}

		// resultado da expressão
		return stack.pop();
	}

	public static void main(String[] args) throws Exception {

//		Expressão (1-2)*(4+5) = -9
		String exp1 = "1 2 - 4 5 + *";

//		Expressão ((23+12)/7)*(5+(3-12)) = -20
		String exp2 = "23 12 + 7 / 3 12 - 5 + *";

//		Expressão  5 + (1 + 2) × 4 – 3 = 14
		String exp3 = "5 1 2 + 4 * + 3 -";

//		Expressão (5.0 + 3) * 2 / (4 - 6) = -8.0    // HELP !!!!!!!!!!!
//		String exp4 = "5.0 3 + 2 * 4 6 - /";

		System.out.println("PilhaVetor = "+Vetor(exp1)+" "+Vetor(exp2)+"  "+Vetor(exp3)/*+Vetor(exp4)*/);
		System.out.println("PilhaLista = "+Lista(exp1)+" "+Lista(exp2)+"  "+Lista(exp3)/*+Lista(exp4)*/);
	}
}