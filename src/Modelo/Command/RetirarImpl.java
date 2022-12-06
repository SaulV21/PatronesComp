/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Command;

/**
 *
 * @author Saul
 */
public class RetirarImpl implements IOperacion {

	private Cuenta cuenta;
	private double monto;

	public RetirarImpl(Cuenta cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	@Override
	public void execute() {
		this.cuenta.retirar(this.monto);
	}

}