/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronescomp;

import Controlador.ControllerMenuPrincipal;
import Modelo.Command.Cuenta;
import Modelo.Command.DepositarImpl;
import Modelo.Command.Invoker;
import Modelo.Command.RetirarImpl;
import Vista.VistaMenu;

/**
 *
 * @author Saul
 */
public class PatronesComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Cuenta cuenta = new Cuenta(1, 500);

            DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
            RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

            Invoker ivk = new Invoker();
            ivk.recibirOperacion(opDepositar);
            ivk.recibirOperacion(opRetirar);

            ivk.realizarOperaciones();*/
    VistaMenu vista = new VistaMenu();
    ControllerMenuPrincipal control= new ControllerMenuPrincipal(vista);
    control.iniciar();
    }
    
}
