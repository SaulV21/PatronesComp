/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Visitor;

/**
 *
 * @author Saul
 */
public class IVA implements Visitor{

    private final double impuestoNormal=1.15;
    private final double impuestoDescuento=0.99;
    @Override
    public double visit(ProductoNormal normal) {
        return normal.getPrecio()*impuestoNormal;
    }

    @Override
    public double visit(ProductoDescuento descuento) {
        return descuento.getPrecio()*impuestoDescuento;
    }
    
}
