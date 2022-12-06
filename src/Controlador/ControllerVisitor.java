/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Visitor.IVA;
import Modelo.Visitor.ProductoDescuento;
import Modelo.Visitor.ProductoNormal;
import Vista.VistaMediator;
import Vista.VistaMenu;
import Vista.VistaVisitor;

/**
 *
 * @author Saul
 */
public class ControllerVisitor {
    VistaMenu vistame;
    VistaVisitor vistav;
    public ControllerVisitor(VistaVisitor vista,VistaMenu vistame) {
        this.vistav=vista;
        this.vistame=vistame;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    public void iniciarVisitor(){
        
    }
    private void precio(){
    ProductoDescuento prod=new ProductoDescuento();
    prod.setPrecio(100);
    ProductoNormal prod2=new ProductoNormal();
    prod2.setPrecio(100);
    IVA iva=new IVA();
    double resultado1=prod.accept(iva);
    double resultado2=prod2.accept(iva);
    System.out.println(resultado1);
    System.out.println(resultado2);
    }
}
