/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Command;

import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class Cuenta  implements IObservador{
    private int id;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int id, double saldo) {	
	this.id = id;
	this.saldo = saldo;
    }

    public void retirar(double monto) {
	this.saldo = this.saldo - monto;
        JOptionPane.showMessageDialog(null, "Cuenta: " + id + " Saldo despues del retiro: " + this.saldo);
	System.out.println("[COMANDO RETIRAR] Cuenta: " + id + " Saldo: " + this.saldo);
    }

    public void depositar(double monto) {
	this.saldo = this.saldo + monto;
        JOptionPane.showMessageDialog(null, "Cuenta: " + id + " Saldo despues del deposito: " + this.saldo);
	System.out.println("[COMANDO DEPOSITAR] Cuenta: " + id + " Saldo: " + this.saldo);
    }

    @Override
    public void update() {
        //Accion a realizar depues que se realizo la transaccion
        JOptionPane.showMessageDialog(null, " La Cuenta: " + id + "Realizo una Transacion por favor revise su coreo electronico para as detalles" );
        
    }
}
