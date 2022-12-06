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
import java.text.DecimalFormat;

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
        vistav.getBtnNormal().addActionListener(l->precioNormal());
        vistav.getBtndescuento().addActionListener(l->precioDescuento());
        vistav.getBtnVolver().addActionListener(l->cerrar());
    }
    private void precioNormal(){

    ProductoNormal prod2=new ProductoNormal();
    prod2.setPrecio(Double.parseDouble(vistav.getTxtprecio().getText()));
    IVA iva=new IVA();
    DecimalFormat df = new DecimalFormat("#.00");
    double resultado2=prod2.accept(iva);
    vistav.getTxtmensaje().setText("\nPrecio Normal $"+df.format(resultado2));
    System.out.println(resultado2);
    }
    
    private void precioDescuento(){
    ProductoDescuento prod=new ProductoDescuento();
    prod.setPrecio(Double.parseDouble(vistav.getTxtprecio().getText()));
    DecimalFormat df = new DecimalFormat("#.00");
    IVA iva=new IVA();
    double resultado1=prod.accept(iva);
    vistav.getTxtmensaje().setText("\nPrecio con descuento $"+df.format(resultado1));
    System.out.println(resultado1);
    }
    
    
    private void cerrar(){
    vistav.dispose();
    vistame.setVisible(true);
    }
}
