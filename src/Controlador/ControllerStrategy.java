/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Vista.JFProductos;
import Modelo.Command.Cuenta;
import Modelo.Command.DepositarImpl;
import Modelo.Command.Invoker;
import Modelo.Command.RetirarImpl;
import Modelo.Strategy.Orden;
import Modelo.Strategy.PayPal;
import Modelo.Strategy.PayStrategy;
import Modelo.Strategy.TarjetaCredito;
import Vista.JFProductos;
import Vista.VistaCommand;
import Vista.VistaMenu;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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
    vista.getBtnContinuar().addActionListener(l->Inicio());
    vista.getBtntVolver().addActionListener(l->cerrar());
    
    }
 

      String [] botones={"SI","NO"};
           String [] pago={"Paypal","TrjetaCredito"};
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
                       System.out.println("    Seleecione una opcion");
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
                       
                       x=JOptionPane.showOptionDialog(null, "¿Seleccione metodo de pgo?","Opcion",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,pago,pago[0]);
                      
                              
                       
                       
                       // Client creates different strategies based on input from user,
                       // application configuration, etc.
                       if (x==0) {
                         
                           
                           String correo =JOptionPane.showInputDialog(null,"Escriba su correo","Dialogo",JOptionPane.QUESTION_MESSAGE);
                           String contraseña =JOptionPane.showInputDialog(null,"Escriba su contraseña","Dialogo",JOptionPane.QUESTION_MESSAGE);
                           strategy = new PayPal();
                           JOptionPane.showMessageDialog(null, " Realizo su transaccion con exito" );
                       } else {
                           
                           String numt =JOptionPane.showInputDialog(null,"Numero de Trajeta","Dialogo",JOptionPane.QUESTION_MESSAGE);
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
