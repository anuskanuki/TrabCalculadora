/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author gianc
 */
public class PilhaVaziaException extends RuntimeException {

    public PilhaVaziaException() {
        System.out.println("A pilha esta vazia");
    }
    
}
