/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.Strategy.Multiplicar;
import Modelo.Strategy.OperacionAritmetica;
import Modelo.Strategy.Orden;
import Modelo.Strategy.PayPal;
import Modelo.Strategy.PayStrategy;
import Modelo.Strategy.Restar;
import Modelo.Strategy.Sumar;
import Modelo.Strategy.TarjetaCredito;
import Vista.JFProductos;
import Vista.VistaMenu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author daysi
 */
public class ControllerStrategy {
    JFProductos vista;
    VistaMenu vistame;
    JRadioButton r1,r2,r3,r4;
    ControllerStrategy ce;
    
ButtonGroup g1;
    public ControllerStrategy(JFProductos vista, VistaMenu vistame) {
        this.vista = vista;
        this.vistame = vistame;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    
       private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Orden order = new Orden();
    private static PayStrategy strategy;
     static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
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
      String [] botones={"SI","NO"};
           String [] pago={"Paypal","TarjetaCredito"};
            String [] op={"Pagar","Continuar"};
          int x=0;
          int count;
           public void Inicio() {
              
               while (!order.isClosed()) {
                   
                   int cost;
                   int choice = 0;
                   int continueChoice;
                   do {
                       
                       System.out.print("Please, select a product:" + "\n" +
                               "1 - Mother board" + "\n" +
                               "2 - CPU" + "\n" +
                               "3 - HDD" + "\n" +
                               "4 - Memory" + "\n");
                       System.out.println("    Seleccione una opcion");
                       //choice = Integer.parseInt(reader.readLine());
                       
                       int  numdigitar=Integer.parseInt(vista.getTxtNumero().getText());
                       cost = priceOnProducts.get(numdigitar);
                       System.out.print("Cantidad: ");
                       //count = Integer.parseInt(reader.readLine());
                       int  numc=Integer.parseInt(vista.getTxtcantidad().getText());
                       order.setTotalCost(cost*numc);
                       
                        x = JOptionPane.showOptionDialog(null, "¿Desea continuar seleccionando productos?","Opcion",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
                       
                       System.out.print("Desea seguir selecionando? Y/N: ");
                       
                       //continueChoice = Integer.parseInt(x.);
                   } while (x!=1);
                   
                   if (strategy == null) {
                       
                       x=JOptionPane.showOptionDialog(null, "¿Seleccione metodo de pago?","Opcion",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,pago,pago[0]);
                      
                              
                       
                       
                       // Client creates different strategies based on input from user,
                       // application configuration, etc.
                       if (x==0) {
                         
                           
                           String correo =JOptionPane.showInputDialog(null,"Escriba su correo","Dialogo",JOptionPane.QUESTION_MESSAGE);
                           String contraseña =JOptionPane.showInputDialog(null,"Escriba su contraseña","Dialogo",JOptionPane.QUESTION_MESSAGE);
                           strategy = new PayPal();
                           JOptionPane.showMessageDialog(null, " Realizo su transaccion con exito" );
                       } else {
                           
                           String numt =JOptionPane.showInputDialog(null,"Numero de Tarjeta","Dialogo",JOptionPane.QUESTION_MESSAGE);
                           String expedicion =JOptionPane.showInputDialog(null,"Fecha de Expiracion de Tarjeta","Dialogo",JOptionPane.QUESTION_MESSAGE);
                           String cvv =JOptionPane.showInputDialog(null,"Escriba CVV","Dialogo",JOptionPane.QUESTION_MESSAGE);
                           strategy = new TarjetaCredito();
                           JOptionPane.showMessageDialog(null, " Realizo su transaccion con exito" );
                           
                       }
                       
                          
                   }
                   order.processOrder(strategy);
                   x=JOptionPane.showOptionDialog(null, "¿Desea pagar ?"+ order.getTotalCost()+"o Continuar","Opcion",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,op,op[0]);
                  // System.out.print("Pay " + order.getTotalCost() + " Continuar O pagar? P/C: ");
                   
                   if (x==0) {
                       // Finally, strategy handles the payment.
                       if (strategy.pay(order.getTotalCost())) {
                           JOptionPane.showMessageDialog(null, " Realizo su transaccion con exito" );
                           
                       } else {
                           JOptionPane.showMessageDialog(null, " Compruebe los datos" );
                       }
                       order.setClosed();
                       
                   }
                   
                 
                
                   
               }
        
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
