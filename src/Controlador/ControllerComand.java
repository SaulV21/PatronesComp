/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Command1.ApagarServer;
import Modelo.Command1.Command;
import Modelo.Command1.EcuadorServer;
import Modelo.Command1.Invoker;
import Modelo.Command1.PeruServer;
import Modelo.Command1.PrenderServer;
import Vista.VistaCommand1;
import Vista.VistaMenu;

/**
 *
 * @author Saul
 */
public class ControllerComand {
    VistaMenu vistame;
    VistaCommand1 vista;
    
    
    public ControllerComand(VistaCommand1 vista, VistaMenu vistam) {
        this.vista=vista;
        this.vistame=vistam;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    
    public void iniciarCommand(){
    vista.getBtnEcuador().addActionListener(l->ecuador());
    vista.getBtnapEc().addActionListener(l->ecuadorap());
    vista.getBtnPeru().addActionListener(l->peru());
    vista.getBtnapPer().addActionListener(l->peruap());
    vista.getBtnReset().addActionListener(l->reset());
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
}
