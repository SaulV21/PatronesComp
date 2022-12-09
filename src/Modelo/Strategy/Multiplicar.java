/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Strategy;

/**
 *
 * @author Saul
 */
public class Multiplicar implements IAritmetica{

    public Multiplicar() {
    }

    @Override
    public int realizarOperacion(int a, int b) {
        return a*b;
    }
    
}
