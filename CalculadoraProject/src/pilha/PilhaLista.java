package pilha;

public class PilhaLista<T> implements Pilha<T> {

    private ElementoLista<T> head;

    @Override
    public void push(T v) {
        ElementoLista<T> novo = new ElementoLista<>();
        novo.setInfo(v);
        if (this.estaVazia()) {
            head = novo;
        } else {
            novo.setProx(head);
            head = novo;
        }
    }

    @Override
    public T pop() {
        T retorno = head.getInfo();
        if (this.estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        } else {
            head = head.getProx();
        }
        return retorno;
    }

    @Override
    public T peek() {
        T retorno = head.getInfo();
        if (this.estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        }
        return retorno;
    }

    @Override
    public boolean estaVazia() {
        return (head == null);
    }

    @Override
    public void liberar() {
        if (this.estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        } else {
            while (head != null) {
                head = head.getProx();
                head = null;
            }
        }
    }

    @Override
    public String toString() {
        String resultado = "[";
        ElementoLista<T> atual = head;
        while (atual != null) {
            resultado = resultado + atual.getInfo().toString();
            atual = atual.getProx();
            if (atual != null) {
                resultado += ", ";
            }
        }
        return resultado + "]";
    }
}
