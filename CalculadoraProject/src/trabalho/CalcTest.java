package trabalho;

import pilha.Pilha;
import pilha.PilhaVetor;

public class CalcTest {
    public static double PilhaVetor(String exp) throws Exception {

        char[] tokens = exp.toCharArray();

        // Cria uma pilha vetor vazia
        Pilha<Double> stack = new PilhaVetor<>(exp.length());

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

//        1 2 - 4 5 + *
//        Expressão (1-2)*(4+5) = -9
//
//         
//
//        23 12 + 7 / 3 12 - 5 + *
//        Expressão ((23+12)/7)*(5+(3-12)) = -20
//
//         
//
//        5 1 2 + 4 * + 3 -
//        Expressão  5 + (1 + 2) × 4 – 3 = 14
//
//         
//
//        5.0 3 + 2 * 4 6 - /
//        Expressão (5.0 + 3) * 2 / (4 - 6) = -8.0    // Help
//        String exp = "1 2 - 4 5 + *";
//        String exp = "23 12 + 7 / 3 12 - 5 + *";
        String exp = "5 1 2 + 4 * + 3 -";
//        String exp = "5.0 3 + 2 * 4 6 - /";
        System.out.println(PilhaVetor(exp));
    }
}
