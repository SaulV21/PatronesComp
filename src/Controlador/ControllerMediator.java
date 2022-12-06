/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mediator.SalondeChat;
import Modelo.Mediator.Usuario;
import Vista.VistaMediator;
import Vista.VistaMenu;

/**
 *
 * @author Saul
 */
public class ControllerMediator {

    VistaMediator vista;
    VistaMenu vistame;
    SalondeChat s=new SalondeChat();
    public ControllerMediator(VistaMediator vista,VistaMenu vistam) {
        this.vista=vista;
        this.vistame=vistam;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
     public void iniciarMediator(){
     vista.getBtnEnviar1().addActionListener(l->mensaje1());
     vista.getBtnenviar2().addActionListener(l->mensaje2());
     vista.getBtnVolver().addActionListener(l->cerrar());
     }
    private void mensaje1(){
    Usuario u=new Usuario(s);
    u.setNombre(vista.getTxtuser1().getText());
    s.registra(u);
    u.envia(vista.getTxtuser1().getText(),vista.getTxtMensaje1().getText());
    vista.getTxtMensaje1().setText("");
    }
    private void mensaje2(){
    Usuario u2=new Usuario(s);
    u2.setNombre(vista.getTxtuser2().getText());
    s.registra(u2);
    u2.envia(vista.getTxtuser2().getText(),vista.getTxtMensaje2().getText());
    vista.getTxtMensaje2().setText("");
    }
    private void cerrar(){
    vista.dispose();
    vistame.setVisible(true);
    }
}
