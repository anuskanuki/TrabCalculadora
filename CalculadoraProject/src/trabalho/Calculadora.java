package trabalho;

import Fila.Fila;
import Fila.FilaVetor;
import java.util.Arrays;

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
}
