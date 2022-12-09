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
public class Invoker implements IObservable {

    private List<IOperacion> operaciones = new ArrayList<>();
    public ArrayList<IObservador> observadores;

    public void recibirOperacion(IOperacion operacion) {
        this.operaciones.add(operacion);
    }

    public void realizarOperaciones() {
        this.operaciones.forEach(x -> x.execute());
        this.operaciones.clear();
    }

   
    public Invoker() {
        observadores = new ArrayList<IObservador>();
    }

    public void depositarTransaccion() {
        notificar();
    }
 public void enlazarObservador(IObservador ob) {
        observadores.add(ob);
    }
    @Override
    public void notificar() {
        for (IObservador o : observadores) {
            o.update();
        }
    }

}
