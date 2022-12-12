/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Command2.ApagarServer;
import Modelo.Command2.Command;
import Modelo.Command2.EcuadorServer;
import Modelo.Command2.Invoker;
import Modelo.Command2.PeruServer;
import Modelo.Command2.PrenderServer;
import Vista.VistaCommand2;
import Vista.VistaMenu;

/**
 *
 * @author Saul
 */
public class ControllerCommand2 {
   VistaMenu vistame;
   VistaCommand2 vista;
    
    
    public ControllerCommand2(VistaCommand2 vista, VistaMenu vistam) {
        this.vista=vista;
        this.vistame=vistam;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    
    public void iniciarCommand(){
    vista.getBtnOnEc().addActionListener(l->ecuador());
    vista.getBtnOffEc().addActionListener(l->ecuadorap());
    vista.getBtnOnPeru().addActionListener(l->peru());
    vista.getBtnOffPer().addActionListener(l->peruap());
    vista.getBtnReset().addActionListener(l->reset());
    vista.getBtnVolver().addActionListener(l->cerrar());
    }

    private void ecuador(){
    Command command=new PrenderServer(new EcuadorServer());
    Invoker serv=new Invoker(command);
    serv.run();
    }
    private void ecuadorap(){
    Command command=new ApagarServer(new EcuadorServer());
    Invoker serv=new Invoker(command);
    serv.run();
    }
    private void peru(){
    Command command=new PrenderServer(new PeruServer());
    Invoker serv=new Invoker(command);
    serv.run();
    }
    private void peruap(){
    Command command=new ApagarServer(new PeruServer());
    Invoker serv=new Invoker(command);
    serv.run();
    }
    private void reset(){
    Command command=new ApagarServer(new EcuadorServer());
    Command command2=new ApagarServer(new PeruServer());
    Invoker serv1=new Invoker(command);
    Invoker serv2=new Invoker(command2);
    serv1.run();
    serv2.run();
    } 
    private void cerrar(){
    vista.dispose();
    vistame.setVisible(true);
    }
}
