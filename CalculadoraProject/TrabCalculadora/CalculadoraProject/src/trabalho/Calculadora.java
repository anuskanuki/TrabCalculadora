package trabalho;

import Fila.Fila;
import Fila.FilaVetor;
import java.util.Arrays;
import pilha.Pilha;
import pilha.PilhaVetor;


public class Calculadora {

    private void inserir(String inserir, Fila<String> fila, byte tipo, Integer aberturas) {
        switch (tipo) {
            case 1:
                try {
                Double.parseDouble(inserir);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Expressão inválida");
            }
            break;
            case -1:
                return;
            case 2:
                if (inserir.trim().length() != 1) {
                    throw new RuntimeException("Expressão inválida");
                }
                break;
            case 3:
                if (inserir.contains("(") && inserir.contains(")")) {
                    throw new RuntimeException("Expressão inválida");
                } else if (inserir.contains("(")) {
                    aberturas += inserir.replace(" ", "").length();
                } else {
                    aberturas -= inserir.replace(" ", "").length();
                }

        }

        fila.inserir(inserir.replace(" ", ""));
    }

    public Fila<String> extrairTermos(String expresao) {
        byte tipo = -1;
        Integer aberturas = 0;
        String valor = "";
        Fila<String> termos = new FilaVetor<>(expresao.length());
        for (int i = 0; i < expresao.length(); i++) {
            if (expresao.charAt(i) >= '0' && expresao.charAt(i) <= '9' && (tipo != 1)) {
                inserir(valor, termos, tipo, aberturas);
                valor = "";
                tipo = 1;
            } else if (Arrays.asList('+', '-', '*', '/').contains(expresao.charAt(i)) && tipo != 2) {
                inserir(valor, termos, tipo, aberturas);
                valor = "";
                tipo = 2;
            } else if (expresao.charAt(i) == '(' || expresao.charAt(i) == ')' && tipo != 3) {
                inserir(valor, termos, tipo, aberturas);
                valor = "";
                if (tipo == 1) {
                    inserir("*", termos, (byte) 2, aberturas);
                }
                tipo = 3;
            }
            valor += expresao.charAt(i);
        }
        inserir(valor, termos, tipo, aberturas);
        System.out.println(termos.toString());
        if (aberturas != 0) {
            throw new RuntimeException("Expressão inválida");
        }
        return termos;
    }

    public Fila<String> gerarExprInfixada(Fila<String> exprInfixada) {
        return null;
    }

    public double gerarExprPosfixada(Fila<String> exprPosfixada) {
        return 0;
    }

    public static double CalcPilhaVetor(String exp) throws Exception {

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
}
