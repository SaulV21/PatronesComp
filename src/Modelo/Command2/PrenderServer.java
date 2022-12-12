/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Command2;

/**
 *
 * @author Saul
 */
public class PrenderServer implements Command{
   private IServer servidor;

    public PrenderServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificaConex();
        servidor.prendete();
        servidor.guardaLog();
    }
     
}
