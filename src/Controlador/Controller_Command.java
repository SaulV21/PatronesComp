/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Command.Cuenta;
import Modelo.Command.DepositarImpl;
import Modelo.Command.Invoker;
import Modelo.Command.RetirarImpl;
import Vista.VistaCommand;
import Vista.VistaMenu;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Saul
 */
public class Controller_Command {
    VistaCommand vista;
    VistaMenu vistame;
    
    public Controller_Command(VistaCommand vista, VistaMenu vistam) {
        this.vista=vista;
        this.vistame=vistam;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    public void iniciarCommand(){
    vista.getBtncrear().addActionListener(l->ingresarcuenta());
    vista.getBtnVolver().addActionListener(l->cerrar());
    verificuenta(vista.getTxtnumcuenta());
    verifimonto(vista.getTxtmonto());
    }
    
    private void verificuenta(JTextField cuent){
         cuent.addKeyListener(new java.awt.event.KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {
             char num = e.getKeyChar();
            if(vista.getTxtnumcuenta().getText().length()>9) e.consume();
            if((num<'0' || num>'9')) e.consume(); }
             @Override
             public void keyPressed(KeyEvent e) {}
             @Override
             public void keyReleased(KeyEvent e) {}
         });
     }
    
    private void verifimonto(JTextField mont){
         mont.addKeyListener(new java.awt.event.KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {
             char num = e.getKeyChar();
            if(vista.getTxtmonto().getText().length()>9) e.consume();
            if((num<'0' || num>'9')) e.consume(); }
             @Override
             public void keyPressed(KeyEvent e) {}
             @Override
             public void keyReleased(KeyEvent e) {}
         });
     }
    private void cerrar(){
    vista.dispose();
    vistame.setVisible(true);
    }
     private void ingresarcuenta(){
        int numc;
        double monto;
        numc=Integer.parseInt(vista.getTxtnumcuenta().getText());
        monto=Double.parseDouble(vista.getTxtmonto().getText());
        Cuenta cuenta = new Cuenta(numc, monto);
        Invoker ivk = new Invoker();
        vista.getTxtSaldo().setText("Cuenta Nº: "+numc+" creada con un saldo de $"+monto);
         double dep = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el saldo a depositar:"));
        DepositarImpl opDepositar = new DepositarImpl(cuenta, dep);
        ivk.recibirOperacion(opDepositar);
        ivk.realizarOperaciones();
        double ret = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el saldo a retirar:"));
        RetirarImpl opRetirar = new RetirarImpl(cuenta, ret);
        ivk.recibirOperacion(opRetirar);
        ivk.realizarOperaciones();
        esperar(3);
        vista.getTxtmonto().setText("");
        vista.getTxtnumcuenta().setText("");
        vista.getTxtSaldo().setText("");
     }
     
  
     
      public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (InterruptedException e) {
            System.out.println(e);
         }
    }   
}
