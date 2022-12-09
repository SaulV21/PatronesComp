/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Command1;

/**
 *
 * @author Saul
 */
public class ResetServer implements  Command{

    private IServer servidor;

    public ResetServer(IServer servidor) {
        this.servidor = servidor;
    }
    
    @Override
    public void execute() {
       servidor.conectate();
       servidor.verificaConex();
       servidor.guardaLog();
       servidor.apagate();
       servidor.prendete();
       servidor.guardaLog();
       servidor.cerraConex();
    }
    
}
