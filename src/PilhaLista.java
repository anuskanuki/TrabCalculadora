
public class PilhaLista<T> implements Pilha<T> {
	private ElementoLista<T> head;

	@Override
	public void push(T v) {
		ElementoLista<T> novo = new ElementoLista<>();
		novo.setInfo(v);
		if (this.vazia()) {
			head = novo;
		} else {
			novo.setProx(head);
			head = novo;
		}
	}

	@Override
	public T pop() {
		T retorno = head.getInfo();
		if (this.vazia()) {
			throw new PilhaException("Pilha está vazia");
		} else {
			head = head.getProx();
		}
		return retorno;
	}

	@Override
	public T peek() {
		T retorno = head.getInfo();
		if (this.vazia()) {
			throw new PilhaException("Pilha está vazia");
		}
		return retorno;
	}

	@Override
	public boolean vazia() {
		return (head == null);
	}

	@Override
	public void libera() {
		if (this.vazia()) {
			throw new PilhaException("Pilha já está vazia");
		} else {
			while (head != null) {
				head = head.getProx();
				head = null;
			}
		}

	}

	@Override
	public String imprime() {
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