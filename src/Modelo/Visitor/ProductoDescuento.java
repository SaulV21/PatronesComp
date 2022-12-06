/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Visitor;

/**
 *
 * @author Saul
 */
public class ProductoDescuento implements Visitable{

    private double precio;
    
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
