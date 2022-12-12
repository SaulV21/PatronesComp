/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Command2;

/**
 *
 * @author Saul
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    /*eL invocador, es una clase que simplemente llamA al método execute:*/
    public void run(){
    command.execute();
    }
}
