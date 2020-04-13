
public class ElementoLista<T> {
	private T Info;
	private ElementoLista<T> prox;

	public T getInfo() {
		return Info;
	}

	public void setInfo(T info) {
		Info = info;
	}

	public ElementoLista<T> getProx() {
		return prox;
	}

	public void setProx(ElementoLista<T> prox) {
		this.prox = prox;
	}

	public String toString() {
		return (String) getInfo();
	}
}
