/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaCommand;
import Vista.VistaMediator;
import Vista.VistaMenu;

/**
 *
 * @author Saul
 */
public class ControllerMenuPrincipal {
    VistaMenu vistamenu;
    VistaCommand vistac;
    VistaMediator vistamed;
    public ControllerMenuPrincipal(VistaMenu vista) {
        this.vistamenu = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    public void iniciar(){
        vistamenu.getBtnCommand().addActionListener(l->Command());
        vistamenu.getBtnMediator().addActionListener(l->Mediator());
        vistamenu.getBtnSalir().addActionListener(l->salir());
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
}
