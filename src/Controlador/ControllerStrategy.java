/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.Strategy.Multiplicar;
import Modelo.Strategy.OperacionAritmetica;
import Modelo.Strategy.Restar;
import Modelo.Strategy.Sumar;
import Vista.JFProductos;
import Vista.VistaMenu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author daysi
 */
public class ControllerStrategy {
    JFProductos vista;
    VistaMenu vistame;

    
ButtonGroup g1;
    public ControllerStrategy(JFProductos vista, VistaMenu vistame) {
        this.vista = vista;
        this.vistame = vistame;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    
  
    
    public void iniciarCommand(){
    vista.getBtnContinuar().addActionListener(l->verificar());
    vista.getBtntVolver().addActionListener(l->cerrar());
    
    }
 
private void verificar(){
 OperacionAritmetica context;
 int val1, val2;
 val1=Integer.parseInt(vista.getTxtNumero().getText());
 val2=Integer.parseInt(vista.getTxtcantidad().getText());
         context = new OperacionAritmetica( new Sumar() );
         int suma = context.procesar(val1, val2);
        context = new OperacionAritmetica( new Restar() );
        int resta = context.procesar(val1, val2);
        context = new OperacionAritmetica( new Multiplicar() );
        int multip = context.procesar(val1, val2);
        vista.getjTextArea1().setText("SUMA: "+suma+"\nRESTA: "+resta+"\nMULTIPLICACION: "+multip);
         System.out.println("Suma: " + suma );
        System.out.println("Resta: " + resta );
        System.out.println("Multiplicacion: " + multip );
}
    
    private void cerrar(){
    vista.dispose();
    vistame.setVisible(true);
    }
   
  
     
      public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (InterruptedException e) {
            System.out.println(e);
         }
    }   
    
}
