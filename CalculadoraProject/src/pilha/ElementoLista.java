package pilha;

public class ElementoLista<T> {

    private T info;
    private ElementoLista<T> prox;

    @Override
    public String toString() {
        return (String) getInfo();
    }

    //Getters e Setters:
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public ElementoLista<T> getProx() {
        return prox;
    }

    public void setProx(ElementoLista<T> prox) {
        this.prox = prox;
    }

}
