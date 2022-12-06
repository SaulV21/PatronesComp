/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.Visitor;

/**
 *
 * @author Saul
 */
public interface Visitor {
    public double visit(ProductoNormal normal);
    public double visit(ProductoDescuento descuento);
}
