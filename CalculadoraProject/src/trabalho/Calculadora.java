package trabalho;

import pilha.Pilha;
import pilha.PilhaVetor;
import pilha.PilhaLista;

public class Calculadora {

    public static Double Vetor(String exp) throws Exception {

        char[] tokens = exp.toCharArray();

        // Cria uma pilha vetor vazia
        Pilha<Double> pilha = new PilhaVetor<>(exp.length());
        // Pilha<Integer> stack = new PilhaLista<>(exp.length());

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i] == ' ') {
                continue;
            }

            // Se for um número, adiciona na pilhaVetor
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder sbud = new StringBuilder();
                // Se for um número com mais de uma casa
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.') {
                    sbud.append(tokens[i++]);
                }
                pilha.push(Double.parseDouble(sbud.toString()));
            } // Se for um operador
            else {

                // Tirar dois valores
                double x = pilha.pop();
                double y = pilha.pop();

                // Faz a operação, e adiciona na pilhaVetor
                switch (exp.charAt(i)) {
                    case '+':
                        pilha.push(y + x);
                        break;
                    case '-':
                        pilha.push(y - x);
                        break;
                    case '*':
                        pilha.push(y * x);
                        break;
                    case '/':
                        pilha.push(y / x);
                        break;
                    default:
                        break;
                }
            }
        }

        // resultado da expressão
        return pilha.pop();
    }

    public static Double Lista(String exp) throws Exception {

        char[] tokens = exp.toCharArray();

        // Cria uma pilha lista vazia
        Pilha<Double> stack = new PilhaLista<>();
        // Pilha<Integer> stack = new PilhaLista<>(exp.length());

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i] == ' ') {
                continue;
            }

            // Se for um número, adiciona na pilhaVetor
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder sbud = new StringBuilder();
                // Se for um número com mais de uma casa
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.') {
                    sbud.append(tokens[i++]);
                }
                stack.push(Double.parseDouble(sbud.toString()));
            } // Se for um operador
            else {

                // Tirar dois valores
                double x = stack.pop();
                double y = stack.pop();

                // Faz a operação, e adiciona na pilhaVetor
                switch (exp.charAt(i)) {
                    case '+':
                        stack.push(y + x);
                        break;
                    case '-':
                        stack.push(y - x);
                        break;
                    case '*':
                        stack.push(y * x);
                        break;
                    case '/':
                        stack.push(y / x);
                        break;
                    default:
                        break;
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
        String exp4 = "5.0 3 + 2 * 4 6 - /";
        System.out.println("PilhaVetor = " + Vetor(exp1) + " " + Vetor(exp2) + "  " + Vetor(exp3) + "  " + Vetor(exp4)/*+Vetor(exp4)*/);
        System.out.println("PilhaLista = " + Lista(exp1) + " " + Lista(exp2) + "  " + Lista(exp3) + "  " + Lista(exp4)/*+Lista(exp4)*/);
    }
}
