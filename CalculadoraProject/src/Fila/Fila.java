/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/**
 *
 * @author gianc
 */
public interface Fila<T> {
    public void inserir(T valor);
    public T retirar();
    public T peek();
    public boolean estaVazia();
    public void liberar();
}
