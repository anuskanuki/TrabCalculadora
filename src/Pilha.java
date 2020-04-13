
public interface Pilha<T> {

	// Métodos
	void push(T v) throws Exception;

	T pop() throws Exception;

	T peek();

	boolean vazia();

	void libera();

	String imprime();

}
