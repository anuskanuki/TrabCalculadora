package pilha;

public class PilhaVetor<T> implements Pilha<T> {

    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.tamanho = 0;

        info = (T[]) new Object[limite];
    }

    @Override
    public void push(T info) {
        if (tamanho == limite) {
            throw new PilhaCheiaException("Tamanho da lista não é válido.");
        } else {
            this.info[tamanho] = info;
            tamanho++;
        }
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        } else {
            T valor;
            valor = info[tamanho - 1];
            info[tamanho - 1] = null;
            tamanho--;

            return valor;
        }
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        } else {
            return info[tamanho - 1];
        }
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        String resultado = "";

        for (int i = tamanho - 1; i >= 0; i--) {
            resultado += info[i];
            if (i > 0) {
                resultado = resultado + ",";
            }

        }
        return resultado;
    }

    public void concatenar(PilhaVetor<T> p) {
        for (int i = 0; i < p.tamanho; i++) {
            this.push(p.info[i]);
        }
    }

}
