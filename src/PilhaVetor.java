
public class PilhaVetor<T> implements Pilha<T> {
	private int n;
	private int tam;
	private T[] vet;

	public PilhaVetor(int tam) {
		this.tam = tam;
		this.n = 0;
		vet = (T[]) new Object[tam];
	}

	@Override
	public void push(T v) throws Exception {
		if (n < tam) {
			vet[n] = v;
			n++;
		} else {
			throw new PilhaException("Pilha cheia");
		}
	}

	@Override
	public T pop() {
		T result = vet[n - 1];
		if (vet[0] != null) {
			vet[n - 1] = null;
			n--;
		} else {
			throw new PilhaException("Pilha está vazia");
		}
		return result;
	}

	@Override
	public T peek() {
		if (vazia()) {
			return null;
		}
		return vet[n - 1];
	}

	@Override
	public boolean vazia() {
		return (n == 0);
	}

	@Override
	public void libera() {
		for (int i = 0; i < n; i++) {
			vet[i] = null;
		}
		n = 0;
	}

	public String imprime() {
		String retorno = "[";
		for (int i = 0; i < n; i++) {
			retorno += vet[i].toString() + ", ";
		}
		retorno += "]";
		return retorno;
	}

}
