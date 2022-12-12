/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Strategy;

/**
 *
 * @author Saul
 */
public class OperacionAritmetica {
    private InAritmetica strategy;
    // ----------------------------------
    public OperacionAritmetica(InAritmetica strategy) {
        this.strategy = strategy;
    }
    // ----------------------------------
     public int procesar(int a, int b) {
         return strategy.realizarOperacion(a, b);
    }
}
