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

//
//public class PilhaLista<T> implements Pilha<T> {//Trabalha a pilha por LISTA ENCADEADA - navego usando ponteiros de proximo elemento 
//
//    private ElementoLista< T> topo;
//    private int tam;
//
//    @Override
//    public String toString() {
//        String aux = "";
//        for (int i = tam; i > 0; i--) {
//            aux = (String) peek() + ",";
//        }
//        return aux.substring(0, aux.length() - 1);
//    }
//
//    @Override
//    public void push(T elementoNo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public T pop() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public T peek() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean vazia() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void libera() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//}
