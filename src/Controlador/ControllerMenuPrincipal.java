/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaCommand;
import Vista.VistaCommand1;
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
    VistaCommand1 vistac1;
    VistaMediator vistamed;
    VistaVisitor vistav;
    public ControllerMenuPrincipal(VistaMenu vista) {
        this.vistamenu = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    public void iniciar(){
        vistamenu.getBtnCommand().addActionListener(l->Command1());
        vistamenu.getBtnMediator().addActionListener(l->Mediator());
        vistamenu.getBtnSalir().addActionListener(l->salir());
        vistamenu.getBtnVisitor().addActionListener(l->Visitor());
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
    
     private void Command1(){
      vistac1 = new VistaCommand1();
      ControllerComand control= new ControllerComand(vistac1, vistamenu);
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
}
