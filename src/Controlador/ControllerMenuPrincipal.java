/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.JFProductos;
import Vista.VistaCommand;
import Vista.VistaMediator;
import Vista.VistaMenu;
import Vista.VistaVisitor;

/**
 *
 * @author Saul
 */
public class ControllerMenuPrincipal {
    VistaMenu vistamenu;
    VistaCommand vistac;
    VistaMediator vistamed;
    VistaVisitor vistav;
    JFProductos jfproducto;
    
    public ControllerMenuPrincipal(VistaMenu vista) {
        this.vistamenu = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    public void iniciar(){
        vistamenu.getBtnCommand().addActionListener(l->Command());
        vistamenu.getBtnMediator().addActionListener(l->Mediator());
        vistamenu.getBtnSalir().addActionListener(l->salir());
        vistamenu.getBtnVisitor().addActionListener(l->Visitor());
         vistamenu.getBtnStrategy().addActionListener(l->StrateGy());
        
    }

    private void salir() {
       vistamenu.dispose();
    }
    
    private void Command(){
      vistac = new VistaCommand();
      Controller_Command control= new Controller_Command(vistac, vistamenu);
      control.iniciarCommand();
      this.vistamenu.setVisible(false);
    }
    
    private void Mediator(){
      vistamed = new VistaMediator();
      ControllerMediator control= new ControllerMediator (vistamed, vistamenu);
      control.iniciarMediator();
      this.vistamenu.setVisible(false);
    }
    
     private void Visitor(){
      vistav = new VistaVisitor();
      ControllerVisitor control= new ControllerVisitor (vistav, vistamenu);
      control.iniciarVisitor();
      this.vistamenu.setVisible(false);
    }
      private void StrateGy(){
      jfproducto = new JFProductos();
     
      ControllerStrategy control = new ControllerStrategy(jfproducto,vistamenu);
      control.iniciarCommand();
      this.vistamenu.setVisible(false);
    }
    
}
