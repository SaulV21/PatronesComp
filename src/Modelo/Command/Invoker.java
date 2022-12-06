/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saul
 */
public class Invoker {
    private List<IOperacion> operaciones = new ArrayList<>();

	public void recibirOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
	}

	public void realizarOperaciones() {
		this.operaciones.forEach(x -> x.execute());
		this.operaciones.clear();
	}

}
