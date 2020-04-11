package Fila;

public class FilaVetor<T> implements Fila<T> {

    private T[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.tamanho = 0;
        this.limite = limite;
        info = (T[]) new Object[limite];
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException("A fila está cheia.");
        }
        int fim;
        fim = (inicio + tamanho) % limite;
        info[fim] = valor;
        tamanho += 1;
    }

    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new FilaVaziaException("A fila está vazia.");
        }
        T valor;
        valor = info[inicio];
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho -= 1;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException("A fila está vazia.");
        }
        return info[inicio];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            retirar();
        }
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> novo = new FilaVetor<>(this.limite + f2.limite);
        copiaDados(this, novo);
        copiaDados(f2, novo);

        return novo;
    }

    private void copiaDados(FilaVetor<T> origem, FilaVetor<T> destino) {
        int posicaoInicial = origem.inicio;
        for (int i = 0; i < origem.tamanho; i++) {
            destino.inserir(origem.info[posicaoInicial]);
            posicaoInicial = (posicaoInicial + 1) % origem.limite;
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        int indice;
        for (int i = 0; i < tamanho; i++) {
            indice = (i + inicio) % limite;
            if (i > 0) {
                resultado += ",";
            }
            resultado = resultado + info[indice];
        }
        return resultado;
    }

    public int getLimite() {
        return this.limite;
    }
}
